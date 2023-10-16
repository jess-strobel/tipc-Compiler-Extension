#pragma once

#include "ASTExpr.h"
#include "ASTStmt.h"

class ASTIncStmt : public ASTStmt {
    std::shared_ptr<ASTExpr> NUM;

public:
    std::vector<std::shared_ptr<ASTNode>> getChildren() override;
    ASTIncStmt(std::shared_ptr<ASTExpr> NUM)
    ASTExpr *getNum() const { return NUM.get(); }

    void accept(ASTVisitor *visitor) override;
    llvm::Value *codegen() override;

protected:
  std::ostream &print(std::ostream &out) const override;
};