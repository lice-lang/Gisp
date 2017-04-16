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
    class JType<T> implements Type {
        private Class<T> type;

        public static <T> JType<T> typeOf(T v) {
            return v == null ? (JType<T>) Null
                    : new JType<>((Class<T>) v.getClass());
        }

        private JType(Class<T> t) {
            this.type = t;
        }

        public static final JType<?> Null = new JType<>(null);



        @Override
        public String toString() {
            return type == null ? "Null" : type.getName();
        }
    }
}
