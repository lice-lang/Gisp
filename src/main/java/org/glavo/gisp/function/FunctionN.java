package org.glavo.gisp.function;

import java.util.List;

/**
 * Created by glavo on 17-4-16.
 *
 * @author Glavo
 * @since 1.0.0
 */
public interface FunctionN<T, R> {
    R invoke(List<? extends T> t);
}
