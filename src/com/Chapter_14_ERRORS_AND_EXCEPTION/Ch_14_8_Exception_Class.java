package com.Chapter_14_ERRORS_AND_EXCEPTION;

/*
    Exception Class:

    We can write our custom exception using exception class in java.
    OR
    In Java, exceptions allows us to write good quality codes
    where the errors are checked at the compile time instead of runtime,
    and we can create custom exceptions to make the code recovery and debugging easier.

    THROWS:

    The Java throw keyword is used to throw an exception explicitly.
    The throw keyword is mainly used to throw custom exceptions.
 */

import java.util.Scanner;

class MyEx extends Exception {
    @Override
    public String toString() {      // -->  executes when sout(e) is run
        return "toString";
//        return super.toString();
    }
    @Override
    public String getMessage() {    // -->  prints the exception message
        return "getMessage";
//        return super.getMessage();
    }
}

public class Ch_14_8_Exception_Class {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i <= 0) {
            try {
                throw new MyEx();
            } catch (Exception e) {
                System.out.println("Age cannot be less then 0");
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                System.out.println(e);
                e.printStackTrace();    // -->  It will provide details about the error
                // -->  Prints the exception message
            }
        }    }
}
