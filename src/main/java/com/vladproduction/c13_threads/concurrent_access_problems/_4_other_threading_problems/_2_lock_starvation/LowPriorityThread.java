package com.vladproduction.c13_threads.concurrent_access_problems._4_other_threading_problems._2_lock_starvation;

/**
 * This class represents a thread with a low priority, which also attempts to increment the shared counter.
 * */
public class LowPriorityThread extends Thread{

    private CounterResources resources;

    public LowPriorityThread(CounterResources resources) {
        this.resources = resources;
        this.setPriority(Thread.MIN_PRIORITY); // Set low priority
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
             resources.increment();
        }
    }
}
