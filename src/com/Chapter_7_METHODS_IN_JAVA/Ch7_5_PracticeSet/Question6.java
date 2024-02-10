package com.Chapter_7_METHODS_IN_JAVA.Ch7_5_PracticeSet;

public class Question6 {

    //Que 6: Write a program to find a set of numbers passed as arguments.

    static int avg(int ...arr){
        int sum = 0;
        for (int i = 0; i <= arr.length; i++) {
            sum = sum + i;
        }
        return sum/ arr.length;
    }
    public static void main(String[] args) {
        System.out.println(avg(1,2,3));
    }
}
