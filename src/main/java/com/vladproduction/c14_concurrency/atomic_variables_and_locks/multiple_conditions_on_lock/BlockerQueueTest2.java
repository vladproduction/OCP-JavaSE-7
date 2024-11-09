package com.vladproduction.c14_concurrency.atomic_variables_and_locks.multiple_conditions_on_lock;

public class BlockerQueueTest2 {
    public static void main(String []args) {

        final BlockerQueue blockerQueue = new BlockerQueue(3);

        blockerQueue.insert("one");
        blockerQueue.insert("two");
        blockerQueue.insert("three");

        new Thread(() -> {
        System.out.println("Thread2: attempting to insert an item to the queue");
        blockerQueue.insert("four");
    }).start();

        new Thread(() -> {
            System.out.println("Thread1: attempting to remove an item from the queue ");
            Object o = blockerQueue.remove();
        }).start();
    }
}
