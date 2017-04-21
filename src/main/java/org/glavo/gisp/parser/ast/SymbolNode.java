package org.glavo.gisp.parser.ast;

/**
 * Created by glavo on 17-4-16.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class SymbolNode implements Node{
    private String symbol;

    public SymbolNode(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public Value eval(Environment env) {
        return env.get(symbol);
    }
}
