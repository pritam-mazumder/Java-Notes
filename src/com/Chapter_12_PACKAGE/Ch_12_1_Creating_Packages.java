
/*
    PACKAGE:

    A java package is a group of similar types of classes, interfaces and sub-packages.
    Package in java can be categorized in two form, built-in package and user-defined package.
*/
//  There are 3 ways to import java packages

//  import java.util.Scanner;     --> Method 1: Importing the actual package
//  import java.util.*;           --> Method 2: Importing everything form the util package


// Creating user defined PACKAGE

//package com.Chapter_12_PACKAGE.asdx;


package comChapter_12_PACKAGE.asdx;

public class Ch_12_1_Creating_Packages {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in); //--> Method 3: Importing like this
    }
}
