//Exercise:
//Write a program to calculate the percentage of a given student in CBSE board exam.
//His marks from 5 subjects must be taken as input from the keyword. (Marks are out of 100)


package com.Chapter_1;
import java.util.Scanner;

class Ch1_6_Exercise {
    public static void main(String[] arg){
        Scanner mk = new Scanner(System.in);

        System.out.print("Enter physics Marks: ");
        int physics = mk.nextInt();

        System.out.print("Enter chemistry Marks: ");
        int chemistry = mk.nextInt();

        System.out.print("Enter maths Marks: ");
        int maths = mk.nextInt();

        System.out.print("Enter biology Marks: ");
        int biology = mk.nextInt();

        System.out.print("Enter english Marks: ");
        int english = mk.nextInt();

        int total = (physics+chemistry+maths+biology+english);
        int per = (total*100)/500;
        System.out.println("Percentage obtained: "+ per + "%");
    }
}
