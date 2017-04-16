package org.glavo.gisp;

/**
 * Created by glavo on 17-4-14.
 *
 * @author Glavo
 * @version 1.0.0
 */
public interface Value {
    Object get();
    Type getType();

    /**
     * Created by glavo on 17-4-14.
     *
     * @author Glavo
     * @version 1.0.0
     */
    class JType<T> implements Type {
        private Class<T> type;

        public JType(Class<T> t) {
            this.type = t;
        }

        public static final JType<?> Null = new JType<>(null);



        @Override
        public String toString() {
            return type == null ? "Null" : type.getName();
        }
    }
}
