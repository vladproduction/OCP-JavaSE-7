package com.vladproduction.c13_threads.concurrent_access_problems._4_other_threading_problems._2_lock_starvation;

/**
 * This class represents a thread that has been given a high priority. When it runs, it tries to increment the shared counter.
 * */
public class HighPriorityThread extends Thread{

    private CounterResources resources;

    public HighPriorityThread(CounterResources resources) {
        this.resources = resources;
        this.setPriority(Thread.MAX_PRIORITY); // Set high priority
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
             resources.increment();
        }
    }
}
