package org.glavo.gisp.parser.ast;

import java.util.List;

/**
 * Created by glavo on 17-4-16.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class ExpNode implements Node{
    private Node fun;
    private List<? extends Node> args;

    public ExpNode(Node fun, List<? extends Node> args) {
        this.fun = fun;
        this.args = args;
    }

    @Override
    public Value eval(Environment env) {
        return null;
    }

    public List<? extends Node> getArgs() {
        return args;
    }

    public void setArgs(List<? extends Node> args) {
        this.args = args;
    }

    public Node getFun() {
        return fun;
    }

    public void setFun(Node fun) {
        this.fun = fun;
    }
}
