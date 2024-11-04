package com.vladproduction.c13_threads.concurrent_access_problems._6_more_threads_states;

public class WaitingThreadState {
    public static void main(String[] args) {
        Thread t=new InfiniteWaitThread();
        t.start();
        System.out.println(t.getName()+": I'm in state " + t.getState());
    }
}
