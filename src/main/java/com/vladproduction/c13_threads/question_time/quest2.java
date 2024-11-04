package com.vladproduction.c13_threads.question_time;

public class quest2 {
    public static void main(String []args) throws InterruptedException {
        Thread t1=new Thread() {
            public void run() { System.out.print("t1 "); }
        };
        Thread t2 =new Thread() {
            public void run() { System.out.print("t2 "); }
        };
        t1.start();
        t1.sleep(5000);
        t2.start();
        t2.sleep(5000);
        System.out.println("main ");

        /*(When a new thread is created, it is in the new state. Then, it moves to the runnable state. Only from the
        runnable state can the thread go to the timed_waiting state after calling sleep(). Hence, before executing
        sleep(), the run() method for that thread is called. So, the program prints “t1 t2 main”.)*/
    }
}
/*
A. t1 t2 main
B. t1 main t2
C. main t2 t1
D. This program results in a compiler error.
E. This program throws a runtime error.
Answer: A. t1 t2 main */

