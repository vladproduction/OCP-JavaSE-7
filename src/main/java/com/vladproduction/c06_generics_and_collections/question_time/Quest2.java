package com.vladproduction.c06_generics_and_collections.question_time;

import java.util.LinkedList;
import java.util.List;

public class Quest2 {
    public static void main(String[] args) {
        List<Integer> intList = new LinkedList<>();
        List<Double> dblList = new LinkedList<>();
        System.out.println("First type: " + intList.getClass());
        System.out.println("Second type:" + dblList.getClass());
    }
}

/*A. It prints the following:
First type: class java.util.LinkedList
Second type:class java.util.LinkedList
B. It prints the following:
First type: class java.util.LinkedList<Integer>
Second type:class java.util.LinkedList<Double>
C. It results in a compiler error.
D. It results in a runtime exception.
Answer: A
It prints the following:
First type: class java.util.LinkedList
Second type:class java.util.LinkedList
(Due to type erasure, after compilation both types are treated as same LinkedList type).*/
