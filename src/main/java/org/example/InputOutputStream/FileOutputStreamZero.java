package org.example.InputOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamZero {
    public static void writeFileWithOutputStream(){
        String greeting = "Hello from Output Stream:)";
        try(FileOutputStream fileOutputStream = new FileOutputStream("test.txt")){
            byte[] buffer = test.getBytes();
            fileOutputStream.write(buffer, 0, buffer.length);
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
