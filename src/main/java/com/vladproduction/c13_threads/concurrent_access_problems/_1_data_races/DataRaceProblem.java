package com.vladproduction.c13_threads.concurrent_access_problems._1_data_races;

/**
 * In this program, there is a Counter class that has a static variable count. In the run() method of the UseCounter
 * class, you increment the count three times by calling the increment() method. You create three threads in the main()
 * function in the DataRace class and start it. You expect the program to print 1 to 9 sequentially as the threads run and
 * increment the counters. However, when you run this program, it does print nine integer values, but the output looks
 * like garbage!
 * How do we get a solution? By acquiring a lock on the object. Only a single thread can acquire a lock on an object at a
 * time, and only that thread can execute the block of code (i.e., the critical section) protected by the lock. Until then,
 * the other threads have to wait. Internally, this is implemented with monitors and the process is called locking and
 * unlocking (i.e., thread synchronization).
 * */
public class DataRaceProblem {
    public static void main(String[] args) {
        //main thread where we create and start others threads
        UserThread user = new UserThread();
        Thread t1 = new Thread(user);
        Thread t2 = new Thread(user);
        Thread t3 = new Thread(user);

        Thread[] threads = {t1, t2, t3};
        for (Thread thread : threads) {
            thread.start();
        }

        //output is extremely unpredictable each time we start program:
        //3 4 5 1 6 7 2 8 9
    }
}

/**
 * This class implements Runnable interface
 * Its run method increments the counter three times
 * */
class UserThread implements Runnable{
    @Override
    public void run() {
        increment();
        increment();
        increment();
    }

    public void increment() {
        // increments the counter and prints the value
        // of the counter shared between threads
        Counter.count++;
        System.out.print(Counter.count + " ");
    }

}

class Counter{
    public static long count = 0;
}
