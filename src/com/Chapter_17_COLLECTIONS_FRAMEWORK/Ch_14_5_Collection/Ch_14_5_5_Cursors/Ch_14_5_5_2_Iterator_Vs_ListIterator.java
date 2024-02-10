package com.Chapter_17_COLLECTIONS_FRAMEWORK.Ch_14_5_Collection.Ch_14_5_5_Cursors;

/*
    Iterator:
     - we can get Iterator cursor through iterator() method.
            e.g., Iterator itr = l.iterator();
                  (Interface)      (method)
                  (first           (first
                   character        character
                   capital)         small)
     - Iterator cursor can be used with any collection object.
     - Iterator methods are:
        - hasNext()
        - next()
        - remove()
     - By using Iterator methods we can retrieve the elements only in forward direction.
     - By using Iterator cursors we can read and remove the elements.



    ListIterator:
     - we can get ListIterator cursor through listIterator() method.
             e.g., ListIterator litr = l.listIterator();
                   (Interface)           (method)
                   (first                (first
                    character             character
                    capital)              small)
     - ListIterator cursor can be used only with List implemented classes.
        i.e., ArrayList, Linear, vector, stack.
     - ListIterator methods are:
        - hasNext()
        - next()
        - hasPrevious()
        - previous()
        - remove()
        - set()
     - By using Iterator methods we can retrieve the elements only in forward as well as backward direction.
     - By using ListIterator cursors we can read, remove, replace and add the elements.

 */

public class Ch_14_5_5_2_Iterator_Vs_ListIterator {
}
