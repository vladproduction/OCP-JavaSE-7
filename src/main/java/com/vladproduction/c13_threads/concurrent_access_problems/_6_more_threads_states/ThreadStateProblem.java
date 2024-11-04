package com.vladproduction.c13_threads.concurrent_access_problems._6_more_threads_states;

/**
 * never do not call start twice on same thread: IllegalThreadStateException
 * */
public class ThreadStateProblem {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
//        thread.start();
    }
}

/*trying to start a thread that has already started. When you call start(), the thread moves to the
new state. There is no proper state transition from the new state if you call start() again, so the JVM throws an
IllegalThreadStateException.*/
