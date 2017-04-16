package org.glavo.gisp;

import org.glavo.gisp.function.FunctionN;

import java.util.List;
import java.util.Objects;

/**
 * Created by glavo on 17-4-14.
 *
 * @author Glavo
 * @version 1.0.0
 */
public class JValue<T> implements Value {
    public static org.glavo.gisp.JValue<?> Null = new org.glavo.gisp.JValue<>(null);
    private Value proxy;


    private T value;
    private Type type;

    public JValue(Function proxy, T v) {
        this.proxy = proxy;
        this.value = v;
        if (value == null) type = JType.Null;
    }

    public JValue(T v) {
        this(new Function(t -> null), v);

        this.proxy = new Function(t -> JValue.this);
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
