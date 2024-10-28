package com.vladproduction.c08_java_IO_fundamentals.points_to_remember.custom_serialization_example;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //custom serialization:
    private void writeObject(ObjectOutputStream oos)throws IOException {
        // Customize what to write
        oos.defaultWriteObject(); // Write the default serializable fields
        // You can add custom serialization here (for example, additional fields)
        oos.writeInt(age + 10); // Write age with an additional increment
    }

    // Custom deserialization
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        // Customize what to read
        ois.defaultReadObject(); // Read the default serializable fields
        // You can add custom deserialization logic here
        int adjustedAge = ois.readInt(); // Read the adjusted age
        this.age = adjustedAge - 10; // Restore original age
    }
}
