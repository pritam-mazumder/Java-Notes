package com.Chapter_17_COLLECTIONS_FRAMEWORK.Ch_14_5_Collection;

/*
    ArrayDeque:

     - It is also known as Array Double Ended Queue or Array Deck.
     - It is a special kind of array that grows and allows users to add or remove an element from both sides of the queue.
     - It is an implementation of the Deque interface that uses a resizable array to store its elements.
     - Introduced in JDK 1.6 version
     - It is present in java.util package

     Syntax:

        import java.util;

        class ArrayDeque implements Deque
        (it also extends AbstractCollection and implements Cloneable, Serializable)
        {
            constructors
            methods
        }


    Properties:

     - ArrayDeque is indexed based data-structure.
     - It can store homogeneous/same data structure.
     - It supports insertion order.
     - It does not follow sorting order.
     - ArrayDeque are non-synchronized data-structure.


    Constructor:

        1. ArrayDeque()
           - Empty array deque with an initial capacity sufficient to hold 16 elements.

        2. ArrayDeque(Collection<? extends E> c)
           - Constructs a deque containing the elements of the specified collection, in the order they are returned by the collection's iterator.

        3. ArrayDeque(int numElements)
           - Empty array deque with an initial capacity sufficient to hold the specified number of elements.

 */


import java.util.ArrayDeque;

public class Ch_14_5_11_ArrayDeque {
    public static void main(String[] args) {

        ArrayDeque ad = new ArrayDeque();
        ad.add(1);
        ad.add(5);
        ad.add(4);
        ad.add(3);
        ad.add(2);
        ad.addFirst(0);
        ad.addLast(6);

        System.out.println(ad);

        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());

        System.out.println(ad.offerFirst(0));
        System.out.println(ad.offerLast(7));

        System.out.println(ad.removeFirst());
        System.out.println(ad.removeLast());

        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());

        System.out.println(ad.pollFirst());
        System.out.println(ad.pollLast());
    }
}