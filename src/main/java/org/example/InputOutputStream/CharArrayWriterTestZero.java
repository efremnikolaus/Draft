package org.example.InputOutputStream;

import java.io.CharArrayWriter;
import java.util.Arrays;

public class CharArrayWriterTestZero {
    public static void main(String[] args) {
        CharArrayWriter charArrayWriter = new CharArrayWriter();

        charArrayWriter.append("Java");

        char[] result = charArrayWriter.toCharArray();

        System.out.println(Arrays.toString(result));
    }
}
