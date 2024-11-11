package com.vladproduction.c02_pretest.cover_questions.task39;

public class Waiter extends Thread {
    public static void main(String[] args) {
        new Waiter().start();
    }
    //description flow:

    /*The run() method first prints "Starting to wait".
    It then calls wait(1000). However, wait() can only be called from a synchronized context (i.e., within a synchronized block or method on an object).
    Since wait() is called on the Waiter thread without synchronization, this will lead to a runtime exception.*/

    /*Because wait() is not called from a synchronized context, it throws IllegalMonitorStateException, which is a subclass of RuntimeException.
    The catch(Exception e) block will catch this exception, leading to "Caught Exception".*/
    @Override
    public void run() {
        try {
            System.out.println("Starting to wait");
            wait(1000);
            System.out.println("Done waiting, returning back");
        }
        catch(InterruptedException e) {
            System.out.println("Caught InterruptedException ");
        }
        catch(Exception e) {
            System.out.println("Caught Exception ");
        }
    }
}
/*
Which one of the following options correctly describes the behavior of this program?
a) The program prints
Starting to wait
Done waiting, returning back
b) The program prints
Starting to wait
Caught InterruptedException
+++c) The program prints
Starting to wait
Caught Exception
d) The program prints
Starting to wait
After that, the program gets into an infinite wait and deadlocks*/
