// Generated from VyperEVM.g4 by ANTLR 4.13.1
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VyperEVMParser}.
 */
public interface VyperEVMListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VyperEVMParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(VyperEVMParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperEVMParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(VyperEVMParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperEVMParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(VyperEVMParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperEVMParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(VyperEVMParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperEVMParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(VyperEVMParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperEVMParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(VyperEVMParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperEVMParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(VyperEVMParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperEVMParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(VyperEVMParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperEVMParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(VyperEVMParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperEVMParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(VyperEVMParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperEVMParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(VyperEVMParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperEVMParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(VyperEVMParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperEVMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(VyperEVMParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperEVMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(VyperEVMParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VyperEVMParser#atomicExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtomicExpression(VyperEVMParser.AtomicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VyperEVMParser#atomicExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtomicExpression(VyperEVMParser.AtomicExpressionContext ctx);
}