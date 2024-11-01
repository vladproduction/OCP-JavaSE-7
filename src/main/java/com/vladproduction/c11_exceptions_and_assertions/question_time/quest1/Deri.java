package com.vladproduction.c11_exceptions_and_assertions.question_time.quest1;

import java.nio.file.AccessDeniedException;
import java.nio.file.FileSystemException;

public class Deri extends Base{
    /* provide foo definition here */
    //B
    public void foo() throws AccessDeniedException {
        throw new AccessDeniedException("");
    }
    //C
    /*public void foo() throws FileSystemException, RuntimeException {
        throw new NullPointerException();
    }*/


}

/*Which of the following overriding definitions of the foo() method in the Deri class are compatible with the
        base class foo() method definition? Choose all the foo() method definitions that could compile without
errors when put in the place of the comment: *//* provide foo definition here */
/*A.
public void foo() throws IOException {
    super.foo();
}*/
/*B.
public void foo() throws AccessDeniedException {
    throw new AccessDeniedException("");
}*/
/*C.
public void foo() throws FileSystemException, RuntimeException {
    throw new NullPointerException();
}*/
/*D.
public void foo() throws Exception {
    throw new NullPointerException();
}*/

/*Answer: B and C.

(In option A and D, the throws clause declares to throw exceptions IOException and Exception
respectively, which are more general than the FileSystemException, so they are not compatible with the
base method definition.
In option B, the foo() method declares to throw AccessDeniedException, which
is more specific than FileSystemException, so it is compatible with the base definition of the foo()
method.
In option C, the throws clause declares to throw FileSystemException, which is the same as in
the base definition of the foo() method. Additionally it declares to throw RuntimeException, which is not
a checked exception, so the definition of the foo() method is compatible with the base definition of the
foo() method).*/
