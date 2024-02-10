package com.Chapter_7_METHODS_IN_JAVA.Ch7_1_Methods;

/*
    METHOD:
    A method is a blocks of code that perform specific tasks and can be invoked or called by other parts of the program.
    They are used to modularize code and make it more reusable and maintainable.
*/


public class Ch7_1_1_Simple_Methods {
//    Method 1
    int add(int x,int y){
        int z = x+y;
        return z;
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        Ch7_1_1_Simple_Methods as     = new Ch7_1_1_Simple_Methods();
//      Class                  Object

        System.out.println(as.add(a,b));
    }
}





//    Method 2

/*
    static int logic(int x, int y){
        int z;
        if (x>y){
            z = x+y;
        }else {
            z = x*y;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = logic(a,b);
        System.out.println(c);

        int x = 4;
        int y = 2;
        int z = logic(x,y);
        System.out.println(z);
    }
*/

//    STATIC method can only call STATIC method
