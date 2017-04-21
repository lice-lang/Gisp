package org.glavo.gisp.api;

import java.util.List;

/**
 * Created by glavo on 17-4-21.
 *
 * @author Glavo
 * @since 1.0.0
 */
public interface Value {
    Object asJava();

    Type getType();

    Value invoke(List<Value> l);
}
