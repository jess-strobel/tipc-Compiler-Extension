#pragma once

#include "ASTExpr.h"

/*! \brief Class for boolean types
 */
class ASTBoolExpr : public ASTExpr {
  bool BOOL;

public:
  ASTBoolExpr(bool BOOL) : BOOL(BOOL) {}
  std::string getBool() const { return BOOL ? "true" : "false"; }
  void accept(ASTVisitor *visitor) override;
  llvm::Value *codegen() override;

protected:
  std::ostream &print(std::ostream &out) const override;
};
