package org.glavo.gisp.internal;

import org.glavo.gisp.api.Type;
import org.glavo.gisp.api.Value;

import java.util.List;

/**
 * Created by glavo on 17-4-21.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class JValue implements Value {
    private Type type;

    private Object obj;

    public static final JValue Null = new JValue(null, JType.NullType);

    public static JValue of(Object o) {
        return o == null ? Null : new JValue(o, Type.of(o.getClass()));
    }

    public JValue(Object obj, Type type) {
        this.type = type;
        this.obj = obj;
    }


    @Override
    public Object asJava() {
        return obj;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public Value invoke(List<Value> l) {
        return null;
    }
}
