package org.example.InputOutputStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterZero {
    public static void writeFile(){
        File file = new File("test.txt");
        try(FileWriter fileWriter = new FileWriter(file)){
            String text = "Hello, World!";
            fileWriter.write(text);
            fileWriter.flush();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
