package org.glavo.gisp;

/**
 * Created by glavo on 17-4-14.
 *
 * @author Glavo
 * @version 1.0.0
 */
public class JType<T> implements Type {
    private Class<T> type;


    JType(Class<T> t) {
        this.type = t;
    }

    public static final org.glavo.gisp.JType<?> Null = new org.glavo.gisp.JType<>(null);


    @Override
    public String toString() {
        return type == null ? "Null" : type.getName();
    }
}
