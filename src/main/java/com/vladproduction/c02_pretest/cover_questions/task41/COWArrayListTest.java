package com.vladproduction.c02_pretest.cover_questions.task41;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWArrayListTest {
    public static void main(String []args) {
        /*ArrayList<Integer> aList = new CopyOnWriteArrayList<Integer>(); // LINE A
        aList.addAll(Arrays.asList(10, 20, 30, 40));
        System.out.println(aList);*/
    }
    //While the specific line itself won't throw an error, the overall lack of imports will lead to a compilation issue
    // when trying to initialize CopyOnWriteArrayList.
}

/*Which one of the following options correctly describes the behavior of this program?
a) When executed the program prints the following: [10, 20, 30, 40].
b) When executed the program prints the following: CopyOnWriteArrayList.class.
+++c) The program does not compile and results in a compiler error in line marked with comment LINE A.
d) When executed the program throws a runtime exception ConcurrentModificationException.
e) When executed the program throws a runtime exception InvalidOperationException.*/
