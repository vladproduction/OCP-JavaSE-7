package com.vladproduction.c02_pretest.cover_questions.task18;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class DequeTest {
    public static void main(String []args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(0);
        deque.add(10);
        deque.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("The removed element is: " + deque.remove()); // ERROR?
        System.out.println(deque);
        /*The removed element is: 0
          [10, 1, 2, 3, 4, 5]*/
    }
}

/*Which one of the following correctly describes the behavior of this program?
a) When executed, this program prints the following: “The removed element is: 5”.
+++b) When executed, this program prints the following: “The removed element is: 0”.
c) When compiled, the program results in a compiler error of “remove() returns void” for the line marked with the comment ERROR.
d) When executed, this program throws InvalidOperationException.*/
