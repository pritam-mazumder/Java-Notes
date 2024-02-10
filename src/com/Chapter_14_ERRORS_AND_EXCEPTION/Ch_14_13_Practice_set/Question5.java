package com.Chapter_14_ERRORS_AND_EXCEPTION.Ch_14_13_Practice_set;

/*
    Que: Wrap the program in Q3 inside a method which throws you exception.
 */

import java.util.Scanner;

class q3{
    q3() throws Exception {
        int [] marks = {1,2,3};
        int i=0;

        while (true){
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("enter index:");
                int index = sc.nextInt();
                System.out.println(marks[index]);
                break;
            } catch (Exception e){
                e.printStackTrace();
            }
            i++;
            if (i>5){
                System.out.println("error");
                break;
            }
        }
    }
}

public class Question5 {
    public static void main(String[] args) {

        try {
            q3 q = new q3();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
