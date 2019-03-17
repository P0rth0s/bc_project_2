// Generated from Bc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BcParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(BcParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(BcParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BcParser#topExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopExpr(BcParser.TopExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code retexpr}
	 * labeled alternative in {@link BcParser#adv_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetexpr(BcParser.RetexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link BcParser#adv_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(BcParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifLoop}
	 * labeled alternative in {@link BcParser#adv_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfLoop(BcParser.IfLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link BcParser#adv_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(BcParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forLoop}
	 * labeled alternative in {@link BcParser#adv_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(BcParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ret}
	 * labeled alternative in {@link BcParser#adv_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet(BcParser.RetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link BcParser#boolean_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(BcParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(BcParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(BcParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mod}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(BcParser.ModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multSet}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultSet(BcParser.MultSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code log}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(BcParser.LogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cos}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCos(BcParser.CosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code increment}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement(BcParser.IncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modSet}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModSet(BcParser.ModSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idval}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdval(BcParser.IdvalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(BcParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqrt}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrt(BcParser.SqrtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(BcParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powSet}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowSet(BcParser.PowSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subSet}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubSet(BcParser.SubSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sin}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSin(BcParser.SinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pow}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(BcParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(BcParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code read}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(BcParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code e}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(BcParser.EContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesis}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(BcParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code flt}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlt(BcParser.FltContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divSet}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivSet(BcParser.DivSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSet}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSet(BcParser.AddSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decrement}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrement(BcParser.DecrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negate}
	 * labeled alternative in {@link BcParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegate(BcParser.NegateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defineVar}
	 * labeled alternative in {@link BcParser#assignment_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineVar(BcParser.DefineVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defineFunc}
	 * labeled alternative in {@link BcParser#assignment_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineFunc(BcParser.DefineFuncContext ctx);
}