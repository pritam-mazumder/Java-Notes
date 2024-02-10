package com.Chapter_2;

public class  Ch2_2_Operator_precedence_and_associativity {
    public static void main(String[] args) {

        int p = 6 * 5 - 34 / 2;
        System.out.println(p);
        /*
            = 6*5-34/2
            = 30-17
            = 13
        */
        int q = 60 / 5 - 34 * 2;
        System.out.println(q);
        /*
            = (60/5)-(34*2)
            = 12-68
            = -56
        */
        //Highest precedence goes to "*" and "/". They are then evaluated on the basis of left to right associativity

        int x = 6;
        int y = 1;
        int z = x * y / 2;
        System.out.println(z);

        int a = 5;
        int b = 1;
        int c = 4;
        int k = (b * b) - (4 * a * c) / (2 * a);
        System.out.println(k);

        int v = 2;
        int u = 4;
        int w = (v * v) - (u * u);
        System.out.println(w);

        int d = 4;
        int g = (a * b) - d;
        System.out.println(g);
    }
}
