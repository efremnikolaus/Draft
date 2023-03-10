package org.example.InputOutputStream;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class FileReaderZero {
    public static void readFileWithBuffer(){
        try(FileReader reader = new FileReader("test.txt")){
            char[] buff = new char[256];
            int c;
            while((c == reader.read(buff) > 0)){
                if (c < 256){
                    System.out.println(Arrays.copyOf(buff, c));
                }
                System.out.println(Arrays.toString(buff));
            }
        }
    }

    public static void main(String[] args) {
        readFileWithBuffer();
    }
}
