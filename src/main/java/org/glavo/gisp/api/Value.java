package org.glavo.gisp.api;

import org.glavo.gisp.internal.JValue;

import java.util.List;

/**
 * Created by glavo on 17-4-21.
 *
 * @author Glavo
 * @since 1.0.0
 */
public interface Value {
    static Value box(Object o) {
        if (o == null) return JValue.Null;

        return Type.of(o.getClass()).box(o);
    }

    Object asJava();

    Type getType();

    Value invoke(List<Value> l);
}
