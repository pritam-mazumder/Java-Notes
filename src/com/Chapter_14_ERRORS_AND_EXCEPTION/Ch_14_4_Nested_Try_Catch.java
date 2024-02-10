package com.Chapter_14_ERRORS_AND_EXCEPTION;

import java.util.Scanner;

public class Ch_14_4_Nested_Try_Catch {
    public static void main(String[] args) {

        int[] marks = {2, 4, 6, 8, 10};
        boolean i = true;

        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        while (i) {
            try {
                try {
                    System.out.println("Enter the index of array marks: ");
                    System.out.println(marks[index]);
                } catch (ArrayIndexOutOfBoundsException a) {
                    a.printStackTrace();
                    i = false;
                }
                System.out.println();
                System.out.println(marks[sc.nextByte()] / sc.nextByte());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("end");
    }
}
