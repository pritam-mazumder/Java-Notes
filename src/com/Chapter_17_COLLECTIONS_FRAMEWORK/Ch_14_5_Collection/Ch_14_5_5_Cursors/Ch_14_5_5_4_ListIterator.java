package com.Chapter_17_COLLECTIONS_FRAMEWORK.Ch_14_5_Collection.Ch_14_5_5_Cursors;

/*
    LISTITERATOR:

    It is used to access the elements of Collection in both forward and backward directions.
    This cursor can be applied only for List category Collections.
    While accessing the methods we can also add, set, delete elements.

    Syntax : ListIterator it = l.listIterator();
 */

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ch_14_5_5_4_ListIterator {
    public static void main(String[] args) {

        List l = new ArrayList();
        l.add(10);
        l.add("20");
        l.add("30");

        ListIterator litr = l.listIterator();

        while (litr.hasNext()) {
            System.out.println(litr.next());
        }

        System.out.println("-----");
        // because it'll print nothing if "hasPrevious()" starts traversing form 0 index
        // to print in reverse, the cursor should point the last element

        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
    }
}
