package org.glavo.gisp.parser.ast;

import org.glavo.gisp.Environment;
import org.glavo.gisp.Value;

import java.util.List;

/**
 * Created by glavo on 17-4-16.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class MacroNode implements Node{
    public String macro;
    public List<? extends Node> nodes;

    public MacroNode(String macro, List<? extends Node> nodes) {
        this.macro = macro;
        this.nodes = nodes;
    }

    @Override
    public Value eval(Environment env) {
        return env.getMacro(macro).invoke(nodes);
    }
}
