#include "ASTVariableAssignStmt.h"
#include "ASTVisitor.h"

void ASTVariableAssignStmt::accept(ASTVisitor * visitor) {
  if (visitor->visit(this)) {
    getLHS()->accept(visitor);
    getRHS()->accept(visitor);
  }
  visitor->endVisit(this);
}
