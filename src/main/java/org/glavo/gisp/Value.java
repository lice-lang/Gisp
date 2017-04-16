package org.glavo.gisp;

import java.util.List;

/**
 * Created by glavo on 17-4-14.
 *
 * @author Glavo
 * @version 1.0.0
 */
public interface Value {


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
