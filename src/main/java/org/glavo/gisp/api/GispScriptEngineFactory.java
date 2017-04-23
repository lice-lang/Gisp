package org.glavo.gisp.api;

import jdk.nashorn.internal.runtime.Version;
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
        return Collections.unmodifiableList(Collections.singletonList(".gisp"));
    }

    @Override
    public List<String> getMimeTypes() {
        return Collections
                .unmodifiableList(Arrays.asList("application/gisp", "text/gisp"));
    }

    @Override
    public List<String> getNames() {
        return Collections.unmodifiableList(Collections.singletonList("Gisp"));
    }

    @Override
    public String getLanguageName() {
        return LanguageName;
    }

    @Override
    public String getLanguageVersion() {
        return LanguageVersion;
    }

    @Override
    public Object getParameter(String key) {
        byte var3 = -1;
        switch (key.hashCode()) {
            case -1073020410:
                if (key.equals("javax.script.engine_version")) {
                    var3 = 2;
                }
                break;
            case -1047659667:
                if (key.equals("javax.script.engine")) {
                    var3 = 1;
                }
                break;
            case -917703229:
                if (key.equals("javax.script.language")) {
                    var3 = 3;
                }
                break;
            case -852670884:
                if (key.equals("javax.script.language_version")) {
                    var3 = 4;
                }
                break;
            case -125973898:
                if (key.equals("javax.script.name")) {
                    var3 = 0;
                }
                break;
            case 1224369528:
                if (key.equals("THREADING")) {
                    var3 = 5;
                }
        }

        switch (var3) {
            case 0:
                return "Gisp";
            case 1:
                return "Glavo Gisp";
            case 2:
                return "release";
            case 3:
                return "Gisp";
            case 4:
                return LanguageVersion;
            case 5:
                return null;
            default:
                return null;
        }
    }

    @Override
    public String getMethodCallSyntax(String obj, String m, String... args) {
        return "( ." + m + " " + obj + String.join(" ", args) + " )";
    }

    @Override
    public String getOutputStatement(String toDisplay) {
        return "(print " + toDisplay + ")";
    }

    @Override
    public String getProgram(String... statements) {
        return null;
    }

    @Override
    public ScriptEngine getScriptEngine() {
        return new GispScriptEngine(); //TODO
    }
}
