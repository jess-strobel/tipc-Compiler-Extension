#include "ASTForRangeStmt.h"
#include "ASTVisitor.h"

void ASTForRangeStmt::accept(ASTVisitor *visitor) {
  if (visitor->visit(this)) {
    getVar()->accept(visitor);
    getLBound()->accept(visitor);
    getRBound()->accept(visitor);
    getStep()->accept(visitor);
    getStmt()->accept(visitor);
  }
  visitor->endVisit(this);
}

std::ostream &ASTForRangeStmt::print(std::ostream &out) const {
  out << "for (" << *getVar() << " : " << *getLBound() << " .. " << *getRBound();
  out << " by " << *getStep();
  out << ") " << *getStmt();
  return out;
}

std::vector<std::shared_ptr<ASTNode>> ASTForRangeStmt::getChildren() {
  std::vector<std::shared_ptr<ASTNode>> children;

  children.push_back(VAR);
  children.push_back(LBOUND);
  children.push_back(RBOUND);
  children.push_back(STEP);
  children.push_back(STMT);

  return children;
}  // LCOV_EXCL_LINE