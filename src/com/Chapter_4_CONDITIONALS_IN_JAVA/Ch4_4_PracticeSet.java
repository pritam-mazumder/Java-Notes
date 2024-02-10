package com.Chapter_4_CONDITIONALS_IN_JAVA;

import java.util.Scanner;

public class Ch4_4_PracticeSet {
    public static void main(String[] args) {


        System.out.println("Question 1\n");
        System.out.println("What will be the output of this program: ");
        /*
        int a = 10;
        if (a = 11)
            System.out.println("I am 11");
        else
            System.out.println("I am not 11");
        */

//        int a = 11;
//        if (a=11){
//
//        }


        System.out.println("Question 2\n");
        System.out.println("Write a java program to find out whether a student is pass or fail; if it requires total 40% and at least 33% in each subjects and take marks as an input from the user");

//        byte m1, m2, m3;
//        Scanner mk = new Scanner(System.in);
//        System.out.println("Enter your marks in Physics");
//        m1 = mk.nextByte();
//
//        System.out.println("Enter your marks in Chemistry");
//        m2 = mk.nextByte();
//
//        System.out.println("Enter your marks in Maths");
//        m3 = mk.nextByte();
//
//        float average = (m1 + m2 + m3) / 3.0f;
//        System.out.printf("Your average marks is: %f\n", average);
//
//        if (average >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
//            System.out.println("PASS");
//        } else {
//            System.out.println("FAIL");
//        }


        System.out.println("Question 3\n");
        System.out.println("Write a java program to calculate the tax paid by the employee to the government as per the slabs mentioned below:");
        /*
        Income slab     Tax
        2.5L - 5.0L     5%
        5.0L - 10.0L    20%
        above 10.0L     30%

        Note: There is no tax below 2.5L. Take input amount as an input from the user.
        */

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your income in lakhs per anum");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if (income <= 2.5) {
//            tax = tax + 0;
//        } else if (income > 2.5f && income <= 5.0f) {
//            tax = tax + 0.05f * (income - 2.5f);
//        } else if (income > 5f && income <= 10.0f) {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//        } else if (income > 10.0f) {
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }
//        System.out.println("The total tax paid by the employee is: " + tax);


        System.out.println("Question 4\n");
        System.out.println("Write a java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday... and so on]");

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter and date between 1 and 7:");
//        int day = sc.nextInt();
//
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("you must have entered a wrong number.");
//        }


//        OR


//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter and date between 1 and 7:");
//        int day = sc.nextInt();
//
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("you must have entered a wrong number.");


            System.out.println("Question 5\n");
            System.out.println("Write a java program to find whether a year entered by the user a leap year or not");

//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter the year: ");
//            int year = sc.nextInt();
//
//            if ((year % 4 == 0) || (year % 4 == 0 && year % 100 != 0)) {
//                System.out.println(year + " is a leap year");
//            } else {
//                System.out.println(year + " is not a leap year.");
//            }
//
//
//            System.out.println("Question 6\n");
//            System.out.println("Write a java program to find out the type of website from the url");
        /*
        .com -> Commercial website
        .org -> Organisation website
        .in -> Indian website
        */

//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter the website: ");
//            String web = sc.next();
//
//            if (web.endsWith(".in")) {
//                System.out.println("It is an Indian website");
//            } else if (web.endsWith(".com")) {
//                System.out.println("It is a Commercial website");
//            } else if (web.endsWith(".org")) {
//                System.out.println("It is an Organisational website");
//            } else {
//                System.out.println("Invalid domain");
//            }
        }
    }













