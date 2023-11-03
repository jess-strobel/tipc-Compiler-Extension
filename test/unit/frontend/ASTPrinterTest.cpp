#include "ASTHelper.h"

#include <catch2/catch_test_macros.hpp>

#include <iostream>

TEST_CASE("ASTPrinterTest: output test", "[ASTNodePrint]") {
  std::stringstream stream;
  stream << R"(
      foo() { output 42; return 0; }
    )";

  std::vector<std::string> expected{"output 42;", "return 0;"};

  auto ast = ASTHelper::build_ast(stream);

  auto f = ast->findFunctionByName("foo");

  int i = 0;
  for (auto s : f->getStmts()) {
    stream = std::stringstream();
    stream << *s;
    auto actual = stream.str();
    REQUIRE(actual == expected.at(i++));
  }
}

TEST_CASE("ASTPrinterTest: function printers", "[ASTNodePrint]") {
  std::stringstream stream;
  stream << R"(
      fun(a) { return a; }
      foo() { return 1; }
      bar(x, y) { return x+1; }
    )";

  std::vector<std::string> expected{"fun(a) {...}", "foo() {...}",
                                    "bar(x,y) {...}"};

  auto ast = ASTHelper::build_ast(stream);

  int i = 0;
  for (auto f : ast->getFunctions()) {
    stream = std::stringstream();
    stream << *f;
    auto actual = stream.str();
    REQUIRE(actual == expected.at(i++));
  }
}

TEST_CASE("ASTPrinterTest: statement printers", "[ASTNodePrint]") {
  std::stringstream stream;
  stream << R"(
      fun() {
        var x, /* comment */ y, z;
        x = 
            0;
        if (x == 0) 
          y = 0;
        if (y == z) y=1; else y    =    2;
        while (x == 0) 
          z = 0;
        { 
           x = y + z; 
           y = 13;
        } 
        error       z;
        return z;
      }
    )";

  std::vector<std::string> expected{"var x, y, z;",
                                    "x = 0;",
                                    "if ((x==0)) y = 0;",
                                    "if ((y==z)) y = 1; else y = 2;",
                                    "while ((x==0)) z = 0;",
                                    "{ x = (y+z); y = 13; }",
                                    "error z;",
                                    "return z;"};

  auto ast = ASTHelper::build_ast(stream);

  auto f = ast->findFunctionByName("fun");

  int i = 0;
  for (auto d : f->getDeclarations()) {
    stream = std::stringstream();
    stream << *d;
    auto actual = stream.str();
    REQUIRE(actual == expected.at(i++));
  }

  for (auto s : f->getStmts()) {
    stream = std::stringstream();
    stream << *s;
    auto actual = stream.str();
    REQUIRE(actual == expected.at(i++));
  }
}

TEST_CASE("ASTPrinterTest: expression printers", "[ASTNodePrint]") {
  std::stringstream stream;
  stream << R"(
      foo(a) { return a;}
      fun() {
        var x, y, z;
        x = y + 0;
        y = input;
        z = {next:null, val:42};
        y = z.val;
        x = (*z).next;
        x = &z;
        z = -3;
        z = (42);
        x = alloc null;
        y = x + y - z * 3 / 1;
        y = foo(x);
        return 0;
      }
    )";

  std::vector<std::string> expected{"(y+0)",
                                    "input",
                                    "{next:null,val:42}",
                                    "(z.val)",
                                    "((*z).next)",
                                    "&z",
                                    "-3",
                                    "42",
                                    "alloc null",
                                    "((x+y)-((z*3)/1))",
                                    "foo(x)"};

  auto ast = ASTHelper::build_ast(stream);

  auto f = ast->findFunctionByName("fun");

  int i = 0;
  int numStmts = f->getStmts().size() - 1; // skip the return
  for (auto s : f->getStmts()) {
    auto a = dynamic_cast<ASTAssignStmt *>(s);
    stream = std::stringstream();
    stream << *a->getRHS();
    auto actual = stream.str();
    REQUIRE(actual == expected.at(i++));
    if (i == numStmts)
      break;
  }
}

TEST_CASE("ASTPrinterTest: conditional expression printers", "[ASTNodePrint]") {
  std::stringstream stream;
  stream << R"(
      fun() {
        var x, y, z;
        if (x == y) x = 0;
        if (x != y) x = 0;
        if (x > y) x = 0;
        return 0;
      }
    )";

  std::vector<std::string> expected{"(x==y)", "(x!=y)", "(x>y)"};

  auto ast = ASTHelper::build_ast(stream);

  auto f = ast->findFunctionByName("fun");

  int i = 0;
  int numStmts = f->getStmts().size() - 1; // skip the return
  for (auto s : f->getStmts()) {
    auto ifstmt = dynamic_cast<ASTIfStmt *>(s);
    stream = std::stringstream();
    stream << *ifstmt->getCondition();
    auto actual = stream.str();
    REQUIRE(actual == expected.at(i++));
    if (i == numStmts)
      break;
  }
}

TEST_CASE("ASTPrinterTest: local expr test", "[ASTNodePrint]") {
  auto zero = std::make_shared<ASTNumberExpr>(0);
  auto var = std::make_shared<ASTVariableExpr>("y");

  // Here we just use the default constructor
  ASTBinaryExpr ypluszero("+", std::move(var), std::move(zero));

  std::stringstream stream;
  stream << ypluszero;
  auto actual = stream.str();

  REQUIRE(actual == "(y+0)");
}

TEST_CASE("ASTPrinterTest: local unique expr test", "[ASTNodePrint]") {
  auto zero = std::make_shared<ASTNumberExpr>(0);
  auto var = std::make_shared<ASTVariableExpr>("y");

  // Here we create a shared pointer to the binary expr
  auto ypluszero =
      std::make_shared<ASTBinaryExpr>("+", std::move(var), std::move(zero));

  std::stringstream stream;
  stream << *ypluszero; // dereference is an operation for shared pointers
  auto actual = stream.str();

  REQUIRE(actual == "(y+0)");
}

TEST_CASE("ASTPrinterTest: ASTProgram output is the hash of the source.",
          "[ASTNodePrint]") {
  std::stringstream stream;
  stream << R"(
      foo(x) {
         return x + 1;
      }

      main() {
        var z;
        z = foo(42);
        return z;
      }
    )";

  auto ast = ASTHelper::build_ast(stream);

  std::string expectedOutput =
      "29e272ab0b8752287594fb0014953a9cf7879e3687f4d481ced352a835b46359";
  std::stringstream actualOutput;
  actualOutput << *ast;
  REQUIRE(expectedOutput == actualOutput.str());
}

TEST_CASE("ASTPrinterTest: ternary conditional expression operator printers", "[ASTNodePrint]") {
  std::stringstream stream;
  stream << R"(
      fun() {
        var x, y, z;
        x = ((x > y) ? y : 1);
        y = (((x != y) ? 0 : 1) <= z) ? 1 : 5;
        z = (x < y) ? 5 : (x >= 0) ? y : 2;
        return 0;
      }
    )";

  std::vector<std::string> expected{"((x>y) ? y : 1)", "((((x!=y) ? 0 : 1)<=z) ? 1 : 5)", "((x<y) ? 5 : ((x>=0) ? y : 2))"};

  auto ast = ASTHelper::build_ast(stream);

  auto f = ast->findFunctionByName("fun");

  int i = 0;
  int numStmts = f->getStmts().size() - 1; // skip the return
  for (auto s : f->getStmts()) {
    auto a = dynamic_cast<ASTAssignStmt *>(s);
    stream = std::stringstream();
    stream << *a->getRHS();
    auto actual = stream.str();
    REQUIRE(actual == expected.at(i++));
    if (i == numStmts)
      break;
  }
}

TEST_CASE("ASTPrinterTest: iterative-style for loop printers", "[ASTNodePrint]") {
  std::stringstream stream;
  stream << R"(
      fun() {
        var x, y, z;
        for (x : y) {
          z++;
        }
        for (y : z) { 
          for (x : z)
            y = y + 1;
        }
        for (z : x) x = x + 1;
        return 0;
      }
    )";

  std::vector<std::string> expected{"for (x : y) { z++; }", "for (y : z) { for (x : z) y = (y+1); }", "for (z : x) x = (x+1);"};

  auto ast = ASTHelper::build_ast(stream);

  auto f = ast->findFunctionByName("fun");

  int i = 0;
  int numStmts = f->getStmts().size() - 1; // skip the return
  for (auto s : f->getStmts()) {
    stream = std::stringstream();
    stream << *s;
    auto actual = stream.str();
    REQUIRE(actual == expected.at(i++));
    if (i == numStmts)
      break;
  }
}

TEST_CASE("ASTPrinterTest: range-style for loop printers", "[ASTNodePrint]") {
  std::stringstream stream;
  stream << R"(
      fun() {
        var i, j, x, y, z;
        for (x : 0 .. 10) {
          z++;
        }
        for (y : i .. j) { 
          for (x : z .. 2 by y)
            x = 6 + i;
        }
        for (z : x .. 5 by 1) x = 5;
        return 0;
      }
    )";

  std::vector<std::string> expected{"for (x : 0 .. 10 by 1) { z++; }", "for (y : i .. j by 1) { for (x : z .. 2 by y) x = (6+i); }", "for (z : x .. 5 by 1) x = 5;"};

  auto ast = ASTHelper::build_ast(stream);

  auto f = ast->findFunctionByName("fun");

  int i = 0;
  int numStmts = f->getStmts().size() - 1; // skip the return
  for (auto s : f->getStmts()) {
    stream = std::stringstream();
    stream << *s;
    auto actual = stream.str();
    REQUIRE(actual == expected.at(i++));
    if (i == numStmts)
      break;
  }
}

TEST_CASE("ASTPrinterTest: boolean printers", "[ASTNodePrint]") {
  std::stringstream stream;
  stream << R"(
      fun() { 
        var x, y;
        x = true;
        if (true)
          y = false;
        y = true;
        return false;
      }
    )";

  std::vector<std::string> expected{"x = (true);", "if ((true)) y = (false);",
                                    "y = (true);", "return (false);"};

  auto ast = ASTHelper::build_ast(stream);

  auto f = ast->findFunctionByName("fun");

  int i = 0;
  for (auto s : f->getStmts()) {
    stream = std::stringstream();
    stream << *s;
    auto actual = stream.str();
    REQUIRE(actual == expected.at(i++));
  }
}

TEST_CASE("ASTPrinterTest: visitArrConstructorExpr", "[ASTPrinter]") {
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

TEST_CASE("ASTPrinterTest: visitArrLenOpExpr", "[ASTPrinter]") {
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

TEST_CASE("ASTPrinterTest: visitArrOrConstructorExpr", "[ASTPrinter]") {
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
  int numStmts = f->getStmts().size() - 1; // ignore ret
  for (auto s : f->getStmts()) {
    auto assignstmt = dynamic_cast<ASTAssignStmt *>(s);
    auto arrorconstexpr = dynamic_cast<ASTArrOfConstructorExpr *>(&(*assignstmt->getRHS()));
    stream = std::stringstream();
    stream << *arrorconstexpr;
    auto actual = stream.str();
    REQUIRE(actual == expected.at(i++));
    if (i == numStmts) {
      break;
    }
  }
}

TEST_CASE("ASTPrinterTest: visitArrRefExpr", "[ASTPrinter]") {
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

TEST_CASE("ASTPrinterTest: visitNotExpr", "[ASTPrinter]") {
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

TEST_CASE("ASTPrinterTest: visitNegExpr", "[ASTPrinter]") {
  std::stringstream stream;
  stream << R"(
    foo() {
      var x, y;
      x = -y;
      return 0;
    }
  )";

  std::vector<std::string> expected{"-y"};

  auto ast = ASTHelper::build_ast(stream);

  auto f = ast->findFunctionByName("foo");

  int i = 0;
  int numStmts = f->getStmts().size() - 1; // ignore ret
  for (auto s : f->getStmts()) {
    auto assignstmt = dynamic_cast<ASTAssignStmt *>(s);
    auto negexpr = dynamic_cast<ASTNegExpr *>(&(*assignstmt->getRHS()));
    stream = std::stringstream();
    stream << *negexpr;
    auto actual = stream.str();
    REQUIRE(actual == expected.at(i++));
    if (i == numStmts) {
      break;
    }
  }
}

TEST_CASE("ASTPrinterTest: binary expression printers", "[ASTNodePrint]") {
  std::stringstream stream;
  stream << R"(
      foo(a) { return a;}
      fun() {
        var x, y, z;
        if ((5 % 3) == 2) {}
        if ((true) and (false)) {}
        if ((false) or (true)) {}
        return 0;
      }
    )";

  std::vector<std::string> expected{"((5%3)==2)",
                                    "(false)",
                                    "(true)"};

  auto ast = ASTHelper::build_ast(stream);

  auto f = ast->findFunctionByName("fun");

  int i = 0;
  int numStmts = f->getStmts().size() - 1; // skip the return
  for (auto s : f->getStmts()) {
    auto ifstmt = dynamic_cast<ASTIfStmt *>(s);
    stream = std::stringstream();
    stream << *ifstmt->getCondition();
    auto actual = stream.str();
    REQUIRE(actual == expected.at(i++));
    if (i == numStmts)
      break;
  }
}