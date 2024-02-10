package com.Chapter_17_COLLECTIONS_FRAMEWORK.Ch_14_6_Map;

/*
    MAP INTERFACE:

     - Map is a interface which is present in java.util package.
     - It was introduced in JDK 1.2 version.

     Syntax:

        import java.util;

        public interface Map{
            methods
        }


    Properties:

     - Map stores the data in key-value pairs.
        e.g., roll no : name
              phone no : name
              emp id : name

        e.g., key   |   value
            [ 101   |   "sova"  ] <- Each key-value pair is known as "Entry"
              102   |   "Jett"
              103   |   "raze"
     - In map, keys should be unique but values could be duplicated
     - Key can only have one "null" value (no duplicates in key) but values can have any number of "null" values
     - If the ley value is duplicated then the old value will be overwritten
     - It does not follow insertion order.
     - It does not follow sorting order.

 */


import java.util.*;

public class Ch_14_6_1_Map_Interface {
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put(100, 1);
        map.put(101, "2");
        map.put(102, 3.0);
        map.put(103, true);
        map.put(104, null);
        map.put(105, null);
        map.put(null, null);

        System.out.println(map);

        System.out.println(map.containsKey(100));
        System.out.println(map.containsKey(106));

        System.out.println(map.containsValue(1));
        System.out.println(map.containsValue("1"));

        System.out.println(map.entrySet());

        System.out.println(map.get(101));

        System.out.println(map.isEmpty());

        System.out.println(map.remove(105));

        System.out.println(map.replace(104, false));

        System.out.println(map.size());

        System.out.println(map.hashCode());

//        map.clear();
//        System.out.println(map);
    }
}
