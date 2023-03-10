package org.example.InputOutputStream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderZero {
    public static void readFile(){
        try(FileReader reader = new FileReader("test.txt")){
            int c;
            while ((c == reader.read() != -1)){
                System.out.println((char) c);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
