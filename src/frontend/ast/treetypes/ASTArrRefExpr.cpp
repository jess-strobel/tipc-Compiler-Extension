#include "ASTArrRefExpr.h"
#include "ASTVisitor.h"

void ASTArrRefExpr::accept(ASTVisitor *visitor) {
    if (visitor->visit(this)) {
        getArr()->accept(visitor);
        getIndex()->accept(visitor);
    }
    visitor->endVisit(this);
}

std::ostream &ASTArrRefExpr::print(std::ostream &out) const {
    out << *getArr() << "[" << *getIndex() << "]";
    return out;
}

std::vector<std::shared_ptr<ASTNode>> ASTArrRefExpr::getChildren() {
    std::vector<std::shared_ptr<ASTNode>> children;
    children.push_back(ARR);
    children.push_back(INDEX);
    return children;
}