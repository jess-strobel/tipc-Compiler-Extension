#include "ASTHelper.h"

#include "antlr4-runtime.h"
#include <TIPLexer.h>
#include <TIPParser.h>

#include <catch2/catch_test_macros.hpp>

#include <iostream>


TEST_CASE("ASTBuilder: visitNotExpr", "[ASTBuilder]") {
  std::stringstream stream;
  stream << R"(
    foo() {
      var x, y;
      if (not x) x = 0;
      if (not y) y = 0;
      return 0;
    }
  )";

  std::vector<std::string> expected{"not x", "not y"};

  auto ast = ASTHelper::build_ast(stream);

  auto f = ast->findFunctionByName("foo");

  int i = 0;
  //visit(ctx->expr());
  //auto cond = visitedExpr;
  int numStmts = f->getStmts().size() - 1; // ignore ret
  for (auto s : f->getStmts()) {
    auto ifstmt = dynamic_cast<ASTIfStmt *>(s);
    auto notexpr = dynamic_cast<ASTNotExpr *>(&(*ifstmt->getCondition()));
    stream = std::stringstream();
    stream << *notexpr;
    auto actual = stream.str();
    REQUIRE(actual == expected.at(i++));
    if (i == numStmts) {
      break;
    }
  }
}

TEST_CASE("ASTBuilder: bad op string throws error", "[ASTBuilder]") {
  // Boilerplate just to setup a legitimate builder.
  std::stringstream stream;
  stream << R"(
    x = 1 + 1;
  )";
  antlr4::ANTLRInputStream input(stream);
  TIPLexer lexer(&input);
  antlr4::CommonTokenStream tokens(&lexer);
  TIPParser parser(&tokens);
  ASTBuilder tb(&parser);

  // Inject a bad operation token into an arbitrary binary expression.
  TIPParser::ExprContext exprContext;
  TIPParser::AdditiveExprContext context(&exprContext);
  antlr4::CommonToken mockToken(-1, "mock");
  context.op = &mockToken;

  REQUIRE_THROWS_AS(tb.visitAdditiveExpr(&context), std::runtime_error);
}
