package com.vladproduction.c02_pretest.cover_questions.task40;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetTest {
    public static void main(String []args) {
        List list = Arrays.asList(10, 5, 10, 20); // LINE A
        System.out.println(list);
        System.out.println(new HashSet(list));
        System.out.println(new TreeSet(list));
        System.out.println(new ConcurrentSkipListSet(list));
        /*  [10, 5, 10, 20]
            [20, 5, 10]
            [5, 10, 20]
            [5, 10, 20]*/
    }
}
/*Which one of the following options correctly describes the behavior of this program?
+++a) The program prints
         [10, 5, 10, 20]
         [20, 5, 10]
         [5, 10, 20]
         [5, 10, 20]
b) The program prints
         [10, 5, 10, 20]
         [5, 10, 20]
         [5, 10, 20]
         [20, 5, 10]
c) The program prints
         [5, 10, 20]
         [5, 10, 20]
         [5, 10, 20]
         [5, 10, 20]
d) The program prints
         [10, 5, 10, 20]
         [20, 5, 10]
         [5, 10, 20]
         [20, 5, 10]
e) The program prints
         [10, 5, 10, 20]
         [5, 10, 10, 20]
         [5, 10, 20]
         [10, 5, 10, 20]
f) Compiler error in line marked by the comment LINE A since List is not parameterized with the type <Integer>.*/
