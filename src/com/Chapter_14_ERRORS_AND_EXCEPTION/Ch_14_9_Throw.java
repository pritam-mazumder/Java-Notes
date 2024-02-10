package com.Chapter_14_ERRORS_AND_EXCEPTION;

import java.util.Scanner;

/*
    THROW:              Can be used for both "CHECKED and UN-CHECKED EXCEPTION"
                        but mostly preferred for "CUSTOMISED EXCEPTION"
                                                        or
                                                 "RuntimeException"
                                                        or
                                                 "UN-CHECKED EXCEPTION"

    The throw keyword in Java is used to explicitly throw an exception from a method or any block of code.
    We can throw either checked or unchecked exception.
    The throw keyword is mainly used to throw custom exceptions.

    We cannot write any statement after throw,
    otherwise it will provide unreachable statement error.

    Throw keyword is used to throw the user defined or customised exception
    to the JVM explicitly.
 */

class Ex1 extends RuntimeException {
    Ex1(String msg) {
        super(msg);
    }
}

class Ex2 {
    public static int d(int i, int j) {
        if (j < 0) {
            throw new ArithmeticException();
        }
        return i / j;
    }
}

public class Ch_14_9_Throw {
    public static void main(String[] args) {

        // Ex1
        System.out.println("enter age: ");
        Scanner sc = new Scanner(System.in);
        try {
            if (sc.nextInt() < 18)
                throw new Ex1("Minor");
            else
                System.out.println("Adult");
        } catch (Ex1 e) {
            e.printStackTrace();
        }


        // Ex2
        try {
            int i = Ex2.d(2, 0);
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int i = Ex2.d(2, 0);
        System.out.println(i);
    }
}
