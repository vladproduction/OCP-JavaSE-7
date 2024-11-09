package com.vladproduction.c14_concurrency.executors_and_threadpools.timeunit_enumeration;

import java.util.concurrent.TimeUnit;

public class DayTiming {
    public static void main(String[] args) {
        System.out.printf("Day has %d hours, %d minutes, %d seconds",
                TimeUnit.DAYS.toHours(1), TimeUnit.DAYS.toMinutes(1), TimeUnit.DAYS.toSeconds(1));
    }
}
