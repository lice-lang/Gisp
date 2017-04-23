package org.glavo.gisp.api;


import javax.script.Bindings;
import java.util.*;
import java.util.Map;

/**
 * Created by glavo on 17-4-22.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class SymbolList implements org.glavo.gisp.internal.Map, Bindings {
    private Map<String, Value> values;
    private SymbolList p;

    public Map<String, Value> getValues() {
        return values;
    }


    private Value getValue(String name) {
        if (values.containsKey(name)) {
            return values.get(name);
        } else if (p != null) {
            return p.getValue(name);
        } else throw new NoSuchElementException(name);
    }

    public Value putValue(String name, Value val) {
        values.put(name, val);
        return val;
    }

    @Override
    public boolean equals(Object o) {
        return o != null
                && o.getClass() == getClass()
                && ((SymbolList)o).values.equals(values);
    }

    @Override
    public int hashCode() {
        return values.hashCode() + 365;
    }
}
