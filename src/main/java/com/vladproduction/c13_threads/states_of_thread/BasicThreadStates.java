package com.vladproduction.c13_threads.states_of_thread;

public class BasicThreadStates extends Thread{
    public static void main(String []s) throws Exception {
        Thread t = new Thread(new BasicThreadStates());
        System.out.println("Just after creating thread; \n" +
                " The thread state is: " + t.getState());
        t.start();
        System.out.println("Just after calling t.start(); \n" +
                " The thread state is: " + t.getState());
        t.join();
        System.out.println("Just after main calling t.join(); \n" +
                " The thread state is: " + t.getState());
    }
}

/*Just after creating thread;
The thread state is: NEW
Just after calling t.start();
The thread state is: RUNNABLE
Just after main calling t.join();
The thread state is: TERMINATED*/
