package com.vladproduction.c02_pretest.cover_questions.task25;

public class DeriDeriClass extends DeriClass {
    @Override
    public void foo() { // LINE A
        throw new InvalidKeyException();
    }
}
