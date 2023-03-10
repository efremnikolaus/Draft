package org.example.InputOutputStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamTestOne {
    public static void main(String[] args) throws IOException {
        byte[] bytes = {1, 3, 5, 7, 9};
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);

        byte[] buffer = new byte[1024];
        int readByteCount = bais.read(buffer, 0, buffer.length);

        for (int i = 0; i < readByteCount; i++) {
            System.out.println(buffer[i]);
        }

        while(bais.available() > 0) {
            byte currentByte = (byte) bais.read();
            System.out.println(currentByte);
        }
        bais.close();
    }
}
