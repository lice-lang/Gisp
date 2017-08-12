package org.glavo.gisp.helper

import java.io._

import scala.annotation.switch

/**
  * Created by Glavo on 17-8-12.
  *
  * @author Glavo
  * @since 0.1.0
  */
object StringUtils {
    def escape(input: String): String = {
        val sb = new StringBuilder(input.length)

        val reader = new StringReader(input)
        var c: Int = -1

        while ( {
            c = reader.read()
            c != -1
        }) {
            (c: @switch) match {
                case '\\' =>
                    (reader.read(): @switch) match {
                        case 'n' => sb += '\n'
                        case 't' => sb += '\t'
                        case 'r' => sb += '\r'
                        case 'b' => sb += '\b'
                        case 'u' =>
                            val arr = new Array[Char](4)
                            if (reader.read(arr) != 4) throw new Exception()
                            sb.append(Integer.parseInt(new String(arr), 16).asInstanceOf[Char])
                    }

                case i => sb += i.asInstanceOf[Char]
            }

        }

        sb.toString()
    }
}
