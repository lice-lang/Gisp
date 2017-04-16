package org.glavo.gisp;

import javax.script.*;
import java.io.*;
import java.util.List;

/**
 * Created by glavo on 17-4-16.
 */
public class Environment implements ScriptContext{
    SymbolList symbolList;

    private PrintWriter writer;
    private Reader reader;
    private PrintWriter errorWriter;

    public Environment() {
        symbolList = new SymbolList();
        symbolList.init();

        writer = new PrintWriter(System.out);
        reader = new InputStreamReader(System.in);
        errorWriter = new PrintWriter(System.err);
    }


    @Override
    public void setBindings(Bindings bindings, int scope) {
        symbolList = (SymbolList) bindings;
    }

    @Override
    public Bindings getBindings(int scope) {
        return symbolList;
    }

    @Override
    public void setAttribute(String name, Object value, int scope) {
        symbolList.put(name, value);
    }

    @Override
    public Object getAttribute(String name, int scope) {
        return symbolList.get(name);
    }

    @Override
    public Object removeAttribute(String name, int scope) {
        return symbolList.remove(name);
    }

    @Override
    public Object getAttribute(String name) {
        return symbolList.get(name);
    }

    @Override
    public int getAttributesScope(String name) {
        return 0;
    }

    @Override
    public Writer getWriter() {
        return writer;
    }

    @Override
    public Writer getErrorWriter() {
        return errorWriter;
    }

    @Override
    public void setWriter(Writer writer) {
        this.writer = (writer instanceof PrintWriter)
                ? (PrintWriter)writer : new PrintWriter(writer);
    }

    @Override
    public void setErrorWriter(Writer writer) {
        this.errorWriter = (writer instanceof PrintWriter)
                ? (PrintWriter)writer : new PrintWriter(writer);
    }

    @Override
    public Reader getReader() {
        return reader;
    }

    @Override
    public void setReader(Reader reader) {
        this.reader = reader;
    }

    @Override
    public List<Integer> getScopes() {
        return null;
    }
}
