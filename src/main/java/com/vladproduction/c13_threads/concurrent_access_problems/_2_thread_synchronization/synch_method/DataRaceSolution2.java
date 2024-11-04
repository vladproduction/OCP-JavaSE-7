package com.vladproduction.c13_threads.concurrent_access_problems._2_thread_synchronization.synch_method;

public class DataRaceSolution2 {
    public static void main(String[] args) {
        UserThreadImproved2 user = new UserThreadImproved2();
        invoker(creator(user, 3));
        //output:
        //1 2 3 4 5 6 7 8 9

    }

    private static Thread[] creator(UserThreadImproved2 userThreadImproved, int numberOfThreads){
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

class UserThreadImproved2 implements Runnable{
    @Override
    public void run() {
        incrementValue();
        incrementValue();
        incrementValue();
    }

    /**
     * in this example we are using synchronized method instead synchronized block;
     * method could be as static also: //public static synchronized void incrementValue()'{...}'
     * */
    public static synchronized void incrementValue(){
        CounteringClass2.countValue++; //incrementing value
        System.out.print(CounteringClass2.countValue + " ");
    }
}

class CounteringClass2{
    public static long countValue = 0;
}
