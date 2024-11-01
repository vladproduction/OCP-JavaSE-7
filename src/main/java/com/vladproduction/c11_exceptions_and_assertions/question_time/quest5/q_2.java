package com.vladproduction.c11_exceptions_and_assertions.question_time.quest5;

public class q_2 {
    /*Consider the following code segment, which makes use of this exception hierarchy:
            try {
        LoginException le = new AccountNotFoundException();
        throw (Exception) le;
    }
catch (AccountNotFoundException anfe) {
        System.out.println("In the handler of AccountNotFoundException");
    }
catch (AccountException ae) {
        System.out.println("In the handler of AccountException");
    }
catch (LoginException le) {
        System.out.println("In the handler of LoginException");
    }
catch (Exception e) {
        System.out.println("In the handler of Exception");
    }
    When executed, which of the following statements will this code segment print?
    A. In the handler of AccountNotFoundException
    B. In the handler of AccountException
    C. In the handler of LoginException
    D. In the handler of Exception
    Answer: A. In the handler of AccountNotFoundException
            (In this code, the created type of the exception is AccountNotFoundException. Though
                    the exception object is stored in the variable of type LoginException and then typecasted to Exception, the dynamic type of the exception remains the same, which is
AccountNotFoundException. When looking for a catch handler, the Java runtime looks for the
                     exact handler based on the dynamic type of the object. Since it is available immediately as the
                     first handler, this exactly matching catch handler got executed.)*/
}
