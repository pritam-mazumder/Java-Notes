package com.Chapter_17_COLLECTIONS_FRAMEWORK.Ch_14_5_Collection.Ch_14_5_5_Cursors;

/*
    ENUMERATION:

     - Enumeration is the cursor which is used to retrieve collection objects one by one.
     - It can be used only with legacy classes like Vector, Stack, Hashtable.
     - Enumeration methods are:
        - hasMoreElements()
        - nextElement()

     - It is used to retrieve the elements only in forward direction.
     - It is used read operations.

    Syntax : Enumeration e = v.elements();
*/

import java.util.Enumeration;
import java.util.Vector;

public class Ch_14_5_5_5_Enumeration {
    public static void main(String[] args) {

        Vector v = new Vector();
        v.add(10);
        v.add("20");
        v.add(30.0);

        System.out.println(v);

        Enumeration e = v.elements();

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
