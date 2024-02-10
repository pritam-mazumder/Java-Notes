package com.Chapter_16_Generic;

import java.util.ArrayList;

public class Ch_16_3_Generics {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(0, 1);
        list.add(0, 0);

        System.out.println(list);

        // OR

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
