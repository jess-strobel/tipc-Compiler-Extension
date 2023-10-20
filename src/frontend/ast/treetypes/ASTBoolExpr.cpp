#include "ASTBoolExpr.h"
#include "ASTVisitor.h"

void ASTBoolExpr::accept(ASTVisitor *visitor) {
    visitor->visit(this);
    visitor->endVisit(this);
}

std::ostream &ASTBoolExpr::print(std::ostream &out) const {
  out << "(" << getBool() << ")";
  return out;
} // LCOV_EXCL_LINE