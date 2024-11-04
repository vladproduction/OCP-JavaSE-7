package com.vladproduction.c13_threads.concurrent_access_problems._6_more_threads_states;

/**
 * The Thread class defines Thread.State enumeration, which has a list of possible thread states;
 * Simple program that prints the value of the states in this enumeration;
 * */
public class ThreadStatesEnumeration {
    public static void main(String []s) {
        for(Thread.State state : Thread.State.values()){
            System.out.println(state);
        }
    }
}

/*
        NEW
        RUNNABLE
        BLOCKED
        WAITING
        TIMED_WAITING
        TERMINATED
*/
