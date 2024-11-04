package com.vladproduction.c13_threads.concurrent_access_problems._6_more_threads_states;

/**
 * // The class creates two threads to show how to these threads will enter into
 * // RUNNABLE and BLOCKED states
 * */
public class MoreThreadStates {
    public static void main(String []s) {
        Thread t1=new SleepyThread();
        Thread t2 =new SleepyThread();
        t1.start();
        t2.start();
        System.out.println(t1.getName() + ": I'm in state " + t1.getState());
        System.out.println(t2.getName() + ": I'm in state " + t2.getState());

        //Thread-0: I'm in state RUNNABLE; doing the job
        //Thread-1: I'm in state BLOCKED; meanwhile is started also, and have to wait
    }
}
