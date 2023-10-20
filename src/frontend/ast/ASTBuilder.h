#pragma once

#include "AST.h"

#include "TIPBaseVisitor.h"  //Auto-generated file that is an instance of visitor pattern
#include "TIPParser.h"
#include "antlr4-runtime.h"

#include <string>

using namespace antlrcpp;

/*! \brief Parse tree visitor that generates a program AST.
 *
 * This is an ANTLR4 parse tree visitor, not to be confused with an ASTVisitor.
 * As such its structure follows that of the ANTLR4 generated TIPBaseVisitor.
 * The primary entry point is the build method which initiates the traversal
 * of the parse tree and, if succesful, generates a shared ASTProgram whose
 * ownership is transferred to the caller.
 */
class ASTBuilder : public TIPBaseVisitor { //ASTBuilder is a subtype of TIPBaseVisitor
private:
  TIPParser *parser;
  std::string opString(int op);  //Local function to convert integer encodings of operators to strings
  std::string generateSHA256(std::string tohash);

public:
  ASTBuilder(TIPParser *parser);

  /*! \fn build
   *  \brief Builds an instance of ASTProgram from an ANTLR4 parse tree.
   *
   * The caller obtains "ownership" of the resulting ASTProgram. (only owner can write to the structure)
   */
  std::shared_ptr<ASTProgram> build(TIPParser::ProgramContext *ctx);  //ProgramContext = data structure that records root of parse tree

  /**
   * a helper function to build binary expressions
   */
  template <typename T> void visitBinaryExpr(T *ctx, const std::string &op);
  
  /** Each visit function is where the parse-tree specific logic is embedded, and 
   *  constructs an appropriate AST node for the parse-tree node
  */
  Any visitFunction(TIPParser::FunctionContext *ctx) override;
  Any visitNegExpr(TIPParser::NegExprContext *ctx) override;
  Any visitAdditiveExpr(TIPParser::AdditiveExprContext *ctx) override;
  Any visitRelationalExpr(TIPParser::RelationalExprContext *ctx) override;
  Any visitMultiplicativeExpr(
      TIPParser::MultiplicativeExprContext *ctx) override; //Any context represents an expr that has been parsed and matched by antlr
  Any visitEqualityExpr(TIPParser::EqualityExprContext *ctx) override;
  Any visitParenExpr(TIPParser::ParenExprContext *ctx) override;
  Any visitNumExpr(TIPParser::NumExprContext *ctx) override;
  Any visitVarExpr(TIPParser::VarExprContext *ctx) override;
  Any visitInputExpr(TIPParser::InputExprContext *ctx) override;
  Any visitFunAppExpr(TIPParser::FunAppExprContext *ctx) override;
  Any visitAllocExpr(TIPParser::AllocExprContext *ctx) override;
  Any visitRefExpr(TIPParser::RefExprContext *ctx) override;
  Any visitDeRefExpr(TIPParser::DeRefExprContext *ctx) override;
  Any visitNullExpr(TIPParser::NullExprContext *ctx) override;
  Any visitRecordExpr(TIPParser::RecordExprContext *ctx) override;
  Any visitFieldExpr(TIPParser::FieldExprContext *ctx) override;
  Any visitAccessExpr(TIPParser::AccessExprContext *ctx) override;
  Any visitDeclaration(TIPParser::DeclarationContext *ctx) override;
  Any visitNameDeclaration(TIPParser::NameDeclarationContext *ctx) override;
  Any visitAssignStmt(TIPParser::AssignStmtContext *ctx) override;
  Any visitBlockStmt(TIPParser::BlockStmtContext *ctx) override;
  Any visitBoolExpr(TIPParser::BoolExprContext *ctx) override;
  Any visitWhileStmt(TIPParser::WhileStmtContext *ctx) override;
  Any visitIfStmt(TIPParser::IfStmtContext *ctx) override;
  Any visitOutputStmt(TIPParser::OutputStmtContext *ctx) override;
  Any visitErrorStmt(TIPParser::ErrorStmtContext *ctx) override;
  Any visitReturnStmt(TIPParser::ReturnStmtContext *ctx) override;
  Any visitForItrStmt(TIPParser::ForItrStmtContext *ctx) override;
  Any visitForRangeStmt(TIPParser::ForRangeStmtContext *ctx) override;
  Any visitIncStmt(TIPParser::IncStmtContext *ctx) override;
  Any visitDecStmt(TIPParser::DecStmtContext *ctx) override;
  Any visitTernaryCondExpr(TIPParser::TernaryCondExprContext *ctx) override;
  Any visitArrConstructorExpr(TIPParser::ArrConstructorExprContext *ctx) override;
  Any visitArrLenOpExpr(TIPParser::ArrLenOpExprContext *ctx) override;
  Any visitArrOrConstructorExpr(TIPParser::ArrOrConstructorExprContext *ctx) override;
  Any visitArrRefExpr(TIPParser::ArrRefExprContext *ctx) override;
  Any visitNotExpr(TIPParser::NotExprContext *ctx) override;
};
//Visit methods are where parse-tree specific logic is defined, which constructs its corresponding AST Node