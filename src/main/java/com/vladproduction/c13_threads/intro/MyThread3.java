package com.vladproduction.c13_threads.intro;

/**
 * Never call the run() method directly for invoking a thread. Use the start() method and leave it to the
 * JVM to implicitly invoke the run() method. Calling the run() method directly instead of calling start()
 * is a mistake and is fairly common bug.
 * */
public class MyThread3 implements Runnable{
    public static void main(String[] args) {
        Thread myThread =new Thread(new MyThread3());
        // note run() instead of start() here
        myThread.run();
        System.out.println("In main method; thread name is : "+
                Thread.currentThread().getName());

    }

    @Override
    public void run() {
        System.out.println("In run method; thread name is: " + Thread.currentThread().getName());
    }
}
