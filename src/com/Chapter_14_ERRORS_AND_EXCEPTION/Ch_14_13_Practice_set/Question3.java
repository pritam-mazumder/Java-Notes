package com.Chapter_14_ERRORS_AND_EXCEPTION.Ch_14_13_Practice_set;

import java.util.Scanner;

/*
    Que: Write a java program that allows you to keep accessing an array until a valid index is given.
         If max retries exceed 5 print "Error".
 */
public class Question3 {
    public static void main(String[] args) {

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
