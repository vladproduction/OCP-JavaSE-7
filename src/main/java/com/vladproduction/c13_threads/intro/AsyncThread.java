package com.vladproduction.c13_threads.intro;

/**
 * Threads run asynchronously. Threads do not run sequentially (like function calls), so the order of
 * execution of threads is not predictable—in other words, thread behavior is non-deterministic in nature
 * */
public class AsyncThread extends Thread{
    public static void main(String args[]) {
        AsyncThread asyncThread1=new AsyncThread();
        AsyncThread asyncThread2=new AsyncThread();
        // start both the threads around the same time
        asyncThread1.start();
        asyncThread2.start();
    }

    @Override
    public void run() {
        System.out.println("Starting the thread " + getName());
        for (int i = 0; i < 3; i++) {
            System.out.println("In thread " + getName() + "; iteration " + i);
            try {
                // sleep for sometime before the next iteration
                Thread.sleep(10);
            } catch (InterruptedException ie) {
                // we're not interrupting any threads
                // – so safe to ignore this exeception
                ie.printStackTrace();
            }
        }
    }
}
/*Since behavior of multi-threaded programs is non-deterministic, you must be careful in writing
multi-threaded programs. You cannot expect pre-determined output based on the execution order of
threads.*/
