package com.Chapter_7_METHODS_IN_JAVA.Ch7_5_PracticeSet;

import java.util.Scanner;

public class Question2 {

    /*
    Que 2: Write program using function to print the following pattern:
    *
    * *
    * * *
    * * * *
     */
    static void star(int a){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i+1; j++) {
//        for (int i = 0; i <= a; i++) {
//            for (int j = 0; j < i; j++) {
                System.out.printf("* ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        star(i);
    }
}
