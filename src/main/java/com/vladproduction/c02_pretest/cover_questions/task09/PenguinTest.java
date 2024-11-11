package com.vladproduction.c02_pretest.cover_questions.task09;

public class PenguinTest {
    public static void main(String []args) {
        Penguin penguin = new Penguin();
        penguin.walk();
        penguin.fly();
        //output:
        //walk cannot fly

    }
}

/*Which one of the following options correctly describes the behavior of this program?
a) Compiler error in line with comment LINE A because fly() does not declare to throw CannotFlyException.
b) Compiler error in line with comment LINE B because fly() is not defined and hence need to declare it abstract.
c) It crashes after throwing the exception CannotFlyException.
+++d) When executed, the program prints “walk cannot fly”.*/
