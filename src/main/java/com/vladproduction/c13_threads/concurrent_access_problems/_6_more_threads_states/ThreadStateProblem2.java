package com.vladproduction.c13_threads.concurrent_access_problems._6_more_threads_states;

public class ThreadStateProblem2 extends Thread{
    public static void main(String[] args) {
        new ThreadStateProblem2().start();
    }

    @Override
    synchronized public void run() { //as synchronized we can fix problem
        try{
            wait(1000); //IllegalMonitorStateException (current thread is not owner)
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

/*The wait(int) method (with or without timeout value) should be called only after acquiring a lock: a wait() call
adds the thread to the waiting queue of the acquired lock. If you don’t do that, there is no proper transition from the
running state to timed_waiting (or waiting state, if a timeout value is not given) to happen. So, the program crashes by
throwing an IllegalMonitorStateException exception.*/
