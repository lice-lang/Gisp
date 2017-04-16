package org.glavo.gisp;

import org.glavo.gisp.function.*;
import java.util.List;


/**
 * Created by glavo on 17-4-16.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class Function implements Value {

    private FunctionN<Value, Value> f;


    public Function(FunctionN<Value, Value> f) {
        this.f = f;
    }


    public static final Type funtype = new Type() {
        @Override
        public String toString() {
            return "<function:" + hashCode() + ">";
        }
    };

    @Override
    public Object get() {
        return JValue.Null;
    }

    @Override
    public Type getType() {
        return JType.Null;
    }

    @Override
    public Value invoke(List<? extends Value> args) {
        return f.invoke(args);
    }
}
