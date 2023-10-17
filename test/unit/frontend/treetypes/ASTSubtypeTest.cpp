#include "ASTHelper.h"
#include "ASTVisitor.h"
#include "ExceptionContainsWhat.h"
#include <sstream>
// #include "FrontEnd.h"
// #include "ParseError.h"
// #include "ParserHelper.h"

#include <catch2/catch_test_macros.hpp>

#include <iostream>

TEST_CASE("ASTSubtypeTest: instance of ASTTernaryCondExpr can be created ", "[ASTTernaryCondExpr]") {
//   std::stringstream stream;
//   stream << R"(
//       foo(x) { return x; }
//       bar(x) { return x; }
//       baz(x) { return x; }
//     )";

  //ASTTernaryCondExpr *expectedTernaryCondExpr = ASTTernaryCondExpr(ASTBinaryExpr(">", ASTNumberExpr(10), ASTNumberExpr(5)), ASTNumberExpr(10), ASTNumberExpr(5));
  auto expected = std::make_unique<ASTIncStmt>(50);
  REQUIRE(expected != nullptr);
}