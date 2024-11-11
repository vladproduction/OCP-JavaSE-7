package com.vladproduction.c02_pretest.cover_questions.task05;

public class NullInstanceof {
    public static void main(String []args) {
        String str = null;
        if(str instanceof Object) // NULLCHK
            System.out.println("str is Object");
        else
            System.out.println("str is not Object");
        //This is because null does not refer to any object instance; therefore, it cannot be an instance of any class or interface.

        //output:
        //str is not Object

        //description:
        /*The instanceof operator is used to test whether an object is an instance of a specific class or interface.
        It evaluates to true if the object being tested is an instance of the specified type or any subclass thereof.*/

        //for example Integer:
        Integer x = null;
        System.out.println("Is x as integer refer to Object of Integer class? - " +
                (x instanceof Object));
        /*The instanceof operator in Java checks whether a reference variable is an instance of a specified type or any subtype.
        However, when the variable is null, the instanceof operator does not throw a NullPointerException. Instead, it evaluates to false.*/

        //p.s. In Java, the instanceof operator has a low precedence compared to other operators.
        // By wrapping the expression in parentheses, you ensure that the instanceof operator is evaluated first before
        // it is combined with other operations or concatenated with the string.
    }
}

/*Which one of the following options correctly describes the behavior of this program?
a) This program will result in a compiler error in line marked with comment NULLCHK.
b) This program will result in a NullPointerException in line marked with comment NULLCHK.
c) When executed, this program will print the following: str is Object.
+++d) When executed, this program will print the following: str is not Object.*/
