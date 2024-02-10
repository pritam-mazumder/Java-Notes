package com.Chapter_17_COLLECTIONS_FRAMEWORK.Ch_14_5_Collection.Ch_14_5_8_Legacy_Classes;

/*
    Vector:

     - Vector is a legacy class which was introduced in JDK 1.0 version.
     - Vector is an implemented class of list interface, which is present in java.util package.
     - The underlying data-structure of vector is "growable" or "resizeable" array.

     Syntax:

        import java.util;

        class Vector implements List
        (if we go deeply, it also inherits List, Cloneable, Serializable, RandomAccess)
        {
            constructors
            methods
        }

    Properties:

     - Vector is indexed based data-structure.
     - It can store heterogeneous/different data structure.
     - It supports duplicate elements.
     - It supports multiple null values.
     - It follows insertion order.
     - It does not support sorting order.
     - Vector are synchronized collection.

    Methods:

     - It contains List and Collection interface methods.
     - addElement(Object obj)
     - firstElement()
     - lastElement()
     - removeElement(Object obj)
     - removeElementAt(int index)
     - removeAllElements()
     - capacity()
 */


import java.util.Vector;

public class Ch_14_5_8_2_Vector {
    public static void main(String[] args) {

        Vector v = new Vector();    // initial capacity 10
        v.add("1");
        v.add(1, "2");
        v.addElement("3");
        v.add(4.0);
        v.add(5);
        v.add(true);
        v.add(null);
        v.add(null);

        System.out.println(v);

        System.out.println(v.capacity());

        System.out.println(v.firstElement());

        System.out.println(v.lastElement());

        System.out.println(v.removeElement(5));

        v.removeElementAt(6);

        v.removeAll(v);
        System.out.println(v);

    }
}
