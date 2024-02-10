package com.Chapter_17_COLLECTIONS_FRAMEWORK.Ch_14_5_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Ch_14_5_3_List {
    public static void main(String[] args) {

        List l = new ArrayList();
        l.add(10);
        l.add(1, 20);
        l.add(2, 30);
        l.add(3, 40);
        l.add(4, 40);
        l.add(5, null);
        l.add(6, null);

        System.out.println(l);

        Iterator itr = l.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        ListIterator litr = l.listIterator();

        while (litr.hasNext()) {        // for forward iterators
            System.out.println(litr.next());
        }

        while (litr.hasPrevious()) {    // for backward iterators
            System.out.println(litr.previous());
        }
    }
}
