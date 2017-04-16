package org.glavo.gisp.parser;

import java.io.IOException;
import java.io.StringReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by glavo on 17-4-16.
 */
public class ParserHelper {
    public static String parseString(String s) throws IOException, StringParseException {
        StringReader sr = new StringReader(s.substring(1, s.length() - 1));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int ci;
            char c;
            if ((ci = sr.read()) == -1) break;

            c = (char) ci;

            switch (c) {
                case '\\':
                    if ((ci = sr.read()) == -1) throw new StringParseException("Failed at " + c);
                    c = (char) ci;
                    switch (c) {
                        case '\\':
                            sb.append('\\');
                            continue;
                        case '\"':
                            sb.append('\"');
                            continue;
                        case '/':
                            sb.append('/');
                            continue;
                        case 'b':
                            sb.append('\b');
                            continue;
                        case 'f':
                            sb.append('\f');
                            continue;
                        case 'n':
                            sb.append('\n');
                            continue;
                        case 'r':
                            sb.append('\r');
                            continue;
                        case 't':
                            sb.append('\t');
                            continue;
                        case 'u':
                            StringBuilder sbb = new StringBuilder();
                            sbb.append((char) sr.read());
                            sbb.append((char) sr.read());
                            sbb.append((char) sr.read());
                            sbb.append((char) sr.read());
                            int ii =
                                    Integer.parseInt(sbb.toString(), 16);

                            sb.append((char) ii);
                            continue;
                    }
                default:
                    sb.append(c);
            }
        }

        return sb.toString();
    }
    public static BigInteger parseInteger(String s) {
        int radix = 10;
        if (s.startsWith("0x") || s.startsWith("0X")) {
            radix = 16;
            s = s.substring(2);
        } else if(s.startsWith("0b") || s.startsWith("0B")) {
            radix = 2;
            s = s.substring(2);
        }

        return new BigInteger(s, radix);
    }

    public static BigDecimal parseDecimal(String s) {
        return new BigDecimal(s);
    }
}
