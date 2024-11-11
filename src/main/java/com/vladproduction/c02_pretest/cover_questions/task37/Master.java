package com.vladproduction.c02_pretest.cover_questions.task37;

public class Master {
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().setName("Master ");
        Thread worker = new Worker();
        worker.setName("Worker ");
        worker.start();
        Thread.currentThread().join();
        System.out.println(Thread.currentThread().getName());
    }
    //description:
    /* 1)Joining the Main Thread:
    The main thread calls Thread.currentThread().join(), which is the same as calling join() on the main thread itself.
    This means the main thread will wait for itself to finish, which creates a deadlock situation because the thread cannot finish
    while it is waiting on itself to finish.*/

    /* 2)Printing the Thread Name:
    The line System.out.println(Thread.currentThread().getName()); is never reached
    because the main thread is indefinitely waiting on itself due to the join*/
}

/*
Which one of the following options correctly describes the behavior of this program?
a) When executed, the program prints the following: “Worker Master ”.
+++b) When executed, the program prints “Worker ”, and after that the program hangs (i.e., does not terminate).
c) When executed, the program prints “Worker ” and then terminates.
d) When executed, the program throws IllegalMonitorStateException.
e) The program does not compile and fails with multiple compiler errors.*/
