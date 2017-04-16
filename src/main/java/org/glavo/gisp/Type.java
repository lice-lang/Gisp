package org.glavo.gisp;

import java.util.Objects;

/**
 * Created by glavo on 17-4-14.
 *
 * @author Glavo
 * @version 1.0.0
 */
public interface Type {
    /**
     * Created by glavo on 17-4-14.
     *
     * @author Glavo
     * @version 1.0.0
     */
    class JValue<T> implements Value {
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
        public String toString() {
            return Objects.toString(value);
        }
    }
}
