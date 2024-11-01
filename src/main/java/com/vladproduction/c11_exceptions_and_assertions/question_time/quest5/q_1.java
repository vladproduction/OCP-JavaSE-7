package com.vladproduction.c11_exceptions_and_assertions.question_time.quest5;

public class q_1 {
    /*Which of the following handlers that makes use of multi-catch exception handler feature will compile
    without errors?
    A. catch (AccountException | LoginException exception)
    B. catch (AccountException | AccountExpiredException exception)
    C. catch (AccountExpiredException | AccountNotFoundException exception)
    D. catch (AccountExpiredException exception1 | AccountNotFoundException exception2)
    Answer: C. catch (AccountExpiredException | AccountNotFoundException exception)
            (For A and B, the base type handler is provided with the derived type handler, hence the multicatch is incorrect. For D, the exception name exception1 is redundant and will result in a syntax
    error. C is the correct option and this will compile fine without errors).*/
}
