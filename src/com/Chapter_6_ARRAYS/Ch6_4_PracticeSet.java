package com.Chapter_6_ARRAYS;

public class Ch6_4_PracticeSet {
    public static void main(String[] args) {


        System.out.println("\t\t\nQuestion 1");
        System.out.println("Create an array of float and calculate their sum");

        float[] marks = {34.5f, 65.4f, 65.3f, 76.4f, 63.9f};
        float sum = 0;
//        for (float elements :
//                marks) {
//            sum = sum + elements;
//        }

        for (int i = 0; i <= marks.length; i++) {
            sum = sum + marks[i];
        }

        System.out.println("Total marks = " + sum);


        System.out.println("\t\t\nQuestion 2");
        System.out.println("Write a java program to find out whether a given integer is present in an array or not");

//        WITH FOR-EACH LOOP
//        int[] marks = {0,1,2,3,4,5,6,7,8,9};
//        int num = 12;
//        boolean isInArray = false;
//        for (int i :
//                marks) {
//            if (i==num){
//                isInArray = true;
//            }
//        }
//        if (isInArray){
//            System.out.println("y");
//        }else {
//            System.out.println("n");
//        }

//        WITH FOR LOOP
        int[] marks2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num = 1;
        boolean isInArray = false;
        for (int i = 0; i < marks2.length; i++) {
            if (i == num) {
                isInArray = true;
            }
        }
        if (isInArray)
            System.out.println("y");
        else
            System.out.println("n");


        System.out.println("\t\t\nQuestion 3");
        System.out.println("Write a java program to calculate the average marks from an array containing marks of all students in physics using for-each loop");

        float[] marks3 = {34.5f, 65.4f, 65.3f, 76.4f, 63.9f};
        float sum2 = 0;
        for (float element : marks3) {
            sum2 = sum2 + element;
        }
        System.out.println("The average marks of all students in physics is: " + sum2 / marks3.length);


        System.out.println("\t\t\nQuestion 4");
        System.out.println("Write a java program to add two matrices of size 2x3");

        int[][] mat1 = {{0, 1, 2},
                {3, 4, 5}};
        int[][] mat2 = {{6, 7, 8},
                {9, 10, 11}};
        int[][] result = {{0, 0, 0},
                {0, 0, 0}};

        // for displaying the addition of matrix
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.printf("i = %d  j = %d \n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        //for displaying the result matrix
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.printf(result[i][j] + " ");
            }
            System.out.println(" ");
        }


        System.out.println("\t\t\nQuestion 5");
        System.out.println("Write a java program to reverse an array");


        // Method 1:
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("\nPrinting the array using the reverse method");

        for (int b = arr.length - 1; b >= 0; b--) {
            System.out.print(arr[b] + " ");
        }
        System.out.println("\n");


        // Method 2:
        System.out.println("Printing the array using swapping method");
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for (int i = 0; i < n; i++) {
            temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = temp;
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }


        System.out.println("\t\t\nQuestion 6");
        System.out.println("Write a java program to find the maximum element in an array");

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Method 1: ");
        int max = 0;
        for (int e :
                arr2) {
            if (e > max) {
                max = e;
            }
        }
        System.out.println(max);

        System.out.print("Method 2: ");
        int max2 = Integer.MIN_VALUE;
        for (int f :
                arr2) {
            if (f > max2) {
                max2 = f;
            }
        }
        System.out.println(max2);


        System.out.println("\t\t\nQuestion 7\n");
        System.out.println("Write a java program to find out the minimum element in an array");

        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int min = Integer.MAX_VALUE;
        for (int g :
                arr3) {
            if (g < min) {
                min = g;
            }
        }
        System.out.println(min);


        System.out.println("\t\t\nQuestion 8\n");
        System.out.println("Write a java program to find whether the an array is sorted or not");

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean isSorted = true;
        for (int h = 0; h < arr1.length - 1; h++) {
            if (arr1[h] > arr1[h + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
