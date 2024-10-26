package com.vladproduction.c06_generics_and_collections.collections_framework.iterator_interface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorPersonRemove {
    public static void main(String[] args) {
        // Create a list of Person objects
        List<Person> people = new ArrayList<>();
        people.add(new Person(25, "Alice"));
        people.add(new Person(30, "Bob"));
        people.add(new Person(22, "Charlie"));
        people.add(new Person(27, "David"));
        people.add(new Person(18, "Eve"));

        System.out.println("Original list:");
        printPeople(people);

        // Use an iterator to go through the list and remove persons under 21
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next(); // Get the next person
            if (person.age() < 21) {
                iterator.remove(); // Remove person if age is less than 21
                System.out.println(person.name() + " has been removed (age: " + person.age() + ").");
            }
        }

        System.out.println("\nList after removal:");
        printPeople(people);
    }

    // Method to print people's names and ages
    private static void printPeople(List<Person> people) {
        for (Person person : people) {
            System.out.println(person.name() + " is " + person.age() + " years old.");
        }
    }
}


