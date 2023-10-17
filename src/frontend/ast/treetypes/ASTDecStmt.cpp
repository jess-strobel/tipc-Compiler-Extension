#include "ASTDecStmt.h"
#include "ASTVisitor.h"

void ASTDecStmt::accept(ASTVisitor *visitor) {
    if (visitor->visit(this)) {
        getNum()->accept(visitor);
    }
    visitor->endVisit(this);
}

std::ostream &ASTDecStmt::print(std::ostream &out) const {
  out << *getNum() << "--";
  return out;
}

std::vector<std::shared_ptr<ASTNode>> ASTDecStmt::getChildren() {
  std::vector<std::shared_ptr<ASTNode>> children;
  children.push_back(NUM);
  return children;
}