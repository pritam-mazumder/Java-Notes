package com.Chapter_4_CONDITIONALS_IN_JAVA;

import java.util.Scanner;

public class Ch4_2_Switch_Case_Statements {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch (age) {
            case 10:
                System.out.println("You are a kid");
                break;
            case 13:
                System.out.println("You are a teenager");
                break;
            case 18:
                System.out.println("You are about to be an adult");
                break;
            case 35:
                System.out.println("You are an absolute adult");
                break;
            case 50:
                System.out.println("You are about to die");
            default:
                System.out.println("Just die already");
        }
        System.out.println("Thank you and get lost");
    }
}
