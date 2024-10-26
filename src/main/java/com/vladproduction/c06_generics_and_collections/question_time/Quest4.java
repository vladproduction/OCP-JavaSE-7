package com.vladproduction.c06_generics_and_collections.question_time;

public class Quest4 {
    public static void main(String[] args) {

        StrLastError<String> err = new StrLastError<>("Error");
        err.setError("Last error");

                /*A. It prints the following: StrLastError: setError.
                B. It prints the following: LastError: setError.
                C. It results in a compilation error.
                D. It results in a runtime exception.
                Answer: C.*/

        /*(It looks like the setError() method in StrLastError is overriding setError() in the LastError class.
        However, it is not the case. At the time of compilation, the knowledge of type S is not available. Therefore,
        the compiler records the signatures of these two methods as setError(String) in superclass and
        setError(S_extends_CharSequence) in subclass—treating them as overloaded methods (not overridden).
        In this case, when the call to setError() is found, the compiler finds both the overloaded methods matching,
        resulting in the ambiguous method call error.*/

        //resolving problem give us:
        //demonstrating inheritance and method overriding principles in Java;
        //to make code compile:
        /*The setError method in StrLastError is now declared to take a String parameter.
        This matches the type that the superclass (LastError<String>) expects.
        This modification allows the method to compile successfully because
        both methods (setError(T t) in LastError and setError(String s) in StrLastError) are considered compatible*/

    }
}

class LastError<T> {
    private T lastError;
    void setError(T t){
        lastError = t;
        System.out.println("LastError: setError");
    }
}
class StrLastError<S extends CharSequence> extends LastError<String>{
    public StrLastError(S s) {
    }
    /*void setError(S s){
        System.out.println("StrLastError: setError");
    }*/
    @Override
    void setError(String s){
        System.out.println("StrLastError: setError");
    }
}

