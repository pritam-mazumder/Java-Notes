package com.Chapter_7_METHODS_IN_JAVA.Ch7_5_PracticeSet;

import java.util.Scanner;

public class Question8 {

    /*
    Que 8: Write program using function to print the following pattern using recursion:
    * * * *
    * * *
    * *
    *
     */
    static void star_rec(int n){
        if (n>0){
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
            star_rec(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        star_rec(i);
    }

}
