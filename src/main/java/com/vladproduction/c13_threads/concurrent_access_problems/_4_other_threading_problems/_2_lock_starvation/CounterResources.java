package com.vladproduction.c13_threads.concurrent_access_problems._4_other_threading_problems._2_lock_starvation;

/**
 * This class contains a synchronized method increment() which simulates a long operation by sleeping for 100 milliseconds.
 * This simulates a scenario where high-priority threads use the lock for an extended duration.
 * */
public class CounterResources {

    private int counter = 0;

    public synchronized void increment(){
        // Simulate long processing time for high-priority threads
        try{
            Thread.sleep(100); //hold lock for a while
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        counter++;
        System.out.println(Thread.currentThread().getName() + " increment counter: " + counter);
    }

}
