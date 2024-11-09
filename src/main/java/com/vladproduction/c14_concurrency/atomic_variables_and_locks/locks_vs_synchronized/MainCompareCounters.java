package com.vladproduction.c14_concurrency.atomic_variables_and_locks.locks_vs_synchronized;

public class MainCompareCounters {
    public static void main(String[] args) throws InterruptedException {
        final int NUM_THREADS = 1000;
        final int INCREMENTS_PER_THREAD = 1000;

        ////////////////////// Test with synchronized block ///////////////////////////////
        SynchronizedCounter synchronizedCounter = new SynchronizedCounter();
        Thread[] syncThreads = new Thread[NUM_THREADS];

        for (int i = 0; i < NUM_THREADS; i++) {
            syncThreads[i] = new Thread(() -> {
                for (int j = 0; j < INCREMENTS_PER_THREAD; j++) {
                    synchronizedCounter.increment();
                }
            });
        }

        for (Thread thread : syncThreads) {
            thread.start();
        }

        for (Thread thread : syncThreads) {
            thread.join();
        }

        System.out.println("Final count using synchronized block: " + synchronizedCounter.getCount());

        //////////////// Test with ReentrantLock //////////////////////
        LockCounter lockCounter = new LockCounter();
        Thread[] lockThreads = new Thread[NUM_THREADS];

        for (int i = 0; i < NUM_THREADS; i++) {
            lockThreads[i] = new Thread(() -> {
                for (int j = 0; j < INCREMENTS_PER_THREAD; j++) {
                    lockCounter.increment();
                }
            });
        }

        for (Thread thread : lockThreads) {
            thread.start();
        }

        for (Thread thread : lockThreads) {
            thread.join();
        }

        System.out.println("Final count using ReentrantLock: " + lockCounter.getCount());

    }
}
