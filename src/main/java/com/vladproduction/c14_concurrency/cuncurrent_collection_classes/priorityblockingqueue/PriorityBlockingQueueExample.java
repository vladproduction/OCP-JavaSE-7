package com.vladproduction.c14_concurrency.cuncurrent_collection_classes.priorityblockingqueue;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * Illustrates the use of PriorityBlockingQueue. In this case, if there is no element available in the priority queue
 * the thread calling take() method will block (i.e., wait) until another thread inserts an element
 */
public class PriorityBlockingQueueExample {
    public static void main(String[] args) {
        final PriorityBlockingQueue<Integer> blockingQueue = new PriorityBlockingQueue<>();

        //this thread trying to remove element from blockingQueue
        new Thread() {
            public void run() {
                try {
                    // use take() instead of remove()
                    // note that take() blocks, whereas remove() doesn't block
                    System.out.println("The removed element is: "
                            + blockingQueue.take());
                } catch (InterruptedException ie) {
                    // its safe to ignore this exception
                    ie.printStackTrace();
                }
            }
        }.start();

        //this thread trying to add element to blockingQueue
        new Thread() {
            public void run() {
                // add an element with value 10 to the priority queue
                blockingQueue.add(10);
                System.out.println("Successfully added an element to the queue ");
            }
        }.start();

    }
}
