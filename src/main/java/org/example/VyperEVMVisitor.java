// Generated from VyperEVM.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VyperEVMParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VyperEVMVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VyperEVMParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(VyperEVMParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperEVMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(VyperEVMParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperEVMParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(VyperEVMParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperEVMParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(VyperEVMParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperEVMParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(VyperEVMParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperEVMParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(VyperEVMParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperEVMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(VyperEVMParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperEVMParser#atomicExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicExpression(VyperEVMParser.AtomicExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperEVMParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(VyperEVMParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperEVMParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(VyperEVMParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link VyperEVMParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(VyperEVMParser.ParameterContext ctx);
}