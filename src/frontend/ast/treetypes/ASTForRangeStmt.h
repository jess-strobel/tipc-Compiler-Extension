#pragma once

#include "ASTExpr.h"
#include "ASTNumberExpr.h"
#include "ASTStmt.h"

/*! \brief Class for range-style for loop
 */
class ASTForRangeStmt : public ASTStmt {
  std::shared_ptr<ASTExpr> VAR, LBOUND, RBOUND;
  std::shared_ptr<ASTExpr> STEP = ASTNumberExpr(1);
  std::shared_ptr<ASTStmt> STMT;

public:
  std::vector<std::shared_ptr<ASTNode>> getChildren() override;
  ASTForItrStmt(std::shared_ptr<ASTExpr> VAR, std::shared_ptr<ASTExpr> LBOUND, 
            std::shared_ptr<ASTExpr> RBOUND, std::shared_ptr<ASTExpr> STEP,
            std::shared_ptr<ASTStmt> STMT)
      : VAR(VAR), LBOUND(LBOUND), RBOUND(RBOUND), STEP(STEP), STMT(STMT) {}
  ASTExpr *getVar() const { return VAR.get(); }
  ASTExpr *getLBound() const { return LBOUND.get(); }
  ASTExpr *getRBound() const { return RBOUND.get(); }
  ASTExpr *getStep() const { return STEP.get(); }
  ASTExpr *getStmt() const { return STMT.get(); }

  void accept(ASTVisitor *visitor) override;
  llvm::Value *codegen() override;

protected:
  std::ostream &print(std::ostream &out) const override;
};
