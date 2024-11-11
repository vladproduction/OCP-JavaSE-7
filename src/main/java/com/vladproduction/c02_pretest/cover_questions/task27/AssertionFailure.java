package com.vladproduction.c02_pretest.cover_questions.task27;

public class AssertionFailure {
    public static void main(String []args) {
        try {
            assert false;
        } catch(RuntimeException re) {
            System.out.println("RuntimeException");
        } catch(Exception e) {
            System.out.println("Exception");
        } catch(Error e) { // LINE A
            System.out.println("Error" + e);
        } catch(Throwable t) {
            System.out.println("Throwable");
        }
    }
}
/*This program is invoked in command line as follows:
java AssertionFailure

Choose one of the following options describes the behavior of this program:
a) Compiler error at line marked with comment LINE A
b) Prints “RuntimeException” in console
c) Prints “Exception”
d) Prints “Error”
e) Prints “Throwable”
+++f) Does not print any output on console*/
/*By default, assertions are disabled. If -ea (or the -enableassertions option to enable assertions), then
the program would have printed “Error” since the exception thrown in the case of assertion failure is
java.lang.AssertionError, which is derived from the Error class.*/
