package com.vladproduction.c13_threads.concurrent_access_problems._6_more_threads_states;

/**
 * This Thread class just invokes sleep method after acquiring lock on its class object;
 * */
public class SleepyThread extends Thread {
    public void run() {
        synchronized(SleepyThread.class) {
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException ie) {
                // its okay to ignore this exception since we're not
                // interrupting exceptions in this code
                ie.printStackTrace();
            }
        }
    }
}
