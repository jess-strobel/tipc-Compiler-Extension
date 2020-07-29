#include "TypeConstraintVisitor.h"
#include "TipVar.h"
#include "TipFunction.h"
#include "TipAlpha.h"
#include "TipRef.h"
#include "TipInt.h"
#include <memory>

/**
 * Any given Term can be shared by multiple constraints. As such, we use a shared_ptr.
 */
TypeConstraintVisitor::TypeConstraintVisitor(SymbolTable &table, std::set<std::string> &appearingFields)
  : symbolTable(table), appearingFields(appearingFields) {};

std::vector<TypeConstraint> TypeConstraintVisitor::get_constraints() {
    return constraints;
}

void TypeConstraintVisitor::endVisit(ASTProgram * element) {
    auto main = element->findFunctionByName(ENTRYPOINT_NAME);
    if(main == nullptr) {
        // TODO (nphair): Figure out what we want to do here.
        return;
    }

    for(auto formal : main->getFormals()) {
        auto name = symbolTable.getLocal(formal->getName(), main->getDecl());
        auto var = std::make_shared<TipVar>(name);
        auto tipInt = std::make_shared<TipInt>();
        TypeConstraint typeConstraint(var, tipInt);
        constraints.push_back(typeConstraint);
    }
    auto returnStatement = main->getStmts().back();
    auto var = std::make_shared<TipVar>(returnStatement);
    auto tipInt = std::make_shared<TipInt>();

    TypeConstraint constraint(var, tipInt);
    constraints.push_back(constraint);
}


bool TypeConstraintVisitor::visit(ASTFunction * element) {
    scope.push(element->getDecl());
    return true;
}

void TypeConstraintVisitor::endVisit(ASTFunction * element) {
    auto node = std::make_shared<TipVar>(element);

    auto ret = visitResults.top();
    for(auto &_ : element->getStmts()) {
        visitResults.pop();
    }

    for(auto &_ : element->getDeclarations()) {
        visitResults.pop();
    }

    std::vector<std::shared_ptr<TipType>> formals;
    for(auto &_ : element->getFormals()) {
        formals.push_back(visitResults.top());
        visitResults.pop();
    }
    auto tipFunction = std::make_shared<TipFunction>(formals, ret);

    TypeConstraint constraint(visitResults.top(), tipFunction);
    visitResults.pop();
    constraints.push_back(constraint);
    visitResults.push(node);
    scope.pop();
}

void TypeConstraintVisitor::endVisit(ASTNumberExpr * element) {
    auto node = std::make_shared<TipVar>(element);

    TypeConstraint constraint(node, std::make_shared<TipInt>());
    constraints.push_back(constraint);
    visitResults.push(node);
}

void TypeConstraintVisitor::endVisit(ASTVariableExpr * element) {
    ASTDeclNode * canonical;
    if((canonical = symbolTable.getLocal(element->getName(), scope.top()))) {
        visitResults.push(std::make_shared<TipVar>(canonical));
    } else if((canonical = symbolTable.getFunction(element->getName()))) {
        visitResults.push(std::make_shared<TipVar>(canonical));
    } else {
        assert(0);
    }
}

void TypeConstraintVisitor::endVisit(ASTBinaryExpr  * element) {
    auto node = std::make_shared<TipVar>(element);
    auto e2 = visitResults.top();
    visitResults.pop();
    auto e1 = visitResults.top();
    visitResults.pop();
    auto tipInt = std::make_shared<TipInt>();

    TypeConstraint constraint1(e1, e2);
    TypeConstraint constraint2(e1, node);
    TypeConstraint constraint3(e1, tipInt);
    TypeConstraint constraint4(e2, node);
    TypeConstraint constraint5(e2, tipInt);
    TypeConstraint constraint6(node, tipInt);

    if(element->getOp() == "==") {
        constraints.push_back(constraint1);
        constraints.push_back(constraint6);
    } else {
        constraints.push_back(constraint1);
        constraints.push_back(constraint2);
        constraints.push_back(constraint3);
        constraints.push_back(constraint4);
        constraints.push_back(constraint5);
        constraints.push_back(constraint6);
    }
    visitResults.push(node);
}

void TypeConstraintVisitor::endVisit(ASTInputExpr * element) {
    auto node = std::make_shared<TipVar>(element);

    TypeConstraint constraint(node, std::make_shared<TipInt>());
    constraints.push_back(constraint);
    visitResults.push(node);
}

void TypeConstraintVisitor::endVisit(ASTFunAppExpr  * element) {
    auto node = std::make_shared<TipVar>(element);
    std::vector<std::shared_ptr<TipType>> actuals;
    for(auto _ : element->getActuals()) {
        actuals.push_back(visitResults.top());
        visitResults.pop();
    }
    auto function = std::make_shared<TipFunction>(actuals, node);
    auto application = visitResults.top();
    visitResults.pop();

    TypeConstraint constraint(application, function);
    constraints.push_back(constraint);
    visitResults.push(node);
}

void TypeConstraintVisitor::endVisit(ASTAllocExpr * element) {
    auto node = std::make_shared<TipVar>(element);
    auto initializer = visitResults.top();
    visitResults.pop();
    auto tipRef = std::make_shared<TipRef>(initializer);

    TypeConstraint constraint(node, tipRef);
    constraints.push_back(constraint);
    visitResults.push(node);
}


void TypeConstraintVisitor::endVisit(ASTRefExpr * element) {
    auto node = std::make_shared<TipVar>(element);
    auto var = visitResults.top();
    visitResults.pop();
    auto tipRef = std::make_shared<TipRef>(var);

    TypeConstraint constraint(node, tipRef);
    constraints.push_back(constraint);
    visitResults.push(node);
}

void TypeConstraintVisitor::endVisit(ASTDeRefExpr * element) {
    auto node = std::make_shared<TipVar>(element);
    auto tipRef = std::make_shared<TipRef>(node);
    auto dereferenced = visitResults.top();
    visitResults.pop();

    TypeConstraint constraint(dereferenced, tipRef);
    constraints.push_back(constraint);

    visitResults.push(node);
}

void TypeConstraintVisitor::endVisit(ASTNullExpr * element) {
    auto node = std::make_shared<TipVar>(element);
    auto tipAlpha = std::make_shared<TipAlpha>("");
    auto tipRef = std::make_shared<TipRef>(tipAlpha);

    TypeConstraint constraint(node, tipRef);
    constraints.push_back(constraint);

    visitResults.push(node);
}

// Variable Declarations make no constraints.
void TypeConstraintVisitor::endVisit(ASTDeclStmt * element) {
    auto node = std::make_shared<TipVar>(element);
    for(auto &_ : element->getVars()) {
        visitResults.pop();
    }
    visitResults.push(node);
}

// No need to to a symbol table lookup. These are the canonical forms.
void TypeConstraintVisitor::endVisit(ASTDeclNode * element) {
    auto node = std::make_shared<TipVar>(element);
    visitResults.push(node);
}

void TypeConstraintVisitor::endVisit(ASTVariableAssignStmt  * element) {
    auto node = std::make_shared<TipVar>(element);
    auto rhs = visitResults.top();
    visitResults.pop();
    auto lhs = visitResults.top();
    visitResults.pop();

    TypeConstraint constraint(lhs, rhs);
    constraints.push_back(constraint);
    visitResults.push(node);
}

void TypeConstraintVisitor::endVisit(ASTWhileStmt * element) {
    auto node = std::make_shared<TipVar>(element);
    visitResults.pop();
    auto condition = visitResults.top();
    visitResults.pop();

    TypeConstraint constraint(condition, std::make_shared<TipInt>());
    constraints.push_back(constraint);
    visitResults.push(node);
}

void TypeConstraintVisitor::endVisit(ASTIfStmt * element) {
    auto node = std::make_shared<TipVar>(element);
    if (element->getElse() != nullptr) {
        visitResults.pop();
    }
    visitResults.pop();
    auto condition = visitResults.top();
    visitResults.pop();

    TypeConstraint constraint(condition, std::make_shared<TipInt>());
    constraints.push_back(constraint);
    visitResults.push(node);
}

void TypeConstraintVisitor::endVisit(ASTOutputStmt * element) {
    auto node = std::make_shared<TipVar>(element);
    auto argument = visitResults.top();
    visitResults.pop();
    auto tipInt = std::make_shared<TipInt>();

    TypeConstraint constraint(argument, tipInt);
    constraints.push_back(constraint);
    visitResults.push(node);
}

void TypeConstraintVisitor::endVisit(ASTReturnStmt * element) {
    auto var = std::make_shared<TipVar>(element);
    visitResults.pop();
    visitResults.push(var);
}

void TypeConstraintVisitor::endVisit(ASTFieldExpr  * element) {
    // NOT IMPLEMENTED.
    assert(0);
}

void TypeConstraintVisitor::endVisit(ASTRecordExpr * element) {
    // NOT IMPLEMENTED.
    assert(0);
}

// TODO (nphair). Uh-oh, keys in a record don't map to decl nodes. They should,
// they are identifiers.
void TypeConstraintVisitor::endVisit(ASTAccessExpr * element) {
    assert(0);
    //auto node = std::make_shared<TipVar>(element);
    //auto record = visitResults.top();
    //visitResults.pop();

    //std::vector<std::shared_ptr<TipType>> fields;
    //for(auto &field : appearingFields) {
    //    if(field == element->getField()) {
    //        //fields.push_back(std::make_shared<TipVar>(symbolTable.getLocal(field));
    //    } else {
    //        fields.push_back(std::make_shared<TipAlpha>());
    //    }
    //}
    //visitResults.pop();
}

void TypeConstraintVisitor::endVisit(ASTErrorStmt * element) {
    auto node = std::make_shared<TipVar>(element);
    auto argument = visitResults.top();
    visitResults.pop();
    auto tipInt = std::make_shared<TipInt>();

    TypeConstraint constraint(argument, tipInt);
    constraints.push_back(constraint);
    visitResults.push(node);
}

void TypeConstraintVisitor::endVisit(ASTBlockStmt * element) {
    auto node = std::make_shared<TipVar>(element);
    for(auto &_ : element->getStmts()) {
        visitResults.pop();
    }
    visitResults.push(node);
}

void TypeConstraintVisitor::endVisit(ASTPointerAssignStmt *element) {
    auto node = std::make_shared<TipVar>(element);
    auto rhs = std::make_shared<TipRef>(visitResults.top());
    visitResults.pop();
    auto lhs = visitResults.top();
    visitResults.pop();

    TypeConstraint constraint(lhs, rhs);
    constraints.push_back(constraint);
    visitResults.push(node);
}

