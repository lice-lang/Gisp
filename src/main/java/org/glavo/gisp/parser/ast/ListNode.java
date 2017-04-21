package org.glavo.gisp.parser.ast;

import java.util.List;

/**
 * Created by glavo on 17-4-16.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class ListNode implements Node{
    private List<? extends Node> ln;

    public ListNode(List<? extends Node> ln) {
        this.ln = ln;
    }

    public List<? extends Node> getLn() {
        return ln;
    }

    public void setLn(List<? extends Node> ln) {
        this.ln = ln;
    }

    @Override
    public Value eval(Environment env) {
        return Value.of(ln.stream().map(n -> n.eval(env)));
    }
}
