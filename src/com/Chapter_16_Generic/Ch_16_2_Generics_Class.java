package com.Chapter_16_Generic;

import java.util.ArrayList;
import java.util.List;

class Test1{
    // Objects is the parent class of all java classes.
    Object container;
    public Test1(Object container){
        this.container = container;
    }

    public Object getValue(){
        return this.container;
    }
}

class Test2<T>{
    T myContainer;
    public Test2(T myContainer){
        this.myContainer = myContainer;
    }
    public T getValue(){
        return this.myContainer;
    }
}

public class Ch_16_2_Generics_Class {
    public static void main(String[] args) {

        // Example 1
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
//        list.add(4); // error - different data type
        System.out.println(list);

        // Example 2
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
//        list2.add("4"); // error - different data type
        System.out.println(list2);

        // Example 3
        List list3 = new ArrayList();
        list3.add(1);
        list3.add("2");
        list3.add(3.0);
        System.out.println(list3);

//        list and list2 were using generic for type safe list.
//        list3 is accepting values different data type, which means it is not type safe.


    }
}
