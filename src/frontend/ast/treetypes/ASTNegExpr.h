#pragma once

#include "ASTExpr.h"

/*! \brief Class for arithmetic negation operator "-"
*/
class ASTNegExpr : public ASTExpr {
    std::shared_ptr<ASTExpr> RIGHT;

public:
    std::vector<std::shared_ptr<ASTNode>> getChildren() override;
    ASTNegExpr(std::shared_ptr<ASTExpr> RIGHT)
            : RIGHT(RIGHT) {}
    ASTExpr *getRight() const { return RIGHT.get(); }
    void accept(ASTVisitor *visitor) override;
    llvm:Value *codegen() override;

protected:
    std::ostream &print(std::ostream &out) const override;
};