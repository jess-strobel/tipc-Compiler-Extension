#include "ASTArrLenOpExpr.h"
#include "ASTVisitor.h"

void ASTArrLenOpExpr::accept(ASTVisitor *visitor) {
    if (visitor->visit(this)) {
        getRight()->accept(visitor);
    }
    visitor->endVisit(this);
}

std::ostream &ASTArrLenOpExpr::print(std::ostream &out) const {
    out << "#" << *getRight();
    return out;
}

std::vector<std::shared_ptr<ASTNode>> ASTArrLenOpExpr::getChildren() {
    std::vector<std::shared_ptr<ASTNode>> children;
    children.push_back(RIGHT);
    return children;
}