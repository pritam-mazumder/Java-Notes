package com.Chapter_1;

import java.util.Scanner;       //Importing the Scanner class

public class Ch1_5_TakingInput {
    public static void main(String[] args) {

        System.out.println("Taking inputs from user \n");
        Scanner obj = new Scanner(System.in);
        // obj is just a name you can take any name you want


//      Using Int
        System.out.println("Enter number 1");
        int a = obj.nextInt();
        // .nextInt will take the integer
        System.out.println("Enter number 2");
        int b = obj.nextInt();
        int sum = a + b;
        System.out.print("The sum of both number is: ");
        System.out.println(sum);


//      Using Float
        System.out.println("Enter number 1");
        float a1 = obj.nextFloat();
        System.out.println("Enter number 2");
        float b1 = obj.nextFloat();
        float sum2 = a1 + b1;
        System.out.println("The sum of both float numbers is: ");
        System.out.println(sum2);


//      Using Double (Same goes for float)
        System.out.println("Enter number 1");
        double c = obj.nextDouble();
        System.out.println("Enter number 2");
        double d = obj.nextDouble();
        double sum3 = c + d;
        System.out.print("The sum of both double is: ");
        System.out.println(sum3);


//      To check whether the input is number or not
        boolean g = obj.hasNextInt();
        System.out.println(g);


//        String Input for a Single character
        String str = obj.next();  //To read a single character
        System.out.println(str);

//        String Input for Entire line
        String f = obj.nextLine();  //To read a entire line
        System.out.println(f);
    }
}