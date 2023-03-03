package org.example;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayOutputStreamZero {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream(1024);

        for (int i = 0; i < 10; i++) {
            baos.write(i);
        }

        baos.flush();
        System.out.println(Arrays.toString(baos.toByteArray()));
        baos.close();
    }
}
