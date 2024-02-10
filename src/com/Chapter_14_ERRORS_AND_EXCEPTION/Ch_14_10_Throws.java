package com.Chapter_14_ERRORS_AND_EXCEPTION;

/*
    THROWS:             Only used for "CHECKED EXCEPTION" or "COMPILE TIME EXCEPTION"

    It is used in the signature of method to indicate that this method might throw one of the listed type exceptions.
    The caller to these methods has to handle the exception using a try-catch block.

    If we call a method that declares an exception,
    we must either catch the exception using the try-catch block or
    declare the exception using throws keyword.

    To prevent this compile time error we can handle the exception in two ways:
    1. try-catch
    2. throws keyword

    Throws keyword used to declare the checked exception only.
    If there occurs any unchecked exception such as NullPointerException,
    it is programmers fault that he is not performing check up before the code being used.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

// example 1
class ce extends Exception {
    public String toString() {
        return "-ve value";
    }
}

class Example1 {
    public static int ar(int i) throws ce {
        if (i < 0) {
            throw new ce();
        }
        return i * i;
    }
}


// example 2
class Example2 {
    void readFile() throws FileNotFoundException {
        FileInputStream f = new FileInputStream("C:/abc.txt");
    }

    void saveFile() throws FileNotFoundException {
        FileOutputStream f = new FileOutputStream("D:/abc.txt");
    }
}

public class Ch_14_10_Throws {
    public static void main(String[] args) {

        // example 1
        try {
            System.out.println(Example1.ar(-1));
        } catch (Exception e) {
            e.printStackTrace();
        }


        // example 2
        Example2 re = new Example2();
        try {
            re.readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            re.saveFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
