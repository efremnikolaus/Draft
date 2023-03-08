package org.example.InputOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterZero {
    public static void writeFileWithOutputStream() {
        String text = "Hello from Output Stream";
        try(FileOutputStream fileOutputStream = new FileOutputStream("test.txt")){
            byte[] buffer = text.getBytes();
            fileOutputStream.write(buffer, 0, buffer.length);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
