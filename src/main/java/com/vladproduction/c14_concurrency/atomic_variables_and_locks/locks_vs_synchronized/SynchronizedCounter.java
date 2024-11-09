package com.vladproduction.c14_concurrency.atomic_variables_and_locks.locks_vs_synchronized;

public class SynchronizedCounter {
    private int count = 0;

    // Synchronized method to increment the count
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
