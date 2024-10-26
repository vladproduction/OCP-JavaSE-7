package com.vladproduction.c06_generics_and_collections.collections_framework.iterator_interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorPerson {
    public static void main(String[] args) {
        //iterator example
        // Create a list of Person objects
        List<Person> people = new ArrayList<>();
        people.add(new Person(25, "Alice"));
        people.add(new Person(30, "Bob"));
        people.add(new Person(22, "Charlie"));
        people.add(new Person(27, "David"));

        // Use an iterator to go through the list
        Iterator<Person> iterator = people.iterator();

        System.out.println("People older than 25:");
        while (iterator.hasNext()) {
            Person person = iterator.next();
            // Logic to filter persons by age
            if (person.age() > 25) {
                System.out.println(person.name() + " is " + person.age() + " years old.");
            }
        }

    }

}

