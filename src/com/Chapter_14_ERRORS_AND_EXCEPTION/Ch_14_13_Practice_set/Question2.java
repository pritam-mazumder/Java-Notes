package com.Chapter_14_ERRORS_AND_EXCEPTION.Ch_14_13_Practice_set;

/*
    Que: Write a java program that prints "haha" during arithmetic exception
         and "hehe" during Illegal argument exception.
 */

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        try {
            if (i==0){
                throw new ArithmeticException();
            } else {
                throw new IllegalArgumentException();
            }
        } catch (ArithmeticException e){
            System.out.println("haha");
        } catch (IllegalArgumentException e){
            System.out.println("hehe");
        }
    }
}
