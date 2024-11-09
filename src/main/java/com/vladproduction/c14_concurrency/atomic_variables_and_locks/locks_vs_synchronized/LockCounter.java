package com.vladproduction.c14_concurrency.atomic_variables_and_locks.locks_vs_synchronized;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockCounter {
    private int count = 0;
    private final Lock lock = new ReentrantLock();

    // Method to increment the count using lock
    public void increment() {
        lock.lock();  // Acquire the lock
        try {
            count++;
        } finally {
            lock.unlock();  // Ensure the lock is always released
        }
    }

    public int getCount() {
        return count;
    }
}
