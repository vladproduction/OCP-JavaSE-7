package com.vladproduction.c13_threads.question_time;

public class quest4 {
    public static void main(String []args) throws InterruptedException {
        Thread thread1 =new Thread(new ExtendThread(), "thread1 ");
        Thread thread2 =new Thread(thread1, "thread2 ");
        thread1.start();
        thread2.start();
//        thread1.start(); // IllegalThreadStateException
    }
}
class ExtendThread extends Thread {
    public void run() { System.out.print(Thread.currentThread().getName()); }
}

