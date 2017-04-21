package org.glavo.gisp.api;

import org.glavo.gisp.internal.JType;

import java.util.HashMap;
import java.util.Map;
import java.util.AbstractMap;

/**
 * Created by glavo on 17-4-21.
 *
 * @author Glavo
 * @since 1.0.0
 */
public abstract class Type {
    public static Map<Class<?>, Type> m = new HashMap<>();


    public static Type of(Class<?> c) {
        if (m.containsKey(c)) {
            return m.get(c);
        } else {
            Type t = new JType(c);
            m.put(c, t);
            return t;
        }
    }

    public abstract Value box(Object o);
}
