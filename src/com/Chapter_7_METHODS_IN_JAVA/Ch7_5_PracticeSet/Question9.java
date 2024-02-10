package com.Chapter_7_METHODS_IN_JAVA.Ch7_5_PracticeSet;

import java.util.Scanner;

public class Question9 {

    //Que 9: Write a function to convert Celsius temperature into fahrenheit

    static float t(float i) {
        float f = ((i * 9) / 5) + 32;
        return f;
    }
    public static void main(String[] args) {
        System.out.print("Enter temperature in celsius: ");
        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        System.out.println(t(f));
    }
}
