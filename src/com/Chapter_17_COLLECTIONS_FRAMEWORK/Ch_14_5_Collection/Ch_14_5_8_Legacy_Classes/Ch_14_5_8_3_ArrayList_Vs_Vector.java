package com.Chapter_17_COLLECTIONS_FRAMEWORK.Ch_14_5_Collection.Ch_14_5_8_Legacy_Classes;

/*
    ArrayList:

     - Arraylist was introduced in JDK 1.2 version.
     - Non-legacy class
     - Non-synchronized collection
     - Not thread-safe
     - Fast
     - Does not provide guarantee data consistency.
     - Load capacity:
            newCapacity = (oldCapacity * 3) / 2 + 1
     - Does not provide any method to find the capacity.


    Vector:

     - Vector was introduced in JDK 1.0 version.
     - Legacy class
     - Synchronized collection
     - Thread-safe
     - Slower than Arraylist
     - Provide guarantee data consistency.
     - Load capacity:
            newCapacity = (oldCapacity * 2)
     - Vector class provide method "int capacity()" to find the capacity.
 */


public class Ch_14_5_8_3_ArrayList_Vs_Vector {
}
