#pragma once

#include "ASTExpr.h"

/*! \brief Class for the unary prefix length operator #
*/
class ASTArrLenOpExpr : public ASTExpr {
    std::shared_ptr<ASTExpr> RIGHT;

public:
    std::vector<std::shared_ptr<ASTNode>> getChildren() override;
    ASTArrLenOpExpr(std::shared_ptr<ASTExpr> RIGHT)
            : RIGHT(RIGHT) {}
    ASTExpr *getRight() const { return RIGHT.get(); }
    void accept(ASTVisitor *visitor) override;
    llvm::Value *codegen() override;

protected:
    std::ostream &print(std::ostream &out) const override;
};