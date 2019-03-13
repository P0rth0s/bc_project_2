// Generated from Bc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BcParser}.
 */
public interface BcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BcParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(BcParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(BcParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(BcParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(BcParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BcParser#topExpr}.
	 * @param ctx the parse tree
	 */
	void enterTopExpr(BcParser.TopExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BcParser#topExpr}.
	 * @param ctx the parse tree
	 */
	void exitTopExpr(BcParser.TopExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code retexpr}
	 * labeled alternative in {@link BcParser#adv_expr}.
	 * @param ctx the parse tree
	 */
	void enterRetexpr(BcParser.RetexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code retexpr}
	 * labeled alternative in {@link BcParser#adv_expr}.
	 * @param ctx the parse tree
	 */
	void exitRetexpr(BcParser.RetexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link BcParser#adv_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(BcParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link BcParser#adv_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(BcParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifLoop}
	 * labeled alternative in {@link BcParser#adv_expr}.
	 * @param ctx the parse tree
	 */
	void enterIfLoop(BcParser.IfLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifLoop}
	 * labeled alternative in {@link BcParser#adv_expr}.
	 * @param ctx the parse tree
	 */
	void exitIfLoop(BcParser.IfLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link BcParser#adv_expr}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(BcParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link BcParser#adv_expr}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(BcParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forLoop}
	 * labeled alternative in {@link BcParser#adv_expr}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(BcParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forLoop}
	 * labeled alternative in {@link BcParser#adv_expr}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(BcParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link BcParser#boolean_expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(BcParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link BcParser#boolean_expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(BcParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSub(BcParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSub(BcParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMult(BcParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMult(BcParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mod}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMod(BcParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mod}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMod(BcParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multSet}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultSet(BcParser.MultSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multSet}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultSet(BcParser.MultSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code log}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLog(BcParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by the {@code log}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLog(BcParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cos}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCos(BcParser.CosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cos}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCos(BcParser.CosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code increment}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIncrement(BcParser.IncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code increment}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIncrement(BcParser.IncrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modSet}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterModSet(BcParser.ModSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modSet}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitModSet(BcParser.ModSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idval}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdval(BcParser.IdvalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idval}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdval(BcParser.IdvalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDiv(BcParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDiv(BcParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqrt}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSqrt(BcParser.SqrtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqrt}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSqrt(BcParser.SqrtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunction(BcParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunction(BcParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powSet}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowSet(BcParser.PowSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powSet}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowSet(BcParser.PowSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subSet}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubSet(BcParser.SubSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subSet}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubSet(BcParser.SubSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sin}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSin(BcParser.SinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sin}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSin(BcParser.SinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pow}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPow(BcParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPow(BcParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(BcParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(BcParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRead(BcParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRead(BcParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code e}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterE(BcParser.EContext ctx);
	/**
	 * Exit a parse tree produced by the {@code e}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitE(BcParser.EContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesis}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(BcParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesis}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(BcParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code flt}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFlt(BcParser.FltContext ctx);
	/**
	 * Exit a parse tree produced by the {@code flt}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFlt(BcParser.FltContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divSet}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivSet(BcParser.DivSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divSet}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivSet(BcParser.DivSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSet}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSet(BcParser.AddSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSet}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSet(BcParser.AddSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decrement}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDecrement(BcParser.DecrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decrement}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDecrement(BcParser.DecrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negate}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegate(BcParser.NegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negate}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegate(BcParser.NegateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defineVar}
	 * labeled alternative in {@link BcParser#assignment_expr}.
	 * @param ctx the parse tree
	 */
	void enterDefineVar(BcParser.DefineVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defineVar}
	 * labeled alternative in {@link BcParser#assignment_expr}.
	 * @param ctx the parse tree
	 */
	void exitDefineVar(BcParser.DefineVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defineFunc}
	 * labeled alternative in {@link BcParser#assignment_expr}.
	 * @param ctx the parse tree
	 */
	void enterDefineFunc(BcParser.DefineFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defineFunc}
	 * labeled alternative in {@link BcParser#assignment_expr}.
	 * @param ctx the parse tree
	 */
	void exitDefineFunc(BcParser.DefineFuncContext ctx);
}