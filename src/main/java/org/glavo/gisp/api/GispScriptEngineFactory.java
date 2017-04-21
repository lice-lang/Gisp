package org.glavo.gisp.api;

import org.glavo.gisp.Gisp;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by glavo on 17-4-22.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class GispScriptEngineFactory implements ScriptEngineFactory, Gisp {
    @Override
    public String getEngineName() {
        return EngineName;
    }

    @Override
    public String getEngineVersion() {
        return EngineVersion;
    }

    @Override
    public List<String> getExtensions() {
        return Collections.singletonList(".gisp");
    }

    @Override
    public List<String> getMimeTypes() {
        return null;
    }

    @Override
    public List<String> getNames() {
        return null;
    }

    @Override
    public String getLanguageName() {
        return null;
    }

    @Override
    public String getLanguageVersion() {
        return null;
    }

    @Override
    public Object getParameter(String key) {
        return null;
    }

    @Override
    public String getMethodCallSyntax(String obj, String m, String... args) {
        return null;
    }

    @Override
    public String getOutputStatement(String toDisplay) {
        return null;
    }

    @Override
    public String getProgram(String... statements) {
        return null;
    }

    @Override
    public ScriptEngine getScriptEngine() {
        return null;
    }
}
