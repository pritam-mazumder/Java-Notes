package com.Chapter_14_ERRORS_AND_EXCEPTION;

/*
    THROW:
        1. Programmer is responsible for creating the exception object.
           Main method is not responsible for creating the exception object.
        2. Try-catch is preferred for successful compilation and execution.
        3. used for "RUN-TIME / UN-CHECKED" exception.
        4. Only single exception can be used/throw.
        5. Used "inside" the method.
        6. Followed by the "new" instance i.e., object.
        7. Writing any statement after throw will lead to COMPILE-TIME exception / UNREACHABLE statement.


    THROWS:
        1. It just declares/indicates the exception.
           It only indicates the caller method the exception may occur,
           so, if you use that method you should probably handle(try-catch) it.
        2. Try-catch is preferred for successful compilation and execution.
        3. used for "COMPILE-TIME / CHECKED" exception.
        4. Multiple exception can be used/throw using ",".
        5. Used "with" the method.
        6. Followed by the "class".
        7. No such thing exists here.

    ============= OR =============

    THROW:
        1. Used to throw an exception for a method.
        2. Cannot throw multiple exceptions.
        3. Syntax:
            'throw' is followed by an object (new type)
            used inside the method

    THROWS:
        1. Used to indicate what exception type may be thrown by a method
        2. Can declare multiple exceptions.
        3. Syntax:
            'throws' is followed by a class
            and used with the method signature
 */


public class Ch_14_11_Throw_vs_Throw_main {
}
