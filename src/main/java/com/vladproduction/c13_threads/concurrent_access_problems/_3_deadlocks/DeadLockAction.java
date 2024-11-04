package com.vladproduction.c13_threads.concurrent_access_problems._3_deadlocks;

public class DeadLockAction {
    public static void main(String[] args) throws InterruptedException {

        //create instance of Runnable
        CountValuesClassRunnable counter = new CountValuesClassRunnable();

        //create three threads and start them at the same time
        Thread t1 = new Thread(counter);
        Thread t2 = new Thread(counter);
        Thread t3 = new Thread(counter);
        t1.start();
        t2.start();
        t3.start();

        //completing execution of started threads
        System.out.println("Waiting for threads to complete execution...");
        t1.join();
        t2.join();
        t3.join();

        //print info of work is done
        System.out.println("Done.");

        //output due to the catch deadlock may occur  sometimes unpredictable

    }

    /*There are different strategies to deal with deadlocks, such as deadlock prevention, avoidance, or detection. For
    exam purposes, this is what you need to know about deadlocks:
            •	 Deadlocks can arise in the context of multiple locks.
            •	 If multiple locks are acquired in the same order, then a deadlock will not occur; however, if
                 you acquire them in a different order, then deadlocks may occur.
            •	 Deadlocks (just like other multi-threading problems) are non-deterministic; you cannot
                 consistently reproduce deadlocks.*/
}
