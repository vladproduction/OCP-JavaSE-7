package com.vladproduction.c14_concurrency.executors_and_threadpools.executor;

import java.util.concurrent.Executor;

/**
 * This class implements Executor interface and should override execute(Runnable) method.
 * We provide an overloaded execute method with an additional argument 'times' to create and
 * run the threads for given number of times
 * */
public class RepeatedExecutor implements Executor {

    @Override
    public void execute(Runnable command) {
        new Thread(command).start();
    }

    public void executeTask(Runnable runnable, int times) {
        System.out.printf("Calling Task.run() through Executor.execute() for %d times %n", times);
        for(int i = 0; i < times; i++) {
            execute(runnable);
        }
    }
}
