package com.Chapter_7_METHODS_IN_JAVA.Ch7_2_Method_Overloading;

public class Ch7_2_2_Method_Overloading_2 {
    // For case 1:
    static void change(int a) {
        a = 11;
    }

    // For case 2:
    static void chang2(int[] arr) {
        arr[0] = 55;
    }

    public static void main(String[] args) {

        // Case 1: Changing the integer
        int x = 45;
        change(x);
        System.out.printf("The value of x after running the change is: %d\n\n", x);
        // In this case, the value will not be changed.
        // Because, "change" will only send the copy


        // Case 2: Changing the array
        int[] marks = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("The values of array before running the change");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + "   ");
        }
        System.out.println("\n");

        chang2(marks);
        System.out.println("The value of array after running the change");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + "   ");
        }
        System.out.println("\n");
        // when "int[] marks" array is written,
        // an "array object" is created
        // "marks" is reference (its like marks are storing an address)
        // when "change2" is written, the address is passed
        // and the value is change


        // when we pass the array or an object, the reference is passed and the object will change

        /*
        NOTE:
        In the case of Arrays, the reference is passed.
        */
    }
}



