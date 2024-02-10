package com.Chapter_14_ERRORS_AND_EXCEPTION;

/*
    FINALLY:

    The 'finally' block always executes when the try block exits.
    This ensures that the 'finally' block is executed even if an unexpected exception occurs.
    It contains all the crucial codes such as closing connections, stream, etc
    that is always executed whether an exception occurs within a try block or not.

    Method 1:
    try {...}
    catch (Exception e){...}
    finally {...}

    Method 2:
    try {...}
    finally {...}

    Rules:

    1. Multiple "finally" block is not allowed.
    2. finally block will execute, even if the try block contains any sort of jump statements,
       like: return, break, continue.
    3. In some cases finally block doesn't execute. These are:
        - System.exit(0); ---> JVM will shutdown the program.
        - Causing a fatal "error" that cause the process to abort. e.g., out of memory.
        - If exception occur in finally block itself, and it is not handled.
        - Death of the thread.
 */
public class Ch_14_5_Finally_Block {
    public static void main(String[] args) {
        try {
            int i = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("end");
        }

        try {
            int i = 1 / 0;
        } finally {
            System.out.println("end");
        }
    }
}
