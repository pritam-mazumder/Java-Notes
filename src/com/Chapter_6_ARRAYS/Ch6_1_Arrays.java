package com.Chapter_6_ARRAYS;

public class Ch6_1_Arrays {
    public static void main(String[] args) {

//        Array is a collection of similar types of dada
        System.out.println("There are 3 ways to create an Array:\n\n");

        //  1
        int[] arr1;                    // Declaration
        arr1 = new int[2];             // Memory Allocation
        arr1[0] = 1;
        arr1[1] = 2;

        //  2
        int[] arr2 = new int[2];       // Declaration + Memory Allocation
        arr2[0] = 1;
        arr2[1] = 2;

        //  3
        int[] array3 = {1, 2, 3};       // Declaration + (Memory Allocation) + Initialization


        int[] mksuit;                   // Declaration
        mksuit = new int[5];            // Memory Allocation
        mksuit[0] = 1;
        mksuit[1] = 2;
        mksuit[2] = 3;
        mksuit[3] = 4;
        mksuit[4] = 5;
        System.out.println("mksuit " + mksuit[4] + "\n");


        int[] warMachine = new int[5];  //---> Declaration + Memory Allocation
        warMachine[0] = 1;
        warMachine[1] = 2;
        warMachine[2] = 3;
        warMachine[3] = 4;
        warMachine[4] = 5;
        System.out.println("War Machine " + warMachine[3] + "\n");


        int[] hulkBuster = {1, 2, 3};   //---> Declaration + Initialize
        System.out.println("Hulk Buster " + hulkBuster[2] + "\n");


//        mksuit.length will return the length of the array
        System.out.println("The length of \"mksuit array\" is: " + mksuit.length + "\n");


        float[] scores = {34, 35.5f, 86.5f, 57.4f, 98.9f};
        System.out.println("The length of \"scores array\" is: " + scores.length);
        System.out.println(scores[0]);
        System.out.println(scores[1] + "\n");


        String[] avengers = {"Iron Man", "Captain America", "Thor", "Hulk", "Hawk eye"};
        System.out.println(avengers.length + "\n");

        for (int i = 0; i < avengers.length; i++) {
            System.out.println(avengers[i]);
        }
        System.out.println(avengers[0]);

    }
}
