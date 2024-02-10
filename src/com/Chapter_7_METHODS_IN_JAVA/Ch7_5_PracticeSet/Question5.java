package com.Chapter_7_METHODS_IN_JAVA.Ch7_5_PracticeSet;

import java.util.Scanner;

public class Question5 {

    //Que 5: Write a function to print Nth term of fibonacci series using recursion
    //if 'nth' term is specified, start it from 1
    //if 'nth' term is not specified, start it from 0
    //if only "INDEX" term is given, starts with 0
    //fi 'INDEX' is specified with a value, start from that particular value.

    static int fib(int n) {
//        if (n==1 || n==2)
//            return n-1;
        if (n==1)
            return 0;
        else if (n == 2)
            return 1;
        else
            return fib(n-1) + fib(n-2);
    }

    static int f(int i){
        if (i==0||i==1){
            return 1;
        }else return f(i-1)+f(i-2);
    }

    public static void main(String[] args) {
        System.out.print("Enter the fibonacci series element: ");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        System.out.println(fib(i));

    }
}
