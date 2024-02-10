package com.Chapter_14_ERRORS_AND_EXCEPTION.Ch_14_13_Practice_set;

/*
    Que: Modify the program in Q3 to throw a custom exception if max retries are reached.
*/

import java.util.Scanner;

class MaxRetriesException extends Exception{
    @Override
    public String getMessage() {
        return "Invalid input";
    }

    @Override
    public String toString() {
        return "Error";
    }
}

public class Question4 {
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
            if (i==5){
                try {
                    throw new MaxRetriesException();
                }
                catch (MaxRetriesException e){
                    e.printStackTrace();
                }
                break;
            }
        }
    }
}
