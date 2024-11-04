package com.vladproduction.c13_threads.concurrent_access_problems._4_other_threading_problems._2_lock_starvation;

/**
 * Creates instances of high-priority and low-priority threads and starts them.
 * Due to the higher priority of the high-priority threads, they will acquire the lock more frequently.
 * As a result, the low-priority threads may starve and may not get a chance to execute.
 * */
public class LockStarvationExample {
    public static void main(String[] args) {

        //create resource to be used by threads for share incrementing by priority
        CounterResources resources = new CounterResources();

        //create high-priority threads and also set names
        HighPriorityThread highPriorityThread1 = new HighPriorityThread( resources);
        highPriorityThread1.setName("HPT#1");
        HighPriorityThread highPriorityThread2 = new HighPriorityThread(resources);
        highPriorityThread2.setName("HPT#2");

        //create low-priority threads
        LowPriorityThread lowPriorityThread1 = new LowPriorityThread(resources);
        lowPriorityThread1.setName("LPT#1");
        LowPriorityThread lowPriorityThread2 = new LowPriorityThread(resources);
        lowPriorityThread2.setName("LPT#2");

        //start threads:
        highPriorityThread1.start();
        highPriorityThread2.start();

        lowPriorityThread1.start();
        lowPriorityThread2.start();

    }
}
