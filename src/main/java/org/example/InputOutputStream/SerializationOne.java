package org.example.InputOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializationOne {
    public static void main(String[] args) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat"))) {
            Person p = (Person) ois.readObject();
            System.out.printf("Name: %s \t Age: %d \n", p.getName(), p.getAge());
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
