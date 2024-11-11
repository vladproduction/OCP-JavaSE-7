package com.vladproduction.c02_pretest.cover_questions.task17;

import java.util.Arrays;

public class DefaultSorter {
    public static void main(String[] args) {
        String[] bricks = {"Brazil", "Russia", "India", "China"};
        Arrays.sort(bricks, null);  // LINE A
        for(String country : bricks) {
            System.out.print(country + " ");
        }
    }
    //output:
    //Brazil China India Russia  natural ordering
}

/*Which one of the following options correctly describes the behavior of this program?
a) This program will result in a compiler error in line marked with comment LINE A.
b) When executed, the program prints the following: Brazil Russia India China.
+++c) When executed, the program prints the following: Brazil China India Russia.
d) When executed, the program prints the following: Russia India China Brazil.
e) When executed, the program throws a runtime exception of NullPointerException when executing the line marked with comment LINE A.
f) When executed, the program throws a runtime exception of InvalidComparatorException when executing the line marked with comment LINE A.*/
