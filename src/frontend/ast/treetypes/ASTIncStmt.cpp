#include "ASTIncStmt.h"
#include "ASTVisitor.h"

void accept(ASTVisitor *visitor) {
    if (visitor->visit(this)) {
        getNum()->accept(visitor);
    }
    visitor->endVisit(this);
}

std::ostream &ASTIncStmt::print(std::ostream &out) const {
  out << *getNum() << "++";
  return out;
}

std::vector<std::shared_ptr<ASTNode>> ASTIncStmt::getChildren() {
  std::vector<std::shared_ptr<ASTNode>> children;
  children.push_back(NUM);
  return children;
}