package com.vladproduction.c14_concurrency.question_time.quest2;

import java.util.concurrent.Callable;

public class CorrectlyUsageCallable {
    public static void main(String[] args) {
        ver1();
        ver2();
        ver3();
        ver4();
    }

//    the call( ) method has the return type int, which is incompatible with the
//    return type expected for overriding the call method and so will not compile
    private static void ver1() {
//        class CallableTask implements Callable {
//            public int call() {
//                System.out.println("In Callable.call()");
//                return 0;
//            }
//        }
    }

//    the extends keyword is used, which will result in a compiler (since
//    Callable is an interface, the implements keyword should be used).
    private static void ver2() {
//        class CallableTask extends Callable {
//            public Integer call() {
//                System.out.println("In Callable.call()");
//                return 0;
//            }
//        }
    }

//    correctly defines the Callable interface providing the type parameter
//    <Integer>. the same type parameter Integer is also used in the return type of the
//    call( ) method that takes no arguments, so it will compile without errors
    private static void ver3() {
        class CallableTask implements Callable<Integer> {
            public Integer call() {
                System.out.println("In Callable.call()");
                return 0;
            }
        }
    }

//    the return type of call() is void and the call( ) method also takes a
//    parameter of type Integer. Hence, the method declared in the interface Integer call()
//    remains unimplemented in the CallableTask class and so the program will not compile.)

    private static void ver4() {
//        class CallableTask implements Callable<Integer> {
//            public void call(Integer i) {
//                System.out.println("In Callable.call(i)");
//            }
//        }
    }
}
