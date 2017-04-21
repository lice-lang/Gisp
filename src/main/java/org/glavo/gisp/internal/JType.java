package org.glavo.gisp.internal;

import org.glavo.gisp.api.Type;
import org.glavo.gisp.api.Value;

/**
 * Created by glavo on 17-4-21.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class JType extends Type {
    private Class<?> c;

    public static final JType NullType = new JType(null) {
        @Override
        public Value box(Object o) {
            return JValue.Null;
        }

        @Override
        public String toString() {
            return "Null";
        }
    };

    public static JType of(Class<?> c) {
        return c == null ? NullType : new JType(c);
    }

    public JType(Class<?> c) {
        this.c = c;
    }

    @Override
    public Value box(Object o) {
        return new JValue(o, this);
    }

    @Override
    public String toString() {
        return c.getName();
    }
}
