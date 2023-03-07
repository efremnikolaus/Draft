package org.example.InputOutputStream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationZero {

        public static void main(String[] args) {

            try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
                Person p = new Person("Sam", 33, 178, true);
                oos.writeObject(p);
            } catch(Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    class Person implements Serializable {
        private String name;
        private int age;
        private transient double height;
        private transient boolean married;

        Person(String name, int age, double height, boolean married){
            this.name = name;
            this.age = age;
            this.height = height;
            this.married = married;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getHeight() {
            return height;
        }

        public boolean isMarried() {
            return married;
        }
}
