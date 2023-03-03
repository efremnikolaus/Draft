package org.example.InputOutputStream;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderTestZero {
    public static void main(String[] args) throws IOException {
        char[] chars = {'J','a','v','a'};

        CharArrayReader reader = new CharArrayReader(chars);

        int nextChar = -1;
        while((nextChar = reader.read()) != -1) {
            char c = (char) nextChar;
            System.out.print(c);
        }
    }
}
