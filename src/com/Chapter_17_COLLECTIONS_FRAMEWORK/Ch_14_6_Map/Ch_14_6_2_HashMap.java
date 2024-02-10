package com.Chapter_17_COLLECTIONS_FRAMEWORK.Ch_14_6_Map;

/*
    HashMap:

     - HashMap is an implemented class of Map interface.
     - It was introduced in JDK 1.2 version.
     - It's underlying data structure is "HashTable"

     Syntax:

        import java.util;

        class HashMap implements Map
        (It also implements Cloneable, Serializable interface)
        {
            constructors
            methods
        }


    Properties:

     - HashMap stores the data in key-value pairs
        e.g., key   |   value
            [ 101   |   "sova"  ] <- Each key-value pair is known as "Entry"
              102   |   "Jett"
              103   |   "raze"
     - Key can only have one "null" value (no duplicates in key) but values can have any number of "null" values
     - If the key value is duplicated then the old value will be overwritten
     - In HashMap, keys should be unique but values could be duplicated
     - It can store heterogeneous/different data types
     - It does not follow insertion order.
     - It does not follow sorting order.
     - It is non-synchronized data structures
     - It's initial capacity is 16 elements

    Constructor:

        1. HashMap()
           - Empty HashMap with the default initial capacity (16) and the default load factor (0.75).

        2. HashMap(int initialCapacity)
           - Empty HashMap with the specified initial capacity and the default load factor (0.75).

        3. HashMap(int initialCapacity, float loadFactor)
           - Empty HashMap with the specified initial capacity and load factor.

        4. HashMap(Map<? extends K,? extends V> m)
           - Constructs a new HashMap with the same mappings as the specified Map.


 */


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ch_14_6_2_HashMap {
    public static void main(String[] args) {

        HashMap hm = new HashMap();
        hm.put(101, 1);
        hm.put(102, "2");
        hm.put(103, 3.0);
        hm.put(104, true);
        hm.put(105, null);
        hm.put(null, null);

        System.out.println(hm);

        /*
            We can retrieve HashMap elements by 2 ways:
                1. Using Set & Iterator interface.
                2. Directly i.e. without Set & Iterator interface
            NOTE: In both cases we use Map.Entry interface
         */

        Set set = hm.entrySet();
        System.out.println(set);

        // OLD METHOD:

        Iterator itr = set.iterator();

        while (itr.hasNext()) {
            // Method 1:
            System.out.println(itr.next());

            // OR

            // Method 2:
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());

            // (run any one, but not both)
        }


        // NEW METHOD:

        // for (Map.Entry me: hm.entrySet()){
        //     System.out.println(me.getKey() + " -> " + me.getValue());
        // }

        // Type mismatch can occur if "Generics" is not being used



        hm.remove(null);
        System.out.println(hm);

        System.out.println(hm.containsKey(null));
        System.out.println(hm.containsKey(107));

        System.out.println(hm.containsValue(null));
        System.out.println(hm.containsValue(10));

        System.out.println(hm.get(null));
        System.out.println(hm.get(109));

        System.out.println(hm.isEmpty());

        hm.replace(104, false);
        System.out.println();

        System.out.println(hm.size());
    }
}
