#pragma once

#include "ASTExpr.h"

/*! \brief Class for binary arrary element reference operator E1[E2]
*/
class ASTArrBinRefOpExpr : public ASTExpr {
    std::shared_ptr<ASTExpr> ARR, INDEX;

public:
    std::vector<std::shared_ptr<ASTNode>> getChildren() override;
    ASTArrBinRefOpExpr(std::shared_ptr<ASTExpr> ARR, std::shared_ptr<ASTExpr> INDEX)
            : ARR(ARR), INDEX(INDEX) {}
    ASTExpr *getArr() const { return ARR.get(); }
    ASTExpr *getIndex() const { return INDEX.get(); }
    void accept(ASTVisitor *visitor) override;
    llvm:Value *codegen() override;

protected:
    std::ostream &print(std::ostream &out) const override;
};