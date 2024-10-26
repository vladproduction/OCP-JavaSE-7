package com.vladproduction.c06_generics_and_collections.question_time;

import java.util.ArrayList;
import java.util.List;

public class Quest1 {
    public static void main(String[] args) {
//        List<int> intList = new ArrayList<>(); //not correct
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        System.out.println("The list is: " + intList);
    }
}

/*A. It prints the following: The list is: [10, 20].
B. It prints the following: The list is: [20, 10].
C. It results in a compiler error.
D. It results in a runtime exception.
Answer: C
It results in a compiler error.
(You cannot specify primitive types along with generics, so List<int> needs to be changed to List<Integer>).*/
