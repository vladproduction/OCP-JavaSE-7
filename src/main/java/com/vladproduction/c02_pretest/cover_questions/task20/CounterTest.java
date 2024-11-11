package com.vladproduction.c02_pretest.cover_questions.task20;

/**
 * Thus, all three output lines reflect the shared static count variable across different instances and types of SimpleCounter.
 * Using static fields in a generic class means that all instances of the class, regardless of their type parameters,
 * will share the same count. This can lead to unexpected behavior in a multithreading environment or if used carelessly,
 * as all instances increment the same counter.
 * */
public class CounterTest {
    public static void main(String []args) {

        SimpleCounter<Double> doubleCounter = new SimpleCounter<Double>();
        //calls the constructor of SimpleCounter, which increments the static count by 1.

        SimpleCounter<Integer> intCounter = null;
        //intCounter is declared but set to null. No instance is created, hence it does not modify the count.

        SimpleCounter rawCounter = new SimpleCounter(); // RAW
        //rawCounter is instantiated, it again calls the SimpleCounter constructor, incrementing count by 1, making the total count now 2.


        System.out.println("SimpleCounter<Double> counter is " + doubleCounter.getCount()); //2
        // returns 2 because:
        //After creating a SimpleCounter<Double>, the count was incremented to 1.
        //When the rawCounter was created, the count became 2

        System.out.println("SimpleCounter<Integer> counter is " + intCounter.getCount());   //2
        //Although no instance of SimpleCounter<Integer> was created (because intCounter is null),
        //the getCount() method is static and references the same shared count, which is 2.

        System.out.println("SimpleCounter counter is " + rawCounter.getCount());            //2
        //rawCounter.getCount() also returns 2 for the same reason.

        //output:
        /*SimpleCounter<Double> counter is 2
        SimpleCounter<Integer> counter is 2
        SimpleCounter counter is 2*/
    }
}
/*Which one of the following describes the expected behavior of this program?

a) This program will result in a compiler error in the line marked with comment RAW.

b) When executed, this program will print
SimpleCounter<Double> counter is 1
SimpleCounter<Integer> counter is 0
SimpleCounter counter is 1

c) When executed, this program will print
SimpleCounter<Double> counter is 1
SimpleCounter<Integer> counter is 1
SimpleCounter counter is 1

d) When executed, this program will print
SimpleCounter<Double> counter is 2
SimpleCounter<Integer> counter is 0
SimpleCounter counter is 2

+++e) When executed, this program will print
SimpleCounter<Double> counter is 2
SimpleCounter<Integer> counter is 2
SimpleCounter counter is 2*/
