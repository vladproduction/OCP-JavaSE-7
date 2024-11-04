package com.vladproduction.c13_threads.intro;

/**
 * improved code of the program provided by UsingSleep;
 * The Thread class has the instance method join() for waiting for a thread to “die.” In the TimeBomb program, you want
 * the main() thread to wait for the timer thread to complete its execution. You can use the instance method join()
 * in the Thread class to achieve that
 * */
public class UsingJoin {
    public static void main(String[] args) {
        UsingSleep timer = new UsingSleep();
        System.out.println("Starting 10 second count down... ");
        timer.start();
        try {
            timer.join();
        }
        catch(InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("Bo-o-o-o-o-om!!!!!!!");
    }
}
/*
The Thread class has three overloaded versions of the join() method:
void join();
void join(long);
void join(long, int);
*/

