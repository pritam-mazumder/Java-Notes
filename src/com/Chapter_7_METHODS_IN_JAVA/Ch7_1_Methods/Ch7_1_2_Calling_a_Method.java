package com.Chapter_7_METHODS_IN_JAVA.Ch7_1_Methods;

public class Ch7_1_2_Calling_a_Method {
    int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = x * y;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        Ch7_1_2_Calling_a_Method obj = new Ch7_1_2_Calling_a_Method();
        // object is created to call non-static method.
        // method invocation using object creation
        int c = obj.logic(a, b);
        System.out.println(c);

        int a1 = 5;
        int b1 = 3;
        int c1 = obj.logic(a1, b1);
        System.out.println(c1);
    }
}


//"STATIC" methods are known as "FUNCTION"
// a static method can only call static method and cannot call or called by non-static method
//"NON-STATIC" methods are known as "METHODS"