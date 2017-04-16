package org.glavo.gisp;

import java.util.List;
import java.util.Objects;

/**
 * Created by glavo on 17-4-14.
 *
 * @author Glavo
 * @version 1.0.0
 */
public interface Value {


    /**
     * Created by glavo on 17-4-14.
     *
     * @author Glavo
     * @version 1.0.0
     */
    class JValue<T> implements Value {
        public static JValue<?> Null = new JValue<>(null);


        private T value;
        private Type type;


        public JValue(T v) {
            this.value = v;
            if (value == null) type = JType.Null;
        }


        @Override
        public Object get() {
            return value;
        }

        @Override
        public Type getType() {
            return type;
        }

        @Override
        public Value invoke(List<? extends Value> args) {
            return null;
        }

        @Override
        public String toString() {
            return Objects.toString(value);
        }
    }

    Object get();

    Type getType();

    Value invoke(List<? extends Value> args);

    static <T> JValue<T> of(T t) {
        return t == null ?
                (JValue<T>) JValue.Null : new JValue<>(t);
    }

    static Value check(Value v) {
        return v == null ? JValue.Null : v;
    }
}
