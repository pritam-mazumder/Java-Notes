package com.Chapter_6_ARRAYS;


public class Ch6_2_Array_Displaying {
    public static void main(String[] args) {

        int[] i = {0, 1, 2, 3, 4, 5, 6};
        System.out.println(i.length + "\n");

        System.out.println("\t\t\tDisplaying Array\n\n");

        System.out.println("Displaying array using Naive method:\n");
        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);
        System.out.println(i[3]);
        System.out.println(i[4]);


        System.out.println("\n\n\t\tDisplaying array using \"FOR LOOP\" method\n");

        System.out.println("\t1. In Increment order");
        for (int a = 0; a < i.length; a++) {
            System.out.println(i[a]);     // this is also known as "ARRAY TRAVERSAL"
        }
        System.out.println("\n\n");

        System.out.println("\t2. In Decrement order (reverse)");
        for (int b = i.length - 1; b >= 0; b--) {
            System.out.println(i[b]);
        }


        System.out.println("\n\n\t\tDisplaying array using \"FOR EACH LOOP\" method\n");

        for (int x : i) {
            System.out.println(x + " is an array element");
        }

    }
}
