#include "ASTArrOrConstructorExpr.h"
#include "ASTVisitor.h"

void ASTArrOrConstructorExpr::accept(ASTVisitor *visitor) {
    if (visitor->visit(this)) {
        getLeft()->accept(visitor);
        getRight()->accept(visitor);
    }
    visitor->endVisit(this);
}

std::ostream &ASTArrOrConstructorExpr::print(std::ostream &out) const {
    out << "[" << *getLeft() << " of " << *getRight() << "]";
    return out;
}

std::vector<std::shared_ptr<ASTNode>> ASTArrOrConstructorExpr::getChildren() {
    std::vector<std::shared_ptr<ASTNode>> children;
    children.push_back(LEFT);
    children.push_back(RIGHT);
    return children;
} // LCOV_EXCL_LINE