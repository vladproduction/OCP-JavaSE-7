package com.vladproduction.c14_concurrency.parallel_fork_join_framework;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.concurrent.ForkJoinTask.invokeAll;

/**
 * //This class illustrates how we can search a key within N numbers using fork/join framework
 * // (using RecursiveAction).
 * //The range of numbers are divided into half until the range can be handled by a thread.
 * */
public class SearchUsingForkJoin {
    private static int N = 10000;
    private static final int NUM_THREADS = 10; // number of threads to create for
    // distributing the effort
    private static int searchKey= 100;
    private static int[] arrayToSearch;

    // This is the recursive implementation of the algorithm;
    // inherit from RecursiveAction
    static class SearchTask extends RecursiveAction {
        private static final long serialVersionUID = 1L;
        int from, to;
        // from and to are range of values to search
        public SearchTask(int from, int to) {
            this.from = from;
            this.to = to;
        }

        public void compute() {
            //If the range is smaller enough to be handled by a thread,
            //we search in the range
            if( (to - from) <= N/NUM_THREADS) {
                // add in range 'from' .. 'to' inclusive of the value 'to'
                for(int i = from; i <= to; i++) {
                    if(arrayToSearch[i] == searchKey)
                        System.out.println("Search key found at index:" +i);
                }
            }
            else {
                // no, the range is big for a thread to handle,
                // so fork the computation
                // we find the mid-point value in the range from..to
                int mid = (from + to)/2;
                System.out.printf("Forking computation into two ranges: " +
                        "%d to %d and %d to %d %n", from, mid, mid, to);
                //invoke all the subtasks
                invokeAll(new SearchTask(from, mid),new SearchTask(mid + 1, to));
            }
        }
    }

    public static void main(String []args) {
        //intantiate the array to be searched
        arrayToSearch = new int[N];
        //fill the array with random numbers
        for(int i=0; i<N; i++){
            arrayToSearch[i] = ThreadLocalRandom.current().nextInt(0,1000);
        }
        // Create a fork-join pool that consists of NUM_THREADS
        ForkJoinPool pool = new ForkJoinPool(NUM_THREADS);
        // submit the computation task to the fork-join pool
        pool.invoke(new SearchTask(0, N-1));
    }

}

/*The key difference between is that we used RecursiveAction in the latter instead of
RecursiveTask. We made several changes to extend the task class from RecursiveAction. The first change is that
the compute() method is not returning anything. Another change is that we used the invokeAll() method to submit
the subtasks to execute. Another obvious change is that we carried out search in the compute() method instead of
summation in earlier case.*/
