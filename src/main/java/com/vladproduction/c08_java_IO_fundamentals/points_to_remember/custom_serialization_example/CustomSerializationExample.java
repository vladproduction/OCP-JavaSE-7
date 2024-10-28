package com.vladproduction.c08_java_IO_fundamentals.points_to_remember.custom_serialization_example;

import java.io.*;
/**
 * is an example illustrating how to customize the serialization process in Java by implementing the writeObject() and readObject() methods.
 * These methods allow you to control the serialization and deserialization of an object's state
 *
 * running the program, you'll see the output,
 * confirming the object is serialized and deserialized with the age modified during this process
 * */
public class CustomSerializationExample {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("Alice", 30);

        // Serialize the object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            oos.writeObject(person);
            System.out.println("Person object serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Person object deserialized.");
            System.out.println("Name: " + deserializedPerson.getName());
            System.out.println("Age: " + deserializedPerson.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
