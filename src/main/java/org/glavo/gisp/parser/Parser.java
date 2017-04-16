package org.glavo.gisp.parser;

import javax.script.*;
import java.io.Reader;

/**
 * Created by glavo on 17-4-15.
 */
public class Parser implements ScriptEngine {
    @Override
    public Object eval(String s, ScriptContext scriptContext) throws ScriptException {
        return null;
    }

    @Override
    public Object eval(Reader reader, ScriptContext scriptContext) throws ScriptException {
        return null;
    }

    @Override
    public Object eval(String s) throws ScriptException {
        return null;
    }

    @Override
    public Object eval(Reader reader) throws ScriptException {
        return null;
    }

    @Override
    public Object eval(String s, Bindings bindings) throws ScriptException {
        return null;
    }

    @Override
    public Object eval(Reader reader, Bindings bindings) throws ScriptException {
        return null;
    }

    @Override
    public void put(String s, Object o) {

    }

    @Override
    public Object get(String s) {
        return null;
    }

    @Override
    public Bindings getBindings(int i) {
        return null;
    }

    @Override
    public void setBindings(Bindings bindings, int i) {

    }

    @Override
    public Bindings createBindings() {
        return null;
    }

    @Override
    public ScriptContext getContext() {
        return null;
    }

    @Override
    public void setContext(ScriptContext scriptContext) {

    }

    @Override
    public ScriptEngineFactory getFactory() {
        return null;
    }
}
