package com.Chapter_14_ERRORS_AND_EXCEPTION;

/*
    TRY CATCH BLOCK:

    It is exception handling technique that allows you to catch and handle exceptions that may occur during the execution of the program.

    The "try" statement allows you to define a block of code to be tested for errors while it is being executed.
    The "catch" statement allows you to define a block of code to be executed, if an error occurs in the try block.
    The "try" and "catch" keywords come in pairs

 */

public class Ch_14_2_Try_Catch_Block {
    public static void main(String[] args) {

        int a = 1;

        // Without TRY
//        int c = a/0;
//        System.out.println(c);        --> In this case, the compiler will show the error and exit. It wouldn't read any lines below this point.

        // With TRY
        try {                       //  --> try: it will at-least try to execute these lines
            int c = a / 0;
            System.out.println(c);
        } catch (
                Exception e) {       //   --> catch: if try fails, then the program flow will pass to catch and from their, the program continue.
            System.out.print("Invalid values. Error: ");
            System.out.println(e);  //   --> e: it will return the type of exception
        }

        System.out.println("End");


/*
        Exception message has 3 components:
        1. Exception name
        2. Description
        3. Stake trace
 */
        try {
            int i = 10 / 0;
        } catch (Exception e) {

            // Ways to display exception message:

            // method 1:
            System.out.println(e);

            // method 2:
            System.out.println(e.getMessage());

            // method 3:
            e.printStackTrace();    // best approach
        }
    }
}
