package com.vladproduction.c03_java_class_design.essentials_OOP;

public class OverloadingMethod {
    public static void main(String[] args) {

        byte b = 9;
        aMethod(b); // first call - closest type (in size) is short type (so the compiler resolves the call aMethod(b) to aMethod(short val) definition)
        aMethod(9); // second call - closest match is aMethod(int), so the compiler resolves the call aMethod(9) to definition
        Integer i = 9;
        aMethod(i); // third call - closest match is aMethod(Object val), so it is called;  compiler allows implicit up-casts
        aMethod("9"); // fourth call - argument is a String type; so we have exactly defined method with such param

    }

    public static void aMethod (int val) { System.out.println ("int"); }
    public static void aMethod (short val) { System.out.println ("short"); }
    public static void aMethod (Object val) { System.out.println ("object"); }
    public static void aMethod (String val ) { System.out.println ("String"); }


}

class Overloaded {
    public static void main(String[] args) {

//        aMeth(9); //compiler error (no matching symbols)

}
    public static void aMeth (byte val ) { System.out.println ("byte"); }
    public static void aMeth (short val ) { System.out.println ("short"); }

}

//example of issue (ambiguous symbols)
class Two_Matches_in_Overloaded{

    public static void method (long val1, int val2) {
        System.out.println ("long, int");
    }

    public static void method (int val1, long val2) {
        System.out.println ("int, long");
    }

    public static void main(String[] args) {
        /*An integer can be implicitly upcasted to both long as well as Integer. Which one will the
        compiler choose?*/
//        method(9, 10); //compiler error (matching ambiguous symbols)
    }

}
