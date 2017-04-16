package org.glavo.gisp;

/**
 * Created by glavo on 17-4-14.
 *
 * @author Glavo
 * @version 1.0.0
 */
public interface Type {

    static <T> JType<T> typeOf(T v) {
        return v == null ? (JType<T>) JType.Null
                : new JType<>((Class<T>) v.getClass());
    }
}
