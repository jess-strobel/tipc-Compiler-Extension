#include "ASTTernaryCondExpr.h"
#include "ASTVisitor.h"

void ASTTernaryCondExpr::accept(ASTVisitor *visitor) {
  if (visitor->visit(this)) {
    getCondition()->accept(visitor);
    getThen()->accept(visitor);
    getElse()->accept(visitor);
  }
  visitor->endVisit(this);
}

std::ostream &ASTTernaryCondExpr::print(std::ostream &out) const {
  out << "(" << *getCondition() << " ? " << *getThen() << " : " << *getElse() << ")";
  return out;
}

std::vector<std::shared_ptr<ASTNode>> ASTTernaryCondExpr::getChildren() {
  std::vector<std::shared_ptr<ASTNode>> children;

  children.push_back(COND);
  children.push_back(THEN);
  children.push_back(ELSE);

  return children;
} // LCOV_EXCL_LINE