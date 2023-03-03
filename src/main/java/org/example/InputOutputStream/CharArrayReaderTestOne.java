package org.example.InputOutputStream;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderTestOne {
    public static void main(String[] args) throws IOException {
        char[] chars = {'J','a','v','a'};

        CharArrayReader reader = new CharArrayReader(chars);

        char[] buffer = new char[1024];

        int charCount = reader.read(buffer, 0, buffer.length);

        for (int i = 0; i < charCount; i++) {
            System.out.print(buffer[i]);
        }

    }
}
