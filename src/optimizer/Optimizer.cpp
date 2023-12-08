#include "Optimizer.h"

// New PassBuilder
#include "llvm/Passes/PassBuilder.h"

// New Passes
#include "llvm/Passes/StandardInstrumentations.h"
#include "llvm/Transforms/InstCombine/InstCombine.h"
#include "llvm/Transforms/Scalar/GVN.h"
#include "llvm/Transforms/Scalar/Reassociate.h"
#include "llvm/Transforms/Scalar/SimplifyCFG.h"
#include "llvm/Transforms/Utils/Mem2Reg.h"

// P5 passes
#include "llvm/Transforms/Scalar/LICM.h"
#include "llvm/Transforms/Scalar/LoopDeletion.h"
#include "llvm/Transforms/Scalar/LoopUnrollPass.h"
#include "llvm/Transforms/Scalar/LoopBoundSplit.h"
#include "llvm/Transforms/Scalar/LoopUnrollAndJamPass.h"
#include "llvm/Transforms/Scalar/LoopFlatten.h"
#include "llvm/Transforms/Scalar/JumpThreading.h"
#include "llvm/Transforms/Scalar/DivRemPairs.h"
#include "llvm/Transforms/Scalar/IndVarSimplify.h"

// For logging
#include "loguru.hpp"

namespace { // Anonymous namespace for local function
	    
bool contains(Optimization o, llvm::cl::list<Optimization> &l) {
  for (unsigned i = 0; i != l.size(); ++i) {
    if (o == l[i]) return true;
  }
  return false;
}

}

//  NOTE:
//  We must use llvm Adaptors to run per-loop passes in the function pass
//  manager. In LLVM14+, The hierarchy for code sections is : Module -> (CGSCC)*
//  -> Functions -> Loops
//
//  [*] is optional.
//
//  eg: To run a loop pass on a module ->
//  ModulePassManager.add(functionAdaptor(LoopAdaptor(llvm::LoopPass())))

void Optimizer::optimize(llvm::Module *theModule, 
		llvm::cl::list<Optimization> &enabledOpts) {
  LOG_S(1) << "Optimizing program " << theModule->getName().str();

  // New pass builder

  llvm::PassBuilder passBuilder;

  // Setting-up Analysis Managers

  llvm::FunctionAnalysisManager functionAnalysisManager;
  llvm::ModuleAnalysisManager moduleAnalysisManager;
  llvm::LoopAnalysisManager loopAnalysisManager;
  llvm::CGSCCAnalysisManager cgsccAnalysisManager;

  // Registering the analysis managers with the pass builder

  passBuilder.registerModuleAnalyses(moduleAnalysisManager);
  passBuilder.registerCGSCCAnalyses(cgsccAnalysisManager);
  passBuilder.registerFunctionAnalyses(functionAnalysisManager);
  passBuilder.registerLoopAnalyses(loopAnalysisManager);
  // Cross Register Proxies
  passBuilder.crossRegisterProxies(loopAnalysisManager, functionAnalysisManager,
                                   cgsccAnalysisManager, moduleAnalysisManager);

  // Initiating Function and Module level PassManagers

  llvm::ModulePassManager modulePassManager;
  llvm::FunctionPassManager functionPassManager;
  llvm::LoopPassManager loopPassManagerWithMSSA;
  llvm::LoopPassManager loopPassManager;

  // Adding passes to the pipeline

  if (contains(unroll, enabledOpts)) {
    // Add loop unrolling pass
    loopPassManager.addPass(llvm::LoopFullUnrollPass());
  }

  if (contains(unrollAndJam, enabledOpts)) {
    // Add loop unroll and jam pass
    loopPassManager.addPass(llvm::LoopUnrollAndJamPass());
  }

  if (contains(divRemPair, enabledOpts)) {
    // Add jump threading pass
    functionPassManager.addPass(llvm::DivRemPairsPass());
  }

  if (contains(indVarSimplify, enabledOpts)) {
    // Add induction variable simplify pass
    loopPassManager.addPass(llvm::IndVarSimplifyPass());
  }

  functionPassManager.addPass(llvm::PromotePass()); // New Reg2Mem
  functionPassManager.addPass(llvm::InstCombinePass());
  // Reassociate expressions.
  functionPassManager.addPass(llvm::ReassociatePass());
  // Eliminate Common SubExpressions.
  functionPassManager.addPass(llvm::GVNPass());
  // Simplify the control flow graph (deleting unreachable blocks, etc).
  functionPassManager.addPass(llvm::SimplifyCFGPass());

  if (contains(licm, enabledOpts)) {
    // Add loop invariant code motion 
    loopPassManagerWithMSSA.addPass(llvm::LICMPass()); 
  }

  if (contains(del, enabledOpts)) {
    // Add loop deletion pass
    loopPassManager.addPass(llvm::LoopDeletionPass()); 
  }   

  if (contains(split, enabledOpts)) {
    // Add loop bounds split pass
    loopPassManagerWithMSSA.addPass(llvm::LoopBoundSplitPass()); 
  }   

  if (contains(flatten, enabledOpts)) {
    // Add loop flattening pass
    loopPassManager.addPass(llvm::LoopFlattenPass());
  }

  if (contains(jumpThreading, enabledOpts)) {
    // Add jump threading pass
    functionPassManager.addPass(llvm::JumpThreadingPass());
  }

  if (contains(blk, enabledOpts)) {
    // Add block extraction pass
    modulePassManager.addPass(llvm::BlockExtractorPass()); 
  }

  // Add loop pass managers with and w/out MemorySSA
  functionPassManager.addPass(
      createFunctionToLoopPassAdaptor(std::move(loopPassManagerWithMSSA),true));

  functionPassManager.addPass(
      createFunctionToLoopPassAdaptor(std::move(loopPassManager)));

  // Passing the function pass manager to the modulePassManager using a function
  // adaptor, then passing theModule to the ModulePassManager along with
  // ModuleAnalysisManager.

  modulePassManager.addPass(
      createModuleToFunctionPassAdaptor(std::move(functionPassManager), true));
  modulePassManager.run(*theModule, moduleAnalysisManager);
}