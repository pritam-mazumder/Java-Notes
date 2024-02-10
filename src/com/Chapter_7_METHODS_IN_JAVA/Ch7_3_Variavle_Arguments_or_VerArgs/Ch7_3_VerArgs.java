package com.Chapter_7_METHODS_IN_JAVA.Ch7_3_Variavle_Arguments_or_VerArgs;

public class Ch7_3_VerArgs {


    //    Method 1 (Using method overloading):
    static int sum1(int a, int b) {
        return a + b;
    }

    static int sum1(int a, int b, int c) {
        return a + b + c;
    }


    //    Method 2 (Using "Varargs"):
    /*
    Varargs:
    The varargs allows the method to accept zero or multiple arguments.
    Before varargs either we usr overloading method or take an array as the method parameter,
    but it was not considered good because it leads to the maintenance problem.
    If you don't know how many arguments we will have to pass in the method, varargs is the better approach.
     */
    static int sum3(int... arr) {
        int result = 0;
        for (int a :
                arr) {
            result = result + a;
        }
        return result;
    }


    //    In case if you compulsory want to take at least one input
    static int sum4(int x, int... arr2) {
        int result2 = x;
        for (int i = 0; i < arr2.length; i++) {
            result2 = result2 + i;
        }
        return result2;
    }

    public static void main(String[] args) {
        System.out.println("Frisk");
        System.out.println("The sum of 1 and 2 is: " + sum1(1, 2));
        System.out.println("The sum of 1, 2 and 3 is: " + sum1(1, 2, 3));

        System.out.println("The sum of 1, 2, 3 and 4 is: " + sum3(1, 2, 3, 4));
        System.out.println("The sum of 1, 2, 3, 4 and 5 is: " + sum3(1, 2, 3, 4, 5));
        System.out.println("The sum of nothing is: " + sum3());

        System.out.println("The sum of 1 is: " + sum4(1));
    }
}
