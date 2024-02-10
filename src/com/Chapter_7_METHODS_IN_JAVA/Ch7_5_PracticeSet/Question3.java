package com.Chapter_7_METHODS_IN_JAVA.Ch7_5_PracticeSet;

import java.util.Scanner;

public class Question3 {

    //Que 3: Write a recursive function to calculate sum of first n natural numbers
    static int sumRec(int a) {
        if (a==1)
            return 1;
        else
            return a + sumRec(a-1);
    }
    public static void main(String[] args) {
        System.out.print("Enter the value: ");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        System.out.println(sumRec(i));
    }
}
