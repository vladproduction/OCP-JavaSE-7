package com.vladproduction.c02_pretest.cover_questions.task08;

/**
 * This behavior highlights the distinction between static and instance method resolution in Java:
 *
 * Static Methods: Resolved at compile-time based on the reference type.
 * Instance Methods: Resolved at runtime based on the actual object type.
 * */
public class OverrideTest {
    public static void main(String []args) {
        Base bObj = new Derived();
        bObj.foo(bObj);

        //In Base.foo()
        //In Derived.bar()

        /*  Static Method Hiding: The foo() method in Derived hides the foo() method in Base.
        The call to foo() is resolved based on the reference type, not the object type.
            Dynamic Method Dispatch: The call to bar() is resolved at runtime based on the actual instance type,
        which is why In Derived.bar() is printed.*/

    }
}
//description:
// * Both classes implement a static method foo(Base bObj), and an instance method bar().
// * The static method foo(Base bObj) in both classes is a method hiding scenario (not overriding),
//     because static methods are not dispatched based on the instance's type.
// * The instance method bar() is overridden in the Derived class.
// * creates an instance of Derived, but the variable type is Base.
// * bObj.foo(bObj); calls the foo method on bObj. Since foo is static,
//     which method gets called is determined by the reference type (Base), not the actual instance (Derived).
// * Since the reference type of bObj is Base, the foo(Base bObj) method from the Base class is executed.
// * statement in Base.foo() is:
//     bObj.bar();
//     Here, bar() is an instance method. In this case, Java resolves the method to call based on the actual object type of bObj,
//     which is Derived (the runtime type). Therefore, the overridden bar() method from Derived is called.

/*
What is the output of this program when executed?
a)
In Base.foo()
In Base.bar()
+++b)
In Base.foo()
In Derived.bar()
c)
In Derived.foo()
In Base.bar()
d)
In Derived.foo()
In Derived.bar()*/
