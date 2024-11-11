package com.vladproduction.c02_pretest.cover_questions.task25;

public class DeriClass extends BaseClass {
    @Override
    public void foo() throws IllegalArgumentException {
        throw new InvalidValueException();
    }
}
