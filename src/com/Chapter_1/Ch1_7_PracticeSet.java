package com.Chapter_1;

import java.util.Scanner;

public class Ch1_7_PracticeSet {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);


        System.out.println("Question 1");
        System.out.println("Write a program to sum three numbers in Java");

//        Without taking input from the user
//        int a = 1;
//        int b = 2;
//        int c = 3;
//        int sum = a+b+c;
//        System.out.println("The sum of a, b and c is = " +sum);

//        Taking input from the user
//        System.out.println("Enter the first number");
//        int a = value.nextInt();
//
//        System.out.println("Enter the second number");
//        int b = value.nextInt();
//
//        System.out.println("Enter the third number");
//        int c = value.nextInt();
//
//        System.out.println("Sum total = " + (a+b+c));


        System.out.println("Question 2");
        System.out.println("Write a program to calculate CGPA using marks of three subjects (out of 100)");

//        float p = 80;
//        float c = 79;
//        float b = 96;
//        float cgpa = (p+c+b)/30;
//        System.out.println(cgpa);


        System.out.println("Question 3");
        System.out.println("Write a program which ask the user to enter his/her name and greets them with \"Hello <name>, have a good day\" text");

//        System.out.println("Enter your name");
//        String name = value.next();
//        System.out.println("Hello " + name + "! Have a good day");


        System.out.println("Question 4");
        System.out.println("Write a java program to convert kilometers to miles");

//        System.out.println("Enter kilometer: ");
//        double km = value.nextDouble();
//        System.out.println(km + " kilometer = " + (km*0.621371) + " miles");


        System.out.println("Question 5");
        System.out.println("Write a java program to detect whether a number entered by the user is integer or not");

        System.out.println("Enter the number");
        System.out.println(value.hasNextInt());
    }
}