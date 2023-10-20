#pragma once

#include "ASTExpr.h"
#include "ASTStmt.h"

/*! \brief Class for iterator-style for loop
 */
class ASTForItrStmt : public ASTStmt {
  std::shared_ptr<ASTExpr> VAR, ITERABLE;
  std::shared_ptr<ASTStmt> STMT;

public:
  std::vector<std::shared_ptr<ASTNode>> getChildren() override;
  ASTForItrStmt(std::shared_ptr<ASTExpr> VAR, std::shared_ptr<ASTExpr> ITERABLE,
                std::shared_ptr<ASTStmt> STMT)
      : VAR(VAR), ITERABLE(ITERABLE), STMT(STMT) {}
  ASTExpr *getVar() const { return VAR.get(); }
  ASTExpr *getIterable() const { return ITERABLE.get(); }
  ASTStmt *getStmt() const { return STMT.get(); }

  void accept(ASTVisitor *visitor) override;
  llvm::Value *codegen() override;

protected:
  std::ostream &print(std::ostream &out) const override;
};
