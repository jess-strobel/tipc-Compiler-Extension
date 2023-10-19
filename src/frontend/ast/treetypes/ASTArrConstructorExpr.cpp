#include "ASTConstructorExpr.h"
#include "ASTVisitor.h"

ASTArrConstructorExpr::ASTArrConstructorExpr(
        std::vector<std::shared_ptr<ASTExpr>> ARGS) {
    for (auto &arg : ARGS) {
        std::shared_ptr<ASTExpr> a = arg;
        this->ARGS.push_back(a);
    }
}

std::vector<ASTExpr *> ASTArrConstructorExpr::getArgs() const {
    return rawRefs(ARGS);
}

void ASTArrOrConstructorExpr::accept(ASTVisitor *visitor) {
    if (visitor->visit(this)) {
        for (auto a : getArgs()) {
            a->accept(visitor);
        }
    }
    visitor->endVisit(this);
}

std::ostream &ASTArrConstructorExpr::print(std::ostream &out) const {
    out << "[";
    bool skip = true;
    for (auto &a : getArgs()) {
        if (skip) {
            skip = false;
            out << *a;
            continue;
        }
        out << "," << *a;
    }
    out << "]";
    return out;
}

std::vector<std::shared_ptr<ASTNode>> ASTArrConstructorExpr::getChildren() {
    std::vector<std::shared_ptr<ASTNode>> children;
    for (auto &arg : ARGS) {
        children.push_back(arg);
    }
    return children;
}