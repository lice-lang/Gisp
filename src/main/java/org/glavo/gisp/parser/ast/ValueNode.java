package org.glavo.gisp.parser.ast;

import org.glavo.gisp.Environment;
import org.glavo.gisp.Value;

/**
 * Created by glavo on 17-4-16.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class ValueNode implements Node {
    public Value value;

    public ValueNode(Value v) {
        value = v;
    }

    @Override
    public Value eval(Environment env) {
        return value;
    }
}