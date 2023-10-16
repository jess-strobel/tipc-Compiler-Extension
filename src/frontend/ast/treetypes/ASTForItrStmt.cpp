#include "ASTForItrStmt.h"
#include "ASTVisitor.h"

void ASTForItrStmt::accept(ASTVisitor *visitor) {
  if (visitor->visit(this)) {
    getVar()->accept(visitor);
    getIterable()->accept(visitor);
    getStmt()->accept(visitor);
  }
  visitor->endVisit(this);
}

std::ostream &ASTForItrStmt::print(std::ostream &out) const {
  out << "for (" << *getVar() << " : " << *getIterable() << ") ";
  out << *getStmt();
  return out;
}

std::vector<std::shared_ptr<ASTNode>> ASTForItrStmt::getChildren() {
  std::vector<std::shared_ptr<ASTNode>> children;

  children.push_back(VAR);
  children.push_back(ITERABLE);
  children.push_back(STMT);

  return children;
}