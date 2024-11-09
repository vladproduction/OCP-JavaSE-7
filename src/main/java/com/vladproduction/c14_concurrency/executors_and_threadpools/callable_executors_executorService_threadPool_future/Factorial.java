package com.vladproduction.c14_concurrency.executors_and_threadpools.callable_executors_executorService_threadPool_future;

import java.util.concurrent.Callable;

/**
 * // Factorial implements Callable so that it can be passed to a ExecutorService
 * // and get executed as a task.
 * */
public class Factorial implements Callable<Long> {
    long n;
    public Factorial(long n) {
        this.n = n;
    }
    public Long call() throws Exception {
        if(n <= 0) {
            throw new Exception("for finding factorial, N should be > 0");
        }
        long fact = 1;
        for(long longVal = 1; longVal <= n; longVal++) {
            fact *= longVal;
        }
        return fact;
    }
}
        //description:
    /*Factorial class that implements Callable. Since the task is to compute the
    factorial of a number N, the task needs to return a result. You use Long type for the factorial value, so you implement
    Callable<Long>. Inside the Factorial class, you define the call() method that actually performs the task (the task
    here is to compute the factorial of the given number). If the given value N is negative or zero, you don’t perform the
    task and throw an exception to the caller. Otherwise, you loop from 1 to N and find the factorial value*/
