package org.glavo.gisp.parser;

import org.glavo.gisp.function.FunctionN;
import org.glavo.gisp.Value;
import org.glavo.gisp.parser.ast.Node;

import java.util.List;

/**
 * Created by glavo on 17-4-16.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class Macro {
    private String name;

    private FunctionN<Node,Value> f;

    public Macro(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Value invoke(List<? extends Node> ns) {
        return f.invoke(ns);
    }
}
