package com.vladproduction.c08_java_IO_fundamentals.points_to_remember.over_socket_connection;

import java.io.Serializable;


public class Player implements Serializable {
    private String name;
    private int age;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    // Example method to demonstrate full object functionality
    public String introduce() {
        return "Hello, my name is " + name + " and I am " + age + " years old.";
    }
}
