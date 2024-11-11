package com.vladproduction.c02_pretest.cover_questions.task03;

public class Increment {
    public static void main(String[] args) {
        Integer i = 10;
        Integer j = 11;
        Integer k = ++i; // INCR
        System.out.println("k == j is " + (k == j));
        System.out.println("k.equals(j) is " + k.equals(j));
        //output:
        /*k == j is true
        k.equals(j) is true*/

        System.out.println("k reference: " + System.identityHashCode(k));
        System.out.println("j reference: " + System.identityHashCode(j));
        //output:
        /*k reference: 931919113
        j reference: 931919113*/

        //conclusion:
        /*Java caches Integer objects for values within the range of -128 to 127.
        When you increment i with ++i, it evaluates to 11, which is also within the caching range.
        As a result, both k (after the increment) and j (which was explicitly assigned the value 11)
        refer to the same cached Integer object.*/

    }
}

/*Which one of the following options correctly describes the behavior of this program?
a) When executed, this program prints
k == j is false
        k.equals(j) is false
b) When executed, this program prints
k == j is true
        k.equals(j) is false
c) When executed, this program prints
k == j is false
        k.equals(j) is true
+++d) When executed, this program prints
k == j is true
        k.equals(j) is true
e) When compiled, the program will result in a compiler error in the line marked with the comment INCR.*/
