package com.Chapter_4_CONDITIONALS_IN_JAVA;

public class Ch4_1_Conditions_Statements {
    public static void main(String[] args) {
        int age = 18;
        boolean licence = true;


        System.out.println("\t1. IF STATEMENT\n");

//        if (age<=18){
//            System.out.println("You can drive\n");
//        }


        System.out.println("\t2. IF ELSE STATEMENT\n");

//        if (age<=18){
//            System.out.println("You are not eligible to drive\n");
//        }else {
//            System.out.println("You eligible to drive drive\n\n");
//        }


        System.out.println("\t3. ELSE-IF CLAUSE STATEMENT\n");

        if (age < 18) {
            if (licence) {
                System.out.println("You are old enough and have the licence. You are eligible to drive");
            } else {
                System.out.println("You are old enough but you don't have the licence. You are not eligible to drive");
            }
        } else if (age == 18) {
            if (licence) {
                System.out.println("You are amateur but you have the licence. Drive safely");
            } else {
                System.out.println("Go get a licence first");
            }
        } else {
            System.out.println("Bhagg BSDK!");
        }
    }
}

