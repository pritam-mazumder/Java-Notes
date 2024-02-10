/*
Recursion:
A function that call itself.
Such calling of function by itself is called recursion.
 */

package com.Chapter_7_METHODS_IN_JAVA;

import java.util.Scanner;

public class Ch7_4_Recursion {



    //factorial(n) = n * n-1 * ...1
    //factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
    //factorial(n) = n * factorial(n-1)
    //               where n >= 1


    //WITH RECURSIVE APPROACH:
    static int factorial_recursion(int i){
        if (i==0 || i==1)
            return 1;
        else
            return i *= factorial_recursion(i-1);
    }


    //WITH ITERATIVE APPROACH:
    static int factorial_iteration(int i){
        if (i==0 || i==1)
            return 1;
        else {
            int product = 1;
            for (int j = 1; j <= i; j++) {
                product *= j;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the value: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("The value of factorial a is: " + factorial_recursion(a));

        System.out.println("The value of factorial a is: " + factorial_iteration(a));
    }
}
