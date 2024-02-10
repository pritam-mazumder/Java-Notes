package com.Chapter_14_ERRORS_AND_EXCEPTION;

import java.util.Scanner;

public class Ch_14_3_Specific_Exceptions_Handling {
    public static void main(String[] args) {

        int[] marks = {2, 4, 6, 8, 10};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array index: ");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide with: ");
        int number = sc.nextInt();

        try {
            System.out.println("The value at array index: " + marks[ind]);
            System.out.println("The value at array value/number: " + marks[ind] / number);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
