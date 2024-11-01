package com.vladproduction.c11_exceptions_and_assertions.question_time.quest4;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiCatch {
    public static void fooThrower() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
    public static void barThrower() throws SQLException {
        throw new SQLException();
    }
    public static void main(String []args) {
        try {
            fooThrower();
            barThrower();
        } catch(FileNotFoundException | SQLException multie) { //not able to use '||'
            System.out.println(multie);
        }
    }

    /*Which one of the following options correctly describes the behavior of this program?
    A. This program prints the following: java.io.FileNotFoundException.
    B. This program prints the following: java.sql.SQLException.
    C. This program prints the following: java.io.FileNotFoundException || java.sql.SQLException.
    D. This program fails with compiler error(s).

    Answer: D. This program fails with compiler error(s).

    (For multi-catch blocks, the single pipe (|) symbol needs to be used and not double pipe (||), as
    provided in this program. Hence this program will fail with compiler error(s).*/
}
