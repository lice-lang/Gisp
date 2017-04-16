package org.glavo.gisp.function;

/**
 * Created by glavo on 17-4-16.
 *
 * @author Glavo
 * @since 1.0.0
 */
public interface VarArgFunction<T, R> {
    R invoke(T... args);
}
