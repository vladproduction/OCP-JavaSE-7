package com.vladproduction.c13_threads.intro;

public class MyThread2 implements Runnable{
    public static void main(String[] args) {
        Thread myThread = new Thread(new MyThread2());
        myThread.start();
        System.out.println("In main method; thread name is: " + Thread.currentThread().getName());
    }
    @Override
    public void run() {
        System.out.println("In run method; thread name is: " + Thread.currentThread().getName());
    }
}
