package com.vladproduction.c14_concurrency.atomic_variables_and_locks.multiple_conditions_on_lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * This implements a fixed size queue with size determined at the time of creation.
 * If remove() is called when there are no elements, then the queue blocks (i.e., waits) until an element is inserted.
 * If insert() is called when the queue is full, then the queue blocks until an element is removed
 * */
public class BlockerQueue {

    private int size = 0; // remember the max size of the queue
    private Object elements[]; // array to store the elements in the queue
    private int currPointer = 0; // pointer that points to the current element in the queue
    private Lock internalLock = new ReentrantLock(); // internal lock used for synchronized access to the BlockerQueue
    private Condition empty = internalLock.newCondition(); // condition to wait for when queue is empty that makes use of the common lock
    private Condition full = internalLock.newCondition(); // condition to wait for when queue is full that makes use of the common lock

    public BlockerQueue(int size) {
        this.size = size;
        elements = new Object[size];
    }

    // remove an element if available; or if there are no elements in the queue,
    // await insertion of an element. Once an element is inserted, notify to any threads
    // waiting for insertion in a full queue
    public Object remove() {
        Object element = null;
        internalLock.lock();
        try {
            if(currPointer == 0) {
                System.out.println("In remove(): no element to remove, so waiting for insertion");
                // cannot remove - no elements in the queue;
                // so block until an element is inserted
                empty.await();
                // if control reaches here, that means some thread completed
                // calling insert(), so proceed to remove that element
                System.out.println("In remove(): got notification that an element has got inserted");
            }
            // decrement the currPointer and then get the element
            element = elements[--currPointer];
            System.out.println("In remove(): removed the element " + element);

            // an element is removed, so there is space for insertion
            // so notify any threads waiting to insert
            full.signalAll();
            System.out.println("In remove(): signalled that there is space for insertion");
        } catch(InterruptedException ie) {
            ie.printStackTrace();
        } finally {
            internalLock.unlock();
        }
        return element;
    }

    // insert an element if there is space for insertion. if queue is full,
    // await for remove() to be called and get signal to proceed for insertion.
    // after insertion, signal any awaiting threads in case of an empty queue.
    public void insert(Object element) {
        internalLock.lock();
        try {
            if(currPointer == size) {
                System.out.println("In insert(): queue is full, so waiting for removal");
                // cannot insert - the queue is full;
                // so block until an element is removed
                full.await();
                // if control reaches here, that means some thread completed
                // calling remove(), so proceed to insert this element
                System.out.println("In insert(): got notification that remove got called, so proceeding to insert the element");
            }
            // get the element and after that decrement the currPointer
            elements[currPointer++] = element;
            System.out.println("In insert(): inserted the element " + element);
            // an element is inserted, so any other threads can remove it...
            // so notify any threads waiting to remove
            empty.signalAll();
            System.out.println("In insert(): notified that queue is not empty");
        } catch(InterruptedException ie) {
            ie.printStackTrace();
        } finally {
            internalLock.unlock();
        }
    }

}
