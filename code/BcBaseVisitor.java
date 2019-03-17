// Generated from Bc.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import java.util.*;
/**
 * This class provides an empty implementation of {@link BcVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <Float> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class BcBaseVisitor extends AbstractParseTreeVisitor<Float> implements BcVisitor<Float> {

	List<HashMap<String, Float>> var_map_list = new ArrayList<HashMap<String, Float>>();

	//Following hashmaps are for functions
	HashMap<String, List<BcParser.Adv_exprContext>> func_map = new HashMap<String, List<BcParser.Adv_exprContext>>();
	HashMap<String, List<String>> func_map_params = new HashMap<String, List<String>>();

	public Float findVar(String txt) {
		for(int i = var_map_list.size()-1; i > -1; i--) {
			HashMap<String, Float> varScope = var_map_list.get(i);
			if(varScope.get(txt) != null) {
				float f = varScope.get(txt); 
				return f;
			}
		}
		return (float) 0;
	}

	public Float varPut(String txt, Float val) {
		int i = var_map_list.size()-1;
		HashMap<String, Float> varScope = var_map_list.get(i);
		varScope.put(txt, val);
		return val;
	}

	@Override public Float visitAssignment(BcParser.AssignmentContext ctx) { return visitChildren(ctx); }

	@Override public Float visitS(BcParser.SContext ctx) {
		//create global scope
		HashMap<String, Float> global = new HashMap<String, Float>();
		var_map_list.add(global);
		return visitChildren(ctx);
	}

	@Override public Float visitExprList(BcParser.ExprListContext ctx) { return visitChildren(ctx); }

	@Override public Float visitTopExpr(BcParser.TopExprContext ctx) { 
		Float res = visitChildren(ctx);
		System.out.println("Result: " + res);
		return res;
	}

	@Override public Float visitRetexpr(BcParser.RetexprContext ctx) { return visitChildren(ctx); }

	@Override public Float visitIfLoop(BcParser.IfLoopContext ctx) {
		int i = 0;
		for(BcParser.Boolean_exprContext boolean_expr : ctx.boolean_expr()) {
			if(this.visit(boolean_expr) == 1) {
				return this.visit(ctx.adv_expr(i));
			}
			i++;
		}
		if(ctx.adv_expr(i) != null) {
			return this.visit(ctx.adv_expr(i));
		}
		return (float) 0;
	}

	@Override public Float visitWhileLoop(BcParser.WhileLoopContext ctx) {
		while(this.visit(ctx.boolean_expr()) != 0) {
			for (BcParser.Adv_exprContext adv_expr : ctx.adv_expr()) {
				this.visit(adv_expr);
			}
		}
		return (float) 0;
	}

	@Override public Float visitForLoop(BcParser.ForLoopContext ctx) {
		if(ctx.assignment_expr() != null) {
			this.visit(ctx.assignment_expr());
		}
		while(this.visit(ctx.boolean_expr()) == 1) {
			for (BcParser.Adv_exprContext adv_expr : ctx.adv_expr()) {
				this.visit(adv_expr);
			}
			this.visit(ctx.expr());
		}
		return (float) 0;
	}

	@Override public Float visitBoolean(BcParser.BooleanContext ctx) {
		if ( ctx.op.getType() == BcParser.OR ) {
			Float left = visit(ctx.expr(0));
			Float right = visit(ctx.expr(1));
			if(left != 0 || right != 0) {
				return (float) 1;
			} else {
				return (float) 0;
			}
		}
		if ( ctx.op.getType() == BcParser.AND ) {
			Float left = visit(ctx.expr(0));
			Float right = visit(ctx.expr(1));
			if(left != 0 && right != 0) {
				return (float) 1;
			} else {
				return (float) 0;
			}
		}
		if ( ctx.op.getType() == BcParser.NOT ) {
			Float exp = visitChildren(ctx);
			if( exp == 0 ) {
				return (float) 1;
			} else {
				return (float) 0;
			}
		}
		if ( ctx.op.getType() == BcParser.LT ) {
			Float left = visit(ctx.expr(0));
			Float right = visit(ctx.expr(1));
			if( left < right ) {
				return (float) 1;
			} else {
				return (float) 0;
			}
		}
		if ( ctx.op.getType() == BcParser.GT ) {
			Float left = visit(ctx.expr(0));
			Float right = visit(ctx.expr(1));
			if( left > right ) {
				return (float) 1;
			} else {
				return (float) 0;
			}
		}
		if ( ctx.op.getType() == BcParser.EQ ) {
			Float left = visit(ctx.expr(0));
			Float right = visit(ctx.expr(1));
			if( left == right ) {
				return (float) 1;
			} else {
				return (float) 0;
			}
		}
		if ( ctx.op.getType() == BcParser.NE ) {
			Float left = visit(ctx.expr(0));
			Float right = visit(ctx.expr(1));
			if( left != right ) {
				return (float) 1;
			} else {
				return (float) 0;
			}
		}
		else return (float) -1;
	}

	@Override public Float visitAdd(BcParser.AddContext ctx) {
		Float left = visit(ctx.expr(0));
		Float right = visit(ctx.expr(1));
		return left + right;
	}

	@Override public Float visitSub(BcParser.SubContext ctx) {
		Float left = visit(ctx.expr(0));
		Float right = visit(ctx.expr(1));
		return left - right;
	}

	@Override public Float visitRead(BcParser.ReadContext ctx) {
		System.out.print("Please enter a number: ");
		Scanner scan = new Scanner(System.in);
		Float num = Float.parseFloat(scan.next());
		return num;
	}

	@Override public Float visitMult(BcParser.MultContext ctx) {
		Float left = visit(ctx.expr(0));
		Float right = visit(ctx.expr(1));
		return left * right;
	}

	@Override public Float visitMod(BcParser.ModContext ctx) {
		Float left = visit(ctx.expr(0));
		Float right = visit(ctx.expr(1));
		return left % right;
	}

	@Override public Float visitMultSet(BcParser.MultSetContext ctx) {
		float f=findVar(ctx.id.getText()); 
		f = f * visitChildren(ctx);
		varPut(ctx.id.getText(), f);
		return f;
	}

	@Override public Float visitLog(BcParser.LogContext ctx) {
		return (float)Math.log(visit(ctx.expr()));
	}

	@Override public Float visitE(BcParser.EContext ctx) {
		return (float)Math.exp(visit(ctx.expr()));
	}

	@Override public Float visitCos(BcParser.CosContext ctx) {
		return (float)Math.cos(visit(ctx.expr()));
	}

	@Override public Float visitIncrement(BcParser.IncrementContext ctx) {
		Float f=findVar(ctx.id.getText());
		f++;
		varPut(ctx.id.getText(), f);
		return f;
	}

	@Override public Float visitModSet(BcParser.ModSetContext ctx) {
		float f=findVar(ctx.id.getText()); 
		f = f % visitChildren(ctx);
		varPut(ctx.id.getText(), f);
		return f;
	}

	@Override public Float visitParenthesis(BcParser.ParenthesisContext ctx) {
		return visit(ctx.expr());
	}

	@Override public Float visitFlt(BcParser.FltContext ctx) {
		return Float.parseFloat(ctx.FLOAT().getText());
	}

	@Override public Float visitIdval(BcParser.IdvalContext ctx) {
		Float val = findVar(ctx.id.getText());
		if(val == null) {
			return (float) 0;
		}
		return val;
	}

	@Override public Float visitDiv(BcParser.DivContext ctx) {
		Float left = visit(ctx.expr(0));
		Float right = visit(ctx.expr(1));
		return left / right;
	}

	@Override public Float visitDivSet(BcParser.DivSetContext ctx) {
		float f=findVar(ctx.id.getText()); 
		f = f / visitChildren(ctx);
		varPut(ctx.id.getText(), f);
		return f;
	}

	@Override public Float visitAddSet(BcParser.AddSetContext ctx) {
		float f=findVar(ctx.id.getText()); 
		f = f + visitChildren(ctx);
		varPut(ctx.id.getText(), f);
		return f;
	}

	@Override public Float visitSqrt(BcParser.SqrtContext ctx) {
		return (float)Math.pow(visit(ctx.expr()), 0.5);
	}

	@Override public Float visitDecrement(BcParser.DecrementContext ctx) {
		Float f=findVar(ctx.id.getText());
		if(f == null) {
			System.out.println("No variable " + ctx.id.getText());
			return null;
		}
		f--;
		varPut(ctx.id.getText(), f);
		return f;
	}

	@Override public Float visitNegate(BcParser.NegateContext ctx) {
		return -1 * visitChildren(ctx);
	}

	@Override public Float visitPowSet(BcParser.PowSetContext ctx) {
		float f=findVar(ctx.id.getText()); 
		f = (float) Math.pow(f, visitChildren(ctx)); 
		varPut(ctx.id.getText(), f);
		return f;
	}

	@Override public Float visitSubSet(BcParser.SubSetContext ctx) {
		float f=findVar(ctx.id.getText()); 
		f = f - visitChildren(ctx);
		varPut(ctx.id.getText(), f);
		return f;
	}

	@Override public Float visitSin(BcParser.SinContext ctx) {
		return (float)Math.sin(visit(ctx.expr()));
	}

	@Override public Float visitPow(BcParser.PowContext ctx) {
		Float left = visit(ctx.expr(0));
		Float right = visit(ctx.expr(1));
		return (float)Math.pow(left, right);
	}

	@Override public Float visitDefineVar(BcParser.DefineVarContext ctx) {
		Float exp = visitChildren(ctx);
		varPut(ctx.id.getText(), exp);
		return exp;
	}

	@Override public Float visitDefineFunc(BcParser.DefineFuncContext ctx) {
		List<BcParser.Adv_exprContext> exprList = new ArrayList<BcParser.Adv_exprContext>();
		for(BcParser.Adv_exprContext adv_expr : ctx.adv_expr()) {
			exprList.add(adv_expr);
		}
		func_map.put(ctx.id.getText(), exprList);
		List<String> idList = new ArrayList<String>();
		int i = 1;
		while(ctx.ID(i) != null) {
			String str = ctx.ID(i).getText();
			idList.add(str);
			func_map_params.put(ctx.id.getText(), idList);
			i++;
		}
		return (float) 0;
	}

	boolean ret_hit = false;

	@Override public Float visitRet(BcParser.RetContext ctx) {
		ret_hit = true;
		return visitChildren(ctx);
	}

	@Override public Float visitFunction(BcParser.FunctionContext ctx) {

		HashMap<String, Float> scope = new HashMap<String, Float>();
		var_map_list.add(scope);

		List<String> idList = func_map_params.get(ctx.id.getText());
		if(idList != null) {
			int i = 0;
			for(String id : idList) {
				varPut(id, Float.parseFloat(ctx.FLOAT(i).getText()));
				i++;
			}
		}

		List<BcParser.Adv_exprContext> exprList = func_map.get(ctx.id.getText());
		BcParser.Adv_exprContext ret = null;
		for(BcParser.Adv_exprContext el : exprList) {
			this.visit(el);
			//if el is type return break and set ret
			if(ret_hit == true) {
				ret = el;
				ret_hit = false;
				break;
			}
			
		}
		if(ret != null) {
			Float val = this.visit(ret);
			var_map_list.remove(scope);
			return val;
		}
		System.out.println("Problem in visit function");
		return (float) 0;
	}
}