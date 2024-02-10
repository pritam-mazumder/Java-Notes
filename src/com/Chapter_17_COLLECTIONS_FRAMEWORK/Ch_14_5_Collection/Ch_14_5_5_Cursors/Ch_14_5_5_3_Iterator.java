package com.Chapter_17_COLLECTIONS_FRAMEWORK.Ch_14_5_Collection.Ch_14_5_5_Cursors;

/*
    ITERATOR:

    It is used to access the elements in the forward direction only.
    This cursor can be applied to any Collection Interfaces.
    While accessing the methods we can also delete the elements.

    Syntax : Iterator it = c.iterator();
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ch_14_5_5_3_Iterator {
    public static void main(String[] args) {

        List l = new ArrayList();
        l.add(10);
        l.add("20");
        l.add("30");

        Iterator itr =  l.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        l.remove("20");
        System.out.println(l);

        l.set(1, 100);  // replacing the element at given index
        System.out.println(l);
    }
}
