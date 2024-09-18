package com.vladproduction.c04_advanced_class_design.final_and_static;

/**
 * // Counter class should count the number of instances created from that class
 * */
public class Counter {
    private static int count;// variable to store the number of objects created

    static {
        // code in this static block will be executed when JVM loads the class into memory
        count = 1;
    }

    // for every Counter object created, the default constructor will be called;
    // so, update the counter value inside the default constructor
    public Counter() {
        count++;
    }


    public static void main(String []args) {
        Counter instance1 = new Counter();
        // note how we call printCount using the class name instead of instance variable name
        Counter.printCount();
        Counter instance2 = new Counter();
        Counter.printCount();
        Counter instance3 = new Counter();
        Counter.printCount();
        //before added static block:
        /*Number of instances created so far is: 1
        Number of instances created so far is: 2
        Number of instances created so far is: 3*/

        //after  static block has been added:
        /*A constructor will be invoked when an instance of the class is created,
        while the static block will be invoked when the program initializes.*/
        /*Number of instances created so far is: 2   ---> that is why we can see 2 instead 1 (as in previous, without static)
        Number of instances created so far is: 3
        Number of instances created so far is: 4*/
    }



    public static void printCount() { // method to print the counter value so far
        System.out.println("Number of instances created so far is: " + count);
    }



}
