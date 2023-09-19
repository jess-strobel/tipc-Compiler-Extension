// Generated from TIP.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TIPParser}.
 */
public interface TIPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TIPParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TIPParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TIPParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TIPParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TIPParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(TIPParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TIPParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(TIPParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TIPParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(TIPParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TIPParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(TIPParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TIPParser#nameDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNameDeclaration(TIPParser.NameDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TIPParser#nameDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNameDeclaration(TIPParser.NameDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrLenOpExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrLenOpExpr(TIPParser.ArrLenOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrLenOpExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrLenOpExpr(TIPParser.ArrLenOpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNullExpr(TIPParser.NullExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNullExpr(TIPParser.NullExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTrueExpr(TIPParser.TrueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTrueExpr(TIPParser.TrueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code allocExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAllocExpr(TIPParser.AllocExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code allocExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAllocExpr(TIPParser.AllocExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrConstructorExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrConstructorExpr(TIPParser.ArrConstructorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrConstructorExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrConstructorExpr(TIPParser.ArrConstructorExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(TIPParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(TIPParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code deRefExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDeRefExpr(TIPParser.DeRefExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code deRefExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDeRefExpr(TIPParser.DeRefExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(TIPParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(TIPParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryCondExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTernaryCondExpr(TIPParser.TernaryCondExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryCondExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTernaryCondExpr(TIPParser.TernaryCondExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFalseExpr(TIPParser.FalseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFalseExpr(TIPParser.FalseExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funAppExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunAppExpr(TIPParser.FunAppExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funAppExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunAppExpr(TIPParser.FunAppExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code accessExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAccessExpr(TIPParser.AccessExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code accessExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAccessExpr(TIPParser.AccessExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recordRule}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRecordRule(TIPParser.RecordRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recordRule}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRecordRule(TIPParser.RecordRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrBinRefOpExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrBinRefOpExpr(TIPParser.ArrBinRefOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrBinRefOpExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrBinRefOpExpr(TIPParser.ArrBinRefOpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negNumber}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegNumber(TIPParser.NegNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negNumber}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegNumber(TIPParser.NegNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inputExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInputExpr(TIPParser.InputExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInputExpr(TIPParser.InputExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOpExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOpExpr(TIPParser.BinaryOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOpExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOpExpr(TIPParser.BinaryOpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(TIPParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(TIPParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumExpr(TIPParser.NumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumExpr(TIPParser.NumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr(TIPParser.VarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr(TIPParser.VarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(TIPParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(TIPParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRefExpr(TIPParser.RefExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRefExpr(TIPParser.RefExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticNegExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticNegExpr(TIPParser.ArithmeticNegExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticNegExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticNegExpr(TIPParser.ArithmeticNegExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpr(TIPParser.MultiplicativeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpr(TIPParser.MultiplicativeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(TIPParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link TIPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(TIPParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TIPParser#arrayConstructorExpr}.
	 * @param ctx the parse tree
	 */
	void enterArrayConstructorExpr(TIPParser.ArrayConstructorExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TIPParser#arrayConstructorExpr}.
	 * @param ctx the parse tree
	 */
	void exitArrayConstructorExpr(TIPParser.ArrayConstructorExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TIPParser#recordExpr}.
	 * @param ctx the parse tree
	 */
	void enterRecordExpr(TIPParser.RecordExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TIPParser#recordExpr}.
	 * @param ctx the parse tree
	 */
	void exitRecordExpr(TIPParser.RecordExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TIPParser#fieldExpr}.
	 * @param ctx the parse tree
	 */
	void enterFieldExpr(TIPParser.FieldExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TIPParser#fieldExpr}.
	 * @param ctx the parse tree
	 */
	void exitFieldExpr(TIPParser.FieldExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TIPParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TIPParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TIPParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TIPParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TIPParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(TIPParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TIPParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(TIPParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TIPParser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmt(TIPParser.BlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TIPParser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmt(TIPParser.BlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TIPParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(TIPParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TIPParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(TIPParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TIPParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(TIPParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TIPParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(TIPParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TIPParser#outputStmt}.
	 * @param ctx the parse tree
	 */
	void enterOutputStmt(TIPParser.OutputStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TIPParser#outputStmt}.
	 * @param ctx the parse tree
	 */
	void exitOutputStmt(TIPParser.OutputStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TIPParser#errorStmt}.
	 * @param ctx the parse tree
	 */
	void enterErrorStmt(TIPParser.ErrorStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TIPParser#errorStmt}.
	 * @param ctx the parse tree
	 */
	void exitErrorStmt(TIPParser.ErrorStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TIPParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(TIPParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TIPParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(TIPParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TIPParser#incStmt}.
	 * @param ctx the parse tree
	 */
	void enterIncStmt(TIPParser.IncStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TIPParser#incStmt}.
	 * @param ctx the parse tree
	 */
	void exitIncStmt(TIPParser.IncStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TIPParser#decStmt}.
	 * @param ctx the parse tree
	 */
	void enterDecStmt(TIPParser.DecStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TIPParser#decStmt}.
	 * @param ctx the parse tree
	 */
	void exitDecStmt(TIPParser.DecStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TIPParser#forItrStmt}.
	 * @param ctx the parse tree
	 */
	void enterForItrStmt(TIPParser.ForItrStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TIPParser#forItrStmt}.
	 * @param ctx the parse tree
	 */
	void exitForItrStmt(TIPParser.ForItrStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TIPParser#forRangeStmt}.
	 * @param ctx the parse tree
	 */
	void enterForRangeStmt(TIPParser.ForRangeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TIPParser#forRangeStmt}.
	 * @param ctx the parse tree
	 */
	void exitForRangeStmt(TIPParser.ForRangeStmtContext ctx);
}