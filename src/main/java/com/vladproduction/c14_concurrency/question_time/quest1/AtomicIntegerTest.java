package com.vladproduction.c14_concurrency.question_time.quest1;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {
    static AtomicInteger ai = new AtomicInteger(10);

    public static void main(String []args) {
        increment();
        decrement();
        compare();
        check();
        System.out.println(ai);
    }

    public static void check() {
        assert (ai.intValue() % 2) == 0;
    }
    public static void increment() {
        ai.incrementAndGet();
    }
    public static void decrement() {
        ai.getAndDecrement();
    }
    public static void compare() {
        ai.compareAndSet(10, 11);
    }
}
