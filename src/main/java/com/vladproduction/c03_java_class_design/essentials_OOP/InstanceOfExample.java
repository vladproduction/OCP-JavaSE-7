package com.vladproduction.c03_java_class_design.essentials_OOP;

public class InstanceOfExample {
    public static void main(String[] args) {

        Animal myAnimal = new Dog(); // Upcasting

        // Use instanceof to check the type before downcasting
        if (myAnimal instanceof Dog) {
            Dog myDog = (Dog) myAnimal; // Downcasting
            myDog.makeSound(); // Calls Dog's makeSound
            myDog.fetch();     // Calls Dog's fetch
        } else {
            System.out.println("myAnimal is not an instance of Dog");
        }

    }
}

class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }

    void fetch() {
        System.out.println("Fetching the ball!");
    }
}
