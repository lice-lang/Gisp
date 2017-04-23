package org.glavo.gisp.internal;

import org.glavo.gisp.api.Value;

import javax.script.Bindings;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by glavo on 17-4-23.
 *
 * @author Glavo
 * @since 1.0.0
 */
public interface Map extends Bindings {

    java.util.Map<String, Value> getValues();

    @Override
    default int size() {
        return getValues().size();
    }

    @Override
    default boolean isEmpty() {
        return getValues().isEmpty();
    }

    @Override
    default boolean containsKey(Object key) {
        return getValues().containsKey(key);
    }

    @Override
    default boolean containsValue(Object value) {
        return getValues().containsValue(Value.box(value));
    }

    @Override
    default Object get(Object key) {
        return getValues().get(key).asJava();
    }

    @Override
    default Object put(String key, Object value) {
        return getValues().put(key, Value.box(value)).asJava();
    }

    @Override
    default Object remove(Object key) {
        return getValues().remove(key).asJava();
    }

    @Override
    default void putAll(java.util.Map<? extends String, ?> m) {
        java.util.Map<String, Value> buffer = new HashMap<>();
        m.forEach((k, v) -> buffer.put(k, Value.box(v)));
        getValues().putAll(buffer);
    }

    @Override
    default void clear() {
        getValues().clear();
    }

    @Override
    default Set<String> keySet() {
        return getValues().keySet();
    }

    @Override
    default Collection<Object> values() {
        return getValues().values().stream()
                .map(Value::asJava)
                .collect(Collectors.toList());
    }

    @Override
    default Set<Entry<String, Object>> entrySet() {
        return getValues().entrySet().stream()
                .map(e -> new AbstractMap.SimpleEntry<>(e.getKey(), e.getValue().asJava()))
                .collect(Collectors.toSet());
    }

}
