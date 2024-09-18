package com.vladproduction.c04_advanced_class_design.nested_classes;

/**
 * In Java, it is not strictly true that you can only pass final variables to a local inner class.
 * However, the variables that a local inner class can access must be effectively final.
 * */
public class OuterClass {
    public static void main(String[] args) {

        OuterClass outer = new OuterClass();
        outer.outerMethod();
    }

    /*You can use both final and effectively final variables in a local inner class.
    Non-final variables that can change and are referenced within the local inner class can lead to compilation
    errors if they are modified after being defined. Therefore, the key restriction is that the variables accessed
    must either be explicitly declared as final or must remain effectively final (not modified after initialization).*/
    public void outerMethod() {
        final int finalVariable = 10; // Explicitly final variable
        int effectivelyFinalVariable = 20; // Effectively final variable (never modified)

        class LocalInnerClass {
            void display() {
                System.out.println("Final Variable: " + finalVariable);
                System.out.println("Effectively Final Variable: " + effectivelyFinalVariable);
            }
        }

        LocalInnerClass inner = new LocalInnerClass();
        inner.display();
    }

    public void anotherMethod() {
        int nonFinalVariable = 30;

        // Uncommenting the following line will cause an error
        // if (nonFinalVariable > 0) {
        //     nonFinalVariable = 40; // Non-final variable cannot be accessed if modified
        // }

        class LocalInnerClass {
            void display() {
                // Cannot access nonFinalVariable if it were modified
                // System.out.println("Non-Final Variable: " + nonFinalVariable); // This would be an error
            }
        }

        LocalInnerClass inner = new LocalInnerClass();
        // inner.display(); // Uncommenting this would lead to 'Cannot reference non-final variable'
    }
}

/**
 * Local Inner Class: A local inner class is defined within a method and can only access local variables and parameters
 * that are declared final or are effectively final.
 *
 * Effectively Final: A variable is considered effectively final if it is not modified after it is initialized.
 * Even if a variable is not explicitly declared as final, if it is not changed, it can still be accessed by the inner class.
 *
 * Restrictions: You cannot access non-final or variables that may change after their declaration within the
 * local inner class.
 * */
