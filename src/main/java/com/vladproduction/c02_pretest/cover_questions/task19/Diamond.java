package com.vladproduction.c02_pretest.cover_questions.task19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Diamond {
    public static void main(String[] args) {
        List list1 = new ArrayList<>(Arrays.asList(1, "two", 3.0)); // ONE
        List list2 = new LinkedList<>(Arrays.asList(1, 2.0F, 3.0)); // TWO
        list1 = list2; // THREE
        for(Object element : list1) {
            System.out.print(element + " ");
        }
    }
}

/*Which one of the following describes the expected behavior of this program?
a) The program results in compiler error in line marked with comment ONE.
b) The program results in compiler error in line marked with comment TWO.
c) The program results in compiler error in line marked with comment THREE.
+++d) When executed, the program prints 1 2.0 3.0.
e) When executed, this program throws a ClassCastException.*/

