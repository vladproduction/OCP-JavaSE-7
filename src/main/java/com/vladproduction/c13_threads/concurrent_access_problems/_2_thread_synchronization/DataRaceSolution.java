package com.vladproduction.c13_threads.concurrent_access_problems._2_thread_synchronization;

/**
 * Here is an improved version of the program discussed in the previous section that performs synchronized access
 * to CounteringClass.counter and does both read and write operations on that in a critical section.
 * For that, you need to change only the increment method;
 * */
public class DataRaceSolution {
    public static void main(String[] args) {
        UserThreadImproved user = new UserThreadImproved();
        invoker(creator(user, 3));

    }

    private static Thread[] creator(UserThreadImproved userThreadImproved, int numberOfThreads){
        Thread[] threads = new Thread[numberOfThreads];
        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new Thread(userThreadImproved);
        }
        return threads;
    }

    private static void invoker(Thread[] threads){
        for (Thread thread : threads) {
            thread.start();
        }
    }

}

class UserThreadImproved implements Runnable {
    // These two statements perform read and write operations
    // on a variable that is commonly accessed by multiple threads.
    // So, acquire a lock before processing this "critical section"

    @Override
    public void run() {
        incrementing();
        incrementing();
        incrementing();
    }
    public void incrementing() {
        synchronized (this) {
            CounteringClass.counter++;
            System.out.print(CounteringClass.counter + " ");
        }
    }
}

class CounteringClass{
    public static int counter = 0;
}

/*In the increment() method, you acquire a lock on the this reference before reading and writing to Counter.count.
So, it is not possible for more than one thread to execute these statements at the same time. Since only one thread can
acquire a lock and execute the “critical section” code block, the counter is incremented by only one thread at a given
time; as a result, the program prints the values 1 to 9 correctly (without the data race problem).*/
