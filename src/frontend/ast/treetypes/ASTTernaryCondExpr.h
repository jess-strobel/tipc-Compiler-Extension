#pragma once

#include "ASTExpr.h"

/*! \brief Class for ternary
 */
class ASTTernaryCondExpr : public ASTExpr {
  std::shared_ptr<ASTExpr> COND, THEN, ELSE;

public:
  std::vector<std::shared_ptr<ASTNode>> getChildren() override;
  ASTTernaryCondExpr(std::shared_ptr<ASTExpr> COND, std::shared_ptr<ASTExpr> THEN,
            std::shared_ptr<ASTExpr> ELSE)
      : COND(COND), THEN(THEN), ELSE(ELSE) {}
  ASTExpr *getCondition() const { return COND.get(); }
  ASTExpr *getThen() const { return THEN.get(); }
  ASTExpr *getElse() const { return ELSE.get(); }
  
  void accept(ASTVisitor *visitor) override;
  llvm::Value *codegen() override;

protected:
  std::ostream &print(std::ostream &out) const override;
};