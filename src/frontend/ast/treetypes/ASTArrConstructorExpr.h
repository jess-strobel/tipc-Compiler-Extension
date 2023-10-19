#pragma once

#include "ASTExpr.h"

/*! \brief Class for array constructor type [E1, ..., E2]
*/
class ASTArrConstructorExpr : public ASTExpr {
    std::vector<std::shared_ptr<ASTExpr>> ARGS;

public:
    std::vector<std::shared_ptr<ASTNode>> getChildren() override;
    ASTArrConstructorExpr(std::vector<std::shared_ptr<ASTExpr>> ARGS)
            : ARGS(ARGS) {}
    std::vector<ASTExpr *> getArgs() const;
    void accept(ASTVisitor *visitor) override;
    llvm::Value *codegen() override;

protected:
    std::ostream &print(std::ostream &out) const override;
};