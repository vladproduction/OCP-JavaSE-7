package com.vladproduction.c02_pretest.cover_questions.task20;

public class SimpleCounter <T> {
    private static int count = 0;
    public SimpleCounter() {
        count++;
    }
    static int getCount() {
        return count;
    }
}
