package com.vladproduction.c02_pretest.cover_questions.task15;

public class Book extends AbstractBook implements Sleepy {

    public Book(String name) {
//        this.name = name; // LINE A
    }
    public static void main(String []args) {
        AbstractBook philosophyBook = new Book("Principal Mathematica");
        System.out.println("The name of the book is " + philosophyBook.name); // LINE B

        //reference to name is ambiguous
    }
}
/*Which one of the following options correctly describes the behavior of this program?
a) The program will print the output “The name of the book is Principia Mathematica”.
b) The program will print the output “The name of the book is undefined”.
+++c) The program will not compile and result in a compiler error “ambiguous reference to name” in line marked with comment LINE A.
d) The program will not compile and result in a compiler error “ambiguous reference to name” in line marked with comment LINE B.*/
