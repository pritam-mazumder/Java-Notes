package com.Chapter_5_LOOP_CONTROL_INSTRUCTION;

import java.util.Scanner;

public class Ch5_3_PracticeSet {
    public static void main(String[] args) {


        System.out.println("\t\tQuestion 1\n");
        System.out.println("Write a java program to print the following pattern");
        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         */

        int rows = 4;
        for (int a = rows; a > 0; a--) {
            for (int b = 0; b < a; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("\t\tQuestion 2\n");
        System.out.println("Write a java program to sum first n even numbers using while loop");

        int sum = 0;
        int b = 4;
        int x = 0;
        while (x <= b){
            sum = sum+x;
            x++;
        }
        System.out.println(sum);


        System.out.println("\t\tQuestion 3\n");
        System.out.println("Write a java program to print multiplication table of a given number f");

        int f = 5;
        for (int g = 1; g <= 10; g++) {
            System.out.printf("%d * %d = %d \n", g, f, g * f);
            System.out.println(g * f);
        }


        System.out.println("\t\tQuestion 4\n");
        System.out.println("Write a java program to print multiplication table of 10 in reverse order");

        int h = 10;
        for (int i = 10; i >= 1; i--) {
            System.out.printf("%d x %d = %d \n", i, h, i * h);
            System.out.println(i * h);
        }


        System.out.println("\t\tQuestion 5\n");
        System.out.println("Write a java program to find out factorial of a given number using for loops");

        int j = 5;
        int fact = 1;
        for (int k = 1; k <= j; k++) {
            fact = fact * k;
        }
        System.out.println(fact);


        System.out.println("\t\tQuestion 6\n");
        System.out.println("Write a java program to find out factorial of a given number using while loops");

        int l = 5;
        int fact2 = 1;
        int m = 1;
        while (m <= l) {
            System.out.println(fact2 = fact2 * m);
            m++;
        }


        System.out.println("\t\tQuestion 7\n");
        System.out.println("repeat Q1 using for/while loop");

        int n = 1;
        while (n <= 5) {
            for (int o = 5; o >= n; o--) {
                System.out.print("* ");
            }
            System.out.println(" ");
            n++;
        }


        System.out.println("\t\tQuestion 9\n");
        System.out.println("Write a java program to calculate the sum of the number occurring the multiplication table of 8");

        int sum2 = 0;
        for (int i = 0; i <= 10; i++) {
            sum2 = 2 + (8 * i);
        }
        System.out.println(sum2);


        System.out.println("\t\tQuestion 2\n");

        int r = 4;
        int sumx = 0;
        int s = 0;
        while (s < r) {
            sumx = sumx + (2 * s);
            s++;
        }
        System.out.println(sumx);
    }
}
