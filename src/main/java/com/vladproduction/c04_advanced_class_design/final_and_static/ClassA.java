package com.vladproduction.c04_advanced_class_design.final_and_static;

public class ClassA {
    public static void main(String[] args) {

        // Creating an instance of ChildOfAbstract
        ClassAbstract child = new ChildOfAbstract();

        // Call the final method
        String finalResult = child.finalMethod();
        System.out.println("Result from final method: " + finalResult);

        // Call the not final method (which is overridden in ChildOfAbstract)
        String notFinalResult = child.notFinalMethod();
        System.out.println("Result from not final method: " + notFinalResult);

        // Attempting to create an instance of ClassAbstract will result in an error
        // Uncommenting the following line will cause a compile-time error
        // ClassAbstract abstractInstance = new ClassAbstract();

        // Showing that child is an instance of ClassAbstract
        if (child instanceof ClassAbstract) {
            System.out.println("child is an instance of ClassAbstract");
        }

        // Showing that child is an instance of ChildOfAbstract
        if (child instanceof ChildOfAbstract) {
            System.out.println("child is an instance of ChildOfAbstract");
        }

        System.out.println("========");
        ChildOfAbstract childOfAbstract = new ChildOfAbstract();
        System.out.println(childOfAbstract.notFinalMethod()); //try to use not final method
        System.out.println(childOfAbstract.finalMethod()); //try to use final method


    }


}

abstract class ClassAbstract{
    //final method (can not be overridden):
    final  String finalMethod(){
        return "final method";
    }

    //not final method:
    public abstract String notFinalMethod();
}

class ChildOfAbstract extends ClassAbstract{
    @Override
    public String notFinalMethod() {
        return "not final method overridden";
    }
}




