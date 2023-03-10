package org.example.InputOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamZero {
    public static void readFileWithInputStream(){
        File file = new File("test.txt");
        try(FileInputStream fileInputStream = new FileInputStream(file)){
            System.out.println("File size in bytes: " + fileInputStream.available());
            byte[] buffer = new byte[fileInputStream.available()];
            for (int i = 0; i < buffer.length; i++) {
                System.out.println((char)buffer[i]);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
