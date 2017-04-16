package org.glavo.gisp;

/**
 * Created by glavo on 17-4-17.
 *
 * @author Glavo
 * @since 1.0.0
 */
public interface Scoped extends AutoCloseable {
    void close();
}
