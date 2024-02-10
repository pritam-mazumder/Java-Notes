package com.Chapter_16_Generic;


public class Ch_16_4_Generics_Method {
    public static void main(String[] args) {

//        Test1 t1 = new Test1("String");
//        System.out.println(t1.getValue());
//        Test1 t2 = new Test1(1);
//        System.out.println(t2.getValue());
//        Test1 t3 = new Test1(true);
//        System.out.println(t3.getValue());
//        Test1 t4 = new Test1(2.2);
//        System.out.println(t4.getValue());

        // Test1 is not type safe

        Test2<Integer> t5 = new Test2<Integer>(1);
        // Can be assign like this also, but it will override the value.
        t5.myContainer = 11;
        System.out.println(t5.getValue());
        System.out.println(t5.myContainer.getClass().getName());

        Test2<String> t6 = new Test2<String>("2");
        System.out.println(t6.getValue());
        System.out.println(t6.myContainer.getClass().getName());

        Test2<Float> t7 = new Test2<Float>(3.3f);
        System.out.println(t7.getValue());
        System.out.println(t7.myContainer.getClass().getName());

        Test2<Boolean> t8 = new Test2<Boolean>(true);
        System.out.println(t8.getValue());
        System.out.println(t8.myContainer.getClass().getName());


    }
}
