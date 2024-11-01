package com.vladproduction.c11_exceptions_and_assertions.question_time.quest1;

import java.nio.file.FileSystemException;

public class Base {
    public void foo() throws FileSystemException {
        throw new FileSystemException("");
    }
}
