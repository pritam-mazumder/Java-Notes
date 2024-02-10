package com.Chapter_3_STRING;

import java.util.Scanner;
// Strings are immutable and cannot be changed

public class Ch3_1_Strings {
    public static void main(String[] args) {
//      String name = new String("Fr1sk");                                                                     
//        OR (Both are same)
        String name = "Fr1sk";
        System.out.print("The name is: ");  // Printing using "print"
        System.out.println(name + "\n");    // Printing using "println"

        int a = 2;
        float b = 4f;
        char c = 'c';
        System.out.printf("Integer a: %d \nFloat b: %f \nCharacter c: %c \nString: %s \n", a, b, c, name);
        // Printing using "printf"
        System.out.format("Integer a: %d \nFloat b: %f \nCharacter c: %c \nString: %s \n", a, b, c, name);
        // Printing using "format"

//        System.out.printf(); <-- AND --> System.out.format();
//        BOTH ARE SAME

        Scanner sc1 = new Scanner(System.in);
        String str1 = sc1.next();               // returns only the first word of the string

        Scanner sc2 = new Scanner(System.in);   // returns the entire string
        String str2 = sc2.nextLine();

        System.out.println(str1);               // first word only
        System.out.println(str2);               // entire string
    }
}
