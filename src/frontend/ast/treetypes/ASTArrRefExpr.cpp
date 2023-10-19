#include "ASTArrBinRefOpExpr.h"
#include "ASTVisitor.h"

void ASTArrBinRefOpExpr::accept(ASTVisitor *visitor) {
    if (visitor->visit(this)) {
        getArr()->accept(visitor);
        getIndex()->accept(visitor);
    }
    visitor->endVisit(this);
}

std::ostream &ASTArrBinRefOpExpr::print(std::ostream &out) const {
    out << *getArr() << "[" << *getIndex() << "]";
    return out;
}

std::vector<std::shared_ptr<ASTNode>> ASTArrBinRefOpExpr::getChildren() {
    std::vector<std::shared_ptr<ASTNode>> children;
    children.push_back(ARR);
    children.push_back(INDEX);
    return children;
}