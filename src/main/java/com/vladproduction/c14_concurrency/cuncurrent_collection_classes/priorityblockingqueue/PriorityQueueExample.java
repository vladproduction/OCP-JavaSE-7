package com.vladproduction.c14_concurrency.cuncurrent_collection_classes.priorityblockingqueue;

import java.util.PriorityQueue;

/**
 * Assume that you
 * have a PriorityQueue object shared by two threads. Assume that one thread inserts an element into the priority
 * queue, and the other thread removes an element. If the threads are scheduled such that the inserting an element
 * occurs before removing the element, there is no problem. However, if the first thread attempts to remove an element
 * before the second thread inserts an element, you get into trouble;
 *
 * so this program:
 * PriorityQueue example. Here, we create two threads in which one thread inserts an element,
 * and another thread removes an element from the priority queue.
 * */
public class PriorityQueueExample {
    public static void main(String []args) {
        final PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        // spawn a thread that removes an element from the priority queue
        new Thread() {
            public void run() {
                // Use remove() method in PriorityQueue to remove the element if available
                System.out.println("The removed element is: " + priorityQueue.remove());
            }
        }.start();
        // spawn a thread that inserts an element into the priority queue
        new Thread() {
            public void run() {
                // insert Integer value 10 as an entry into the priority queue
                priorityQueue.add(10);
                System.out.println("Successfully added an element to the queue ");
            }
        }.start();
    }
}
