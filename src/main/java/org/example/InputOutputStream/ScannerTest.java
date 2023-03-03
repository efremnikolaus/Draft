package org.example.InputOutputStream;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        String numbers = "5 10 15";
        Scanner scanner = new Scanner(numbers);
        while(scanner.hasNext()){
            System.out.println(scanner.nextInt() + " ");
        }
    }
}
