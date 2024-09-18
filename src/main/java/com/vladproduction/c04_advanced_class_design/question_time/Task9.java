package com.vladproduction.c04_advanced_class_design.question_time;

public class Task9 {

    private Numb numb; //can also be defined at the class level (as a member of the class)
    public static void main(String[] args) {
        new Task9().fun();
    }

    public Task9() {
        System.out.println("In Task9 constructor ");
    }

    public void fun() {
        /*Local enum types are allowed in Java and can be used within the scope of the method.
        They will be accessible only within that method.
        Java does not impose a restriction that prevents enums from being declared locally.
        Unlike local classes, which have certain restrictions, enums do not have those same constraints*/
        enum Alphabets {A, B, C} //can declare an enum inside a method

        // Using the local enum
        for (Alphabets letter : Alphabets.values()) {
            System.out.println("Letter: " + letter);
        }
    }
}

enum Numb{
    ONE, TWO, THREE
}



