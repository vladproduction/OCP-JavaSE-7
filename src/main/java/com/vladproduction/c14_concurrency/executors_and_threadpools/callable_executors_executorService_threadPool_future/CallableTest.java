package com.vladproduction.c14_concurrency.executors_and_threadpools.callable_executors_executorService_threadPool_future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * // Illustrates how Callable, Executors, ExecutorService, and Future are related;
 * // also shows how they work together to execute a task
 * */
public class CallableTest {
    public static void main(String []args) throws Exception {

        long N = 20; // the value for which we want to find the factorial

        Callable<Long> task = new Factorial(N); // get a callable task to be submitted to the executor service

        // create an ExecutorService with a fixed thread pool consisting of one thread
        ExecutorService es = Executors.newSingleThreadExecutor();

        // submit the task to the executor service and store the Future object
        Future<Long> future = es.submit(task);

        // wait for the get() method that blocks until the computation is complete.
        System.out.printf("factorial of %d is %d", N, future.get());

        // done. shutdown the executor service since we don't need it anymore
        es.shutdown();
    }
}
