package org.glavo.gisp.parser.ast;

import org.glavo.gisp.Environment;
import org.glavo.gisp.Value;

/**
 * Created by glavo on 17-4-15.
 */
public interface Node {
    Value eval(Environment env);
}
