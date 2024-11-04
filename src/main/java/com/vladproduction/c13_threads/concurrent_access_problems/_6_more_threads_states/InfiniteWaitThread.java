package com.vladproduction.c13_threads.concurrent_access_problems._6_more_threads_states;

/**
 * This class has run method which waits forever since there is no other thread to notify it
 */
public class InfiniteWaitThread extends Thread {
    static boolean okayToRun = false;

    synchronized public void run() {
        while (!okayToRun) {
            try {
                // note the call to wait without any timeout value
                // so it waits forever for some thread to notify it
                wait();
            } catch (InterruptedException e) {
                // its okay to ignore this exception since we're not
                // interrupting exceptions in this code
                e.printStackTrace();
            }
        }
    }
}
