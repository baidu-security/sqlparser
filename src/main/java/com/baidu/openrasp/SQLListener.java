// Generated from SQL.g4 by ANTLR 4.5
package com.baidu.openrasp;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLParser}.
 */
public interface SQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(SQLParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(SQLParser.InitContext ctx);
}