#pragma once

#include "ASTExpr.h"

/*! \brief Class for a false expression
*/
class ASTFalseExpr : public ASTExpr {

public:
    void accept(ASTVisitor *visitor) override;
    llvm::Value *codegen() override;

protected:
    std::ostream &print(std::ostream &out) const override;
};