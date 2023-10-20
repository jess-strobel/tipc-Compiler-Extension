#include "ASTHelper.h"

#include "antlr4-runtime.h"
#include <TIPLexer.h>
#include <TIPParser.h>

#include <catch2/catch_test_macros.hpp>

#include <iostream>

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

// ast false expr (??)
// ast neg expr (??)

TEST_CASE("ASTBuilder: visitArrConstructorExpr", "[ASTBuilder]") {
  std::stringstream stream;
  stream << R"(
    foo() {
      var x;
      x = [1, 2, 3];
      return 0;
    }
  )";

  std::vector<std::string> expected{"[1, 2, 3]"};

  auto ast = ASTHelper::build_ast(stream);

  auto f = ast->findFunctionByName("foo");

  int i = 0;
  //visit(ctx->expr());
  //auto cond = visitedExpr;
  int numStmts = f->getStmts().size() - 1; // ignore ret
  for (auto s : f->getStmts()) {
    auto assignstmt = dynamic_cast<ASTAssignStmt *>(s);
    auto arrconstexpr = dynamic_cast<ASTArrConstructorExpr *>(&(*assignstmt->getRHS()));
    stream = std::stringstream();
    stream << *arrconstexpr;
    auto actual = stream.str();
    REQUIRE(actual == expected.at(i++));
    if (i == numStmts) {
      break;
    }
  }
}

TEST_CASE("ASTBuilder: visitArrLenOpExpr", "[ASTBuilder]") {
  std::stringstream stream;
  stream << R"(
    foo() {
      var x, y;
      x = #y;
      return 0;
    }
  )";

  std::vector<std::string> expected{"#y"};

  auto ast = ASTHelper::build_ast(stream);

  auto f = ast->findFunctionByName("foo");

  int i = 0;
  //visit(ctx->expr());
  //auto cond = visitedExpr;
  int numStmts = f->getStmts().size() - 1; // ignore ret
  for (auto s : f->getStmts()) {
    auto assignstmt = dynamic_cast<ASTAssignStmt *>(s);
    auto arrlenop = dynamic_cast<ASTArrLenOpExpr *>(&(*assignstmt->getRHS()));
    stream = std::stringstream();
    stream << *arrlenop;
    auto actual = stream.str();
    REQUIRE(actual == expected.at(i++));
    if (i == numStmts) {
      break;
    }
  }
}

TEST_CASE("ASTBuilder: visitArrOrConstructorExpr", "[ASTBuilder]") {
  std::stringstream stream;
  stream << R"(
    foo() {
      var x;
      x = [5 of 7];
      return 0;
    }
  )";

  std::vector<std::string> expected{"[5 of 7]"};

  auto ast = ASTHelper::build_ast(stream);

  auto f = ast->findFunctionByName("foo");

  int i = 0;
  //visit(ctx->expr());
  //auto cond = visitedExpr;
  int numStmts = f->getStmts().size() - 1; // ignore ret
  for (auto s : f->getStmts()) {
    auto assignstmt = dynamic_cast<ASTAssignStmt *>(s);
    auto arrorconstexpr = dynamic_cast<ASTArrOrConstructorExpr *>(&(*assignstmt->getRHS()));
    stream = std::stringstream();
    stream << *arrorconstexpr;
    auto actual = stream.str();
    REQUIRE(actual == expected.at(i++));
    if (i == numStmts) {
      break;
    }
  }
}

TEST_CASE("ASTBuilder: visitArrRefExpr", "[ASTBuilder]") {
  std::stringstream stream;
  stream << R"(
    foo() {
      var x, y;
      x = y[0];
      return 0;
    }
  )";

  std::vector<std::string> expected{"y[0]"};

  auto ast = ASTHelper::build_ast(stream);

  auto f = ast->findFunctionByName("foo");

  int i = 0;
  int numStmts = f->getStmts().size() - 1; // ignore ret
  for (auto s : f->getStmts()) {
    auto assignstmt = dynamic_cast<ASTAssignStmt *>(s);
    auto arrrefexpr = dynamic_cast<ASTArrRefExpr *>(&(*assignstmt->getRHS()));
    stream = std::stringstream();
    stream << *arrrefexpr;
    auto actual = stream.str();
    REQUIRE(actual == expected.at(i++));
    if (i == numStmts) {
      break;
    }
  }
}

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

// ast true expr (??)
