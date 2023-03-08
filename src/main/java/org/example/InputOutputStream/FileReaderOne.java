package org.example.InputOutputStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderOne {
    public static void writeFile(){
        File file = new File("test.txt");
        try(FileWriter writer = new FileWriter(file)) {
            String text = "Hello world, it is me:) !!!";
            writer.write(text);
            writer.flush();
        } catch (IOException e) {
            System.out.printf(e.getMessage());
        }
    }
}
