/*
    METHOD OVERLOADING:
    Two or more methods can have the SAME NAME BUT DIFFERENT PARAMETERS.
    Such methods are called Overloaded methods
 */

package com.Chapter_7_METHODS_IN_JAVA.Ch7_2_Method_Overloading;

public class Ch7_2_3_Method_Overloading_3_MAIN {

    static void rex() {
        System.out.println("Mk 1 armor");
    }

    static void rex(int a) {
        System.out.println("Mk " + a + " armor");
    }

    static void rex(int a, int b)
//                 (THESE ARE PARAMETERS)
    {
        System.out.println("Mk " + a + " armor");
        System.out.println("Mk " + b + " armor");
    }

    public static void main(String[] args) {
        rex();
        rex(2);
        rex(3, 4);
//         (THESE ARE ARGUMENTS)


//        Parameters does not actually have any values
//        Arguments does have and actual value
//        Arguments are actual

        /*
        Method overloading cannot be changed by changing the return type
        e.g.: static void rex -> static int rex ==> this is invalid
        you have to change the parameters
         */
    }
}
