package com.Chapter_14_ERRORS_AND_EXCEPTION;

/*
                OBJECT          (Parent class of all class in java)
                   |
         v-----THROWABLE-----v  (Parent class of exception class)
     Exception             Error


    EXCEPTION:
     - Occurs during the execution of the program and interrupts the normal flow of program instructions.
     - It occurs at compile time and run time.
     - It occurs in the code written by the developers.
     - It can be recovered by using the try-catch block and throws keyword.
     - There are two types of exceptions i.e. checked and unchecked.
    ERRORS:
     - Errors are problems that mainly occur due to the lack of system resources.
     - It cannot be caught or handled.
     - It indicates a serious problem.
     - It occurs at run time.
     - These are always unchecked.



    ERRORS:

     - illegal operation performed by the user which results in the abnormal working of the program.
     - errors often remain undetected until the program is compiled or executed.
     - some errors inhibit the program from getting compiled or executed.
     - Thus, errors should be removed before compiling and executing.

    Types of errors:

    1. Syntax error:
        When compiler finds something wrong with our program,
        it throws a syntax error.

    2. Logical errors:
        A logical error or a bug occurs when a program compiles and runs
        but does the wrong thing.
        - message delivered wrongly
        - wrong time chats being displayed
        - incorrect redirects

    3. Runtime errors:
        Java may sometimes encounter an error while the program is running.
        These are also called exceptions.
        These are encountered due to
        circumstances like bad input and/or response constraints.

    Syntax and Logical errors are encountered by the programmer
    whereas Runtime errors are encountered by the users.


    EXCEPTION:

     - unexpected event/problem that arises during the execution of a program.
     - normal flow of the program is disrupted and the program/Application terminates abnormally (not recommended)
     - therefore, these exceptions are to be handled.

    Exceptions can be categorized in two ways:

    1. Built-in Exceptions

        - Checked Exception --> (Compile-time exceptions) (Exception which are handled/checked by compiler)
            [C for Checked; C for Compile]
            Also known as compile-time exceptions
            as these exceptions are checked by the compiler during the compilation process
            to confirm whether the exception is handled by the programmer or not.
            If not, then the system displays a compilation error and occur the error at the runtime.

            COMPILE TIME PER KABHI KOI EXCEPTION NAHI AATI
            ONLY RUNTIME PER EXCEPTION OCCUR HOTI HAI

            e.g.,
            - IOException:              input/output operation failure
            - SQLException:             database operation failure
            - ClassNotFoundException:   class cannot be found
            - InstantiationException:   object cannot be instantiated
            - NoSuchMethodException:    method cannot be found

        - Unchecked Exception --> (Runtime exceptions)  (Exception which are not able to checked/ignore by compiler)
            Exceptions that occur during the execution of the program.
            Hence, they are also referred to as Runtime exceptions.
            These exceptions are generally ignored during the compilation process.
            They are not checked while compiling the program.
            e.g.,
            - RuntimeException:                 superclass of all unchecked exceptions
            - NullPointerException:             when a null value is used where an object is required
            - ArithmeticException:              arithmetic operation failure
            - ArrayIndexOutOfBoundsException:   array index is out of bounds
            - IllegalArgumentException:         illegal argument is used
            - IllegalStateException:            illegal state is detected
            - ConcurrentModificationException:  collection is modified while it is being iterated over

    2. User-Defined Exceptions
 */

import java.util.Scanner;

public class Ch_14_1_Errors_and_Exception {
    public static void main(String[] args) {

        // Syntax Error:
//        int a = 0 Error: no semicolon
//        b = 1;    Error: variable type no declared

        // Logical Error:
        // Write a program to print first 10 prime nos.
//        System.out.println(2);
//        for (int i = 1; i < 10; i++) {
//            System.out.println(2*i+1);
//        }

        // Runtime Error:
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        System.out.println(1000/i);   Error will be shown on invalid input
    }
}
