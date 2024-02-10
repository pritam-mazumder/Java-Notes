package com.Chapter_5_LOOP_CONTROL_INSTRUCTION;

public class Ch5_1_Loops {
    public static void main(String[] args) {

        System.out.println("\tWhile Loop");
        int a = 0;
        while (a <= 10) {
            System.out.println(a);
            a++;
        }

//        System.out.println("\n\tExercise");
//        int b = 100;
//        while (b <= 200) {
//            System.out.println(b);
//            b++;
//        }

        System.out.println("\n\tDo While Loop");
        int c = 0;
        do {
            System.out.println(c);
            c++;
        } while (c <= 10);

//        System.out.println("\n\tExercise");
//        int d = 1;
//        do {
//            System.out.println(d);
//            d++;
//        } while (d <= 15);

        System.out.println("\n\tFor Loop");
        for (int e = 0; e <= 10; e++) {
            System.out.println(e);
        }

//        System.out.println("\n\tExercise");
//        int g = 10;
//        for (int f = 0; f <= g; f++) {
//            System.out.println(2 * f + 1);
//        }

        System.out.println("\n\tDecrementing For Loop");
        for (int h = 10; h >= 0; h--) {
            System.out.println(h);
        }

//        System.out.println("\n\tExercise");
//        for (int i = 10; i >= 1; i--) {
//            System.out.printf("%d\n", i);
//        }

    }
}
