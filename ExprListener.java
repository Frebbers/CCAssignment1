// Generated from Expr.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ExprParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ExprParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#updates}.
	 * @param ctx the parse tree
	 */
	void enterUpdates(ExprParser.UpdatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#updates}.
	 * @param ctx the parse tree
	 */
	void exitUpdates(ExprParser.UpdatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#siminputs}.
	 * @param ctx the parse tree
	 */
	void enterSiminputs(ExprParser.SiminputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#siminputs}.
	 * @param ctx the parse tree
	 */
	void exitSiminputs(ExprParser.SiminputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ExprParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ExprParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#siminputExp}.
	 * @param ctx the parse tree
	 */
	void enterSiminputExp(ExprParser.SiminputExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#siminputExp}.
	 * @param ctx the parse tree
	 */
	void exitSiminputExp(ExprParser.SiminputExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#updatesExp}.
	 * @param ctx the parse tree
	 */
	void enterUpdatesExp(ExprParser.UpdatesExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#updatesExp}.
	 * @param ctx the parse tree
	 */
	void exitUpdatesExp(ExprParser.UpdatesExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#logicalOrExp}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExp(ExprParser.LogicalOrExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#logicalOrExp}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExp(ExprParser.LogicalOrExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#logicalAndExp}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExp(ExprParser.LogicalAndExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#logicalAndExp}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExp(ExprParser.LogicalAndExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExp(ExprParser.UnaryExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExp(ExprParser.UnaryExpContext ctx);
}