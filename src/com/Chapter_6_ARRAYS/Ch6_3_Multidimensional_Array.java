package com.Chapter_6_ARRAYS;

public class Ch6_3_Multidimensional_Array {
    public static void main(String[] args) {

        int[] marks;                //---> 1D Array

        int[][] room;               //---> 2D Array
        room = new int[2][3];
        room[0][0] = 101;
        room[0][1] = 102;
        room[0][2] = 103;
        room[1][0] = 201;
        room[1][1] = 202;
        room[1][2] = 203;

        System.out.println("Displaying 2D array using For Loop");

        for (int i = 0; i < room.length; i++) {
            for (int j = 0; j < room[i].length; j++) {
                System.out.print(room[i][j]);
                System.out.print("    ");
            }
            System.out.println("    ");
        }
    }
}
