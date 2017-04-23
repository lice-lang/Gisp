package org.glavo.gisp.api;

import javax.script.Bindings;
import javax.script.ScriptContext;
import java.io.Reader;
import java.io.Writer;
import java.util.List;

/**
 * Created by glavo on 17-4-22.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class GispContxt implements ScriptContext {
    private SymbolList sl;

    public GispContxt(SymbolList sl) {
        this.sl = sl;
    }


    @Override
    public void setBindings(Bindings bindings, int ignore) {
        this.sl = (SymbolList) bindings;
    }

    @Override
    public Bindings getBindings(int ignore) {
        return sl;
    }

    @Override
    public void setAttribute(String name, Object value, int ignore) {
        sl.put(name, value);
    }

    @Override
    public Object getAttribute(String name, int scope) {
        return null;
    }

    @Override
    public Object removeAttribute(String name, int scope) {
        return null;
    }

    @Override
    public Object getAttribute(String name) {
        return null;
    }

    @Override
    public int getAttributesScope(String name) {
        return 0;
    }

    @Override
    public Writer getWriter() {
        return null;
    }

    @Override
    public Writer getErrorWriter() {
        return null;
    }

    @Override
    public void setWriter(Writer writer) {

    }

    @Override
    public void setErrorWriter(Writer writer) {

    }

    @Override
    public Reader getReader() {
        return null;
    }

    @Override
    public void setReader(Reader reader) {

    }

    @Override
    public List<Integer> getScopes() {
        return null;
    }
}
