#include "ASTFalseExpr.h"
#include "ASTVisitor.h"

void ASTFalseExpr::accept(ASTVisitor *visitor) {
    visitor->visit(this);
    visitor->endVisit(this);
}

std::ostream &ASTFalseExpr::print(std::ostream &out) const {
    out << "false";
    return out;
}
