package com.Chapter_7_METHODS_IN_JAVA.Ch7_5_PracticeSet;

import java.util.Scanner;

public class Question1 {

    //Que 1: Write a java method to print multiplication table of a number n

    static void mtable(int i){
        for (int j = 1; j <=10; j++) {
            System.out.printf("%d x %d \n", i, j, i*j);
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the value: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        mtable(i);
    }
}
