package org.glavo.gisp;


import javax.script.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by glavo on 17-4-15.
 */
public class SymbolList implements Bindings {
    public Map<String, Value> map = new HashMap<>();

    @Override
    public Object put(String name, Object value) {
        map.put(name, new Type.JValue<>(value));
        return value;
    }

    @Override
    public void putAll(Map<? extends String, ?> toMerge) {
        toMerge.forEach(this::put);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Set<String> keySet() {
        return map.keySet();
    }

    @Override
    public Collection<Object> values() {
        return map.values().stream().map(Value::get).collect(Collectors.toList());
    }

    @Override
    public Set<Entry<String, Object>> entrySet() {
        return map.entrySet().stream()
                .map(e -> new AbstractMap.SimpleEntry<>(e.getKey(), e.getValue().get()))
                .collect(Collectors.toSet());
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        Map<String, Object> t = new HashMap<>();
        map.forEach((k, v) -> t.put(k, v.get()));
        return t.containsValue(value);
    }

    @Override
    public Object get(Object key) {
        return map.get(key).get();
    }

    @Override
    public Object remove(Object key) {
        return map.remove(key).get();
    }

    public void init() {

    }
}
