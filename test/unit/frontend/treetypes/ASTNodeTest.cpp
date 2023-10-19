#include "ASTHelper.h"
#include "AST.h"

#include <catch2/catch_test_macros.hpp>

#include <iostream>

#include <sstream>
#include "ASTVisitor.h"

class RecordPostPrint : public ASTVisitor {
public:
    std::vector<std::string> postPrintStrings;
    void record(ASTNode * element) {
       std::stringstream s; s << *element; postPrintStrings.push_back(s.str()); 
    }
    void endVisit(ASTProgram * element) { record(element); }
    void endVisit(ASTFunction * element) { record(element); }
    void endVisit(ASTNumberExpr * element) { record(element); }
    void endVisit(ASTVariableExpr * element) { record(element); }
    void endVisit(ASTBinaryExpr * element) { record(element); }
    void endVisit(ASTInputExpr * element) { record(element); }
    void endVisit(ASTFunAppExpr * element) { record(element); }
    void endVisit(ASTAllocExpr * element) { record(element); }
    void endVisit(ASTRefExpr * element) { record(element); }
    void endVisit(ASTDeRefExpr * element) { record(element); }
    void endVisit(ASTNullExpr * element) { record(element); }
    void endVisit(ASTFieldExpr * element) { record(element); }
    void endVisit(ASTRecordExpr * element) { record(element); }
    void endVisit(ASTAccessExpr * element) { record(element); }
    void endVisit(ASTDeclNode * element) { record(element); }
    void endVisit(ASTDeclStmt * element) { record(element); }
    void endVisit(ASTAssignStmt * element) { record(element); }
    void endVisit(ASTWhileStmt * element) { record(element); }
    void endVisit(ASTIfStmt * element) { record(element); }
    void endVisit(ASTOutputStmt * element) { record(element); }
    void endVisit(ASTReturnStmt * element) { record(element); }
    void endVisit(ASTErrorStmt * element) { record(element); }
    void endVisit(ASTBlockStmt * element) { record(element); }
    void endVisit(ASTDecStmt * element) { record(element); }
    void endVisit(ASTIncStmt * element) { record(element); }
    void endVisit(ASTNotExpr * element) { record(element); }
};

// Helper function that checks for raw node pointer in list
bool contains(std::vector<std::shared_ptr<ASTNode>> nodeList, ASTNode * nodeP) {
  bool found = false;
  for (auto & sharedNodeP : nodeList) {
    if (sharedNodeP.get() == nodeP) {
      found = true;
      break;
    }
  }
  return found;
}

TEST_CASE("ASTNodeTest: ASTAssign", "[ASTNode]") {
  auto rhs = std::make_shared<ASTNumberExpr>(42);
  auto lhs = std::make_shared<ASTVariableExpr>("x");
  auto assign = std::make_shared<ASTAssignStmt>(lhs, rhs);

  // Test Print Method
  std::stringstream nodePrintStream;
  nodePrintStream << *assign;
  REQUIRE(nodePrintStream.str() == "x = 42;");

  // Test getters 
  REQUIRE(rhs.get() == assign->getRHS());
  REQUIRE(lhs.get() == assign->getLHS());

  // Test getChildren
  auto children = assign->getChildren();
  REQUIRE(children.size() == 2);
  REQUIRE(contains(children, rhs.get()));
  REQUIRE(contains(children, lhs.get()));

  // Test accept
  RecordPostPrint visitor;
  assign->accept(&visitor);
  std::string expected[] = { "x", "42", "x = 42;" };
  for (int i=0; i < 3; i++) {
    REQUIRE(visitor.postPrintStrings[i] == expected[i]);
  }
}

// ---------------- test creation in progress ------------------------ //

TEST_CASE("ASTNodeTest: ASTNot", "[ASTNode]") {
  auto rhs = std::make_shared<ASTVariableExpr>("x");
  auto notexpr = std::make_shared<ASTNotExpr>(rhs);

  // test print method
  std::stringstream nodePrintStream;
  nodePrintStream << *notexpr;
  REQUIRE(nodePrintStream.str() == "not x;");

  // test getters
  REQUIRE(rhs.get() == notexpr->getRight());

  // test getchildren
  auto children = notexpr->getChildren();
  REQUIRE(children.size() == 1);
  REQUIRE(contains(children, rhs.get()));

  // test accept
  RecordPostPrint visitor;
  notexpr->accept(&visitor);
  std::string expected[] = { "x", "not x" };
  for (int i=0; i < 2; i++) {
    REQUIRE(visitor.postPrintStrings[i] == expected[i]);
  }
}

// ---------------- test creation in progress ------------------------ //

TEST_CASE("ASTIncStmtTest", "[ASTIncStmt]") {
  auto num = std::make_shared<ASTNumberExpr>(42);
  auto lhs = std::make_shared<ASTIncStmt>(num);

  // Test Print Method
  std::stringstream nodePrintStream;
  nodePrintStream << *lhs;
  REQUIRE(nodePrintStream.str() == "42++");

  // Test getters 
  REQUIRE(lhs->getNum() == num.get());

  // Test getChildren
  auto children = lhs->getChildren();
  REQUIRE(children.size() == 1);
  REQUIRE(contains(children, num.get()));

  // Test accept
  RecordPostPrint visitor;
  lhs->accept(&visitor);
  std::string expected[] = { "42" };
  for (int i=0; i < 1; i++) {
    REQUIRE(visitor.postPrintStrings[i] == expected[i]);
  }
}

TEST_CASE("ASTDecStmtTest", "[ASTDecStmt]") {
  auto num = std::make_shared<ASTNumberExpr>(42);
  auto lhs = std::make_shared<ASTDecStmt>(num);

  // Test Print Method
  std::stringstream nodePrintStream;
  nodePrintStream << *lhs;
  REQUIRE(nodePrintStream.str() == "42--");

  // Test getters 
  REQUIRE(lhs->getNum() == num.get());

  // Test getChildren
  auto children = lhs->getChildren();
  REQUIRE(children.size() == 1);
  REQUIRE(contains(children, num.get()));

  // Test accept
  RecordPostPrint visitor;
  lhs->accept(&visitor);
  std::string expected[] = { "42" };
  for (int i=0; i < 1; i++) {
    REQUIRE(visitor.postPrintStrings[i] == expected[i]);
  }
}

TEST_CASE("ASTTernaryCondExprTest", "[ASTTernaryCondExpr]") {
  auto left = std::make_shared<ASTNumberExpr>(20);
  auto right = std::make_shared<ASTNumberExpr>(10);
  auto cond = std::make_shared<ASTBinaryExpr>(">", left, right);
  auto rhs = std::make_shared<ASTTernaryCondExpr>(cond, left, right);

  // Test Print Method
  std::stringstream nodePrintStream;
  nodePrintStream << *rhs;
  REQUIRE(nodePrintStream.str() == "(20>10) ? 20 : 10");

  // Test getters 
  REQUIRE(rhs->getCondition() == cond.get());
  REQUIRE(rhs->getThen() == left.get());
  REQUIRE(rhs->getElse() == right.get());

  // Test getChildren
  auto children = rhs->getChildren();
  REQUIRE(children.size() == 3);
  REQUIRE(contains(children, cond.get()));
  REQUIRE(contains(children, left.get()));
  REQUIRE(contains(children, right.get()));

  // Test accept
  RecordPostPrint visitor;
  rhs->accept(&visitor);
  std::string expected[] = { "20", "10", "(20>10)", "20", "10" };
  for (int i=0; i < 5; i++) {
    REQUIRE(visitor.postPrintStrings[i] == expected[i]);
  }
}

TEST_CASE("ASTTForItrStmtTest", "[ASTForItrStmt]") {
  auto num = std::make_shared<ASTNumberExpr>(42);
  auto stmt = std::make_shared<ASTIncStmt>(num);
  auto var = std::make_shared<ASTVariableExpr>("x");
  auto iterable = std::make_shared<ASTVariableExpr>("arr");
  auto itr = std::make_shared<ASTForItrStmt>(var, iterable, stmt);

  // Test Print Method
  std::stringstream nodePrintStream;
  nodePrintStream << *itr;
  REQUIRE(nodePrintStream.str() == "for (x : arr) 42++");

  // Test getters 
  REQUIRE(itr->getVar() == var.get());
  REQUIRE(itr->getIterable() == iterable.get());
  REQUIRE(itr->getStmt() == stmt.get());

  // Test getChildren
  auto children = itr->getChildren();
  REQUIRE(children.size() == 3);
  REQUIRE(contains(children, var.get()));
  REQUIRE(contains(children, iterable.get()));
  REQUIRE(contains(children, stmt.get()));

  // Test accept
  RecordPostPrint visitor;
  itr->accept(&visitor);
  std::string expected[] = { "x", "arr", "42" };
  for (int i=0; i < 3; i++) {
    REQUIRE(visitor.postPrintStrings[i] == expected[i]);
  }
}

TEST_CASE("ASTTForRangeStmtTest", "[ASTForRangeStmt]") {
  auto num = std::make_shared<ASTNumberExpr>(42);
  auto num2 = std::make_shared<ASTNumberExpr>(50);
  auto stmt = std::make_shared<ASTIncStmt>(num);
  auto var = std::make_shared<ASTVariableExpr>("x");
  auto range = std::make_shared<ASTForRangeStmt>(var, num, num2, num, stmt);

  // Test Print Method
  std::stringstream nodePrintStream;
  nodePrintStream << *range;
  REQUIRE(nodePrintStream.str() == "for (x : 42 .. 50 by 42) 42++");

  // Test getters 
  REQUIRE(range->getVar() == var.get());
  REQUIRE(range->getLBound() == num.get());
  REQUIRE(range->getRBound() == num2.get());
  REQUIRE(range->getStep() == num.get());
  REQUIRE(range->getStmt() == stmt.get());

  // Test getChildren
  auto children = range->getChildren();
  REQUIRE(children.size() == 5);
  REQUIRE(contains(children, var.get()));
  REQUIRE(contains(children, num.get()));
  REQUIRE(contains(children, num2.get()));
  REQUIRE(contains(children, num.get()));
  REQUIRE(contains(children, stmt.get()));

  // Test accept
  RecordPostPrint visitor;
  range->accept(&visitor);
  std::string expected[] = { "x", "42", "50", "42", "42", "42++" };
  for (int i=0; i < 6; i++) {
    REQUIRE(visitor.postPrintStrings[i] == expected[i]);
  }
}

TEST_CASE("ASTRelationalOperatorsTest", "[ASTBinaryExpr]") {
  auto left = std::make_shared<ASTNumberExpr>(20);
  auto right = std::make_shared<ASTNumberExpr>(10);
  auto cond = std::make_shared<ASTBinaryExpr>(">=", left, right);
  auto cond2 = std::make_shared<ASTBinaryExpr>("<", left, right);
  auto cond3 = std::make_shared<ASTBinaryExpr>("<=", left, right);

  // Test Print Method
  std::stringstream nodePrintStream;
  nodePrintStream << *cond;
  REQUIRE(nodePrintStream.str() == "(20>=10)");

  std::stringstream node2PrintStream;
  node2PrintStream << *cond2;
  REQUIRE(node2PrintStream.str() == "(20<10)");

  std::stringstream node3PrintStream;
  node3PrintStream << *cond3;
  REQUIRE(node3PrintStream.str() == "(20<=10)");

  // Test getters 
  REQUIRE(cond->getOp() == ">=");
  REQUIRE(cond->getLeft() == left.get());
  REQUIRE(cond->getRight() == right.get());
  REQUIRE(cond2->getOp() == "<");
  REQUIRE(cond3->getOp() == "<=");

  // Test getChildren
  auto children = cond->getChildren();
  REQUIRE(children.size() == 2);
  REQUIRE(contains(children, left.get()));
  REQUIRE(contains(children, right.get()));

  // Test accept
  RecordPostPrint visitor;
  cond->accept(&visitor);
  std::string expected[] = { "20", "10", "(20>=10)"};
  for (int i=0; i < 3; i++) {
    REQUIRE(visitor.postPrintStrings[i] == expected[i]);
  }
}