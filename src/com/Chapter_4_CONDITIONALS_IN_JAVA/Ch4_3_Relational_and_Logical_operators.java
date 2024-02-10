package com.Chapter_4_CONDITIONALS_IN_JAVA;

public class Ch4_3_Relational_and_Logical_operators {
    public static void main(String[] args) {


        System.out.println("RELATIONAL OPERATORS\n");

        System.out.println("==  is Equals or Equality check");
        System.out.println("=   is Assigned");
        System.out.println(">=  is Greater than or equals to");
        System.out.println("<=  is Less than or equals to");
        System.out.println(">  is Greater than");
        System.out.println("<  is Less than");
        System.out.println("!= is Not equals to\n\n\n\n");


        System.out.println("LOGICAL OPERATORS\n");

        System.out.println("&& is AND Operator");
        System.out.println("|| is OR Operator");
        System.out.println("! is NOT Operator\n\n\n");


        boolean a = true;
        boolean b = true;
        boolean c = true;

        System.out.println("\t1. Logical AND");
        if (a && b && c) {
            System.out.println("True\n\n");
        } else {
            System.out.println("False\n\n");
        }

//        OR

        if (a == true && b == true && c == true) {
            System.out.println("True\n\n");
        } else {
            System.out.println("False\n\n");
        }


        System.out.println("\t2. Logical OR");

        if (a || b || c) {
            System.out.println("True\n");
        } else {
            System.out.println("False\n");
        }


        System.out.println("\t3. Logical NOT");

        System.out.println("NOT(a) is: " + a);
        System.out.println("NOT(b) is: " + b);
        System.out.println("NOT(c) is: " + c);
    }
}
