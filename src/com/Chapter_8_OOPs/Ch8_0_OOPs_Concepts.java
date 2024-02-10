package com.Chapter_8_OOPs;

public class Ch8_0_OOPs_Concepts {
    /*

    1. Classes:

    A class is a user-defined data type that contains some properties and behaviors
    It is serves as a blueprint or template for creating objects.



    2. Object:

    An object is an instance of a class.
    Classes are used to create objects, and objects interact with each other through methods.
    Objects are created using the new keyword and the constructor of the class.



    3. ABSTRACTION:

    It is an OOPs that allows you to represent the essential characteristics of an object while hiding the details of its implementation.

    Real-world ex.:
    In a restaurant they will only give you the menu and not show you the kitchen and the procedure,
    that how things are being made.



    4. ENCAPSULATION:

    It is an OOPs that combines data and methods into a single unit called a class.
    It is the process of hiding the internal details of an object and
    providing a public interface to interact with the object.
    Encapsulation helps in achieving data abstraction and protects the data from unauthorized access or modification.

    It is achieved through access specifier like

        public                  It provides the highest level of accessibility.
                                Public members can be accessed from anywhere, including other classes, packages, and even outside the program.

        private                 It provides the most restrictive level of accessibility.
                                Private members are only accessible within the same class.
                                They cannot be accessed from outside the class, including subclasses or other classes in the same package.

        protected               It allows access within the same class, subclasses, and other classes within the same package.
                                Protected members are not accessible from classes in different packages if they are not subclasses.

        default(only in java)   If no access modifier is specified, it is considered the default access level.
                                The default members are accessible within the same package but not accessible outside the package.
                                Default access is sometimes called package-private access.

        Access Modifier	Class	Package	Subclass    Outside Package
        public	        Yes     Yes     Yes         Yes
        protected	    Yes 	Yes 	Yes     	No
        Default	        Yes 	Yes 	No      	No
        private	        Yes 	No  	No      	No

    Real-world ex.: School bag is one of the most real examples of Encapsulation. School bag can keep our books, pens, etc.

    Real-world ex.: The person on the counter is a member function
        suppose you gave the order and the order is ready
        if you consider that the food(data) is PRIVATE
        the food is currently accessed by only the same member of the class, and you cannot because you're form the other class
        so now only that person can provide you the data if you can request him to.




    5. POLYMORPHISM:

    Polymorphism means having multiple forms.
    In Java, polymorphism allows an object to take on different forms or behave differently in different contexts.
    It is achieved through:
        method overloading (multiple methods with the same name but different parameters in the same class)
        method overriding (same method name with different implementations in a subclass)

    Real-world ex.: A man at the same time is a father, a husband, and an employee.

        Polymorphism is mainly divided into two types:

            1. Compile-time Polymorphism (achieved by method overloading)

                It is also known as static polymorphism.
                This type of polymorphism is achieved by function/method "overloading" or operator "overloading".
                Binding of method calls during the compile-time based on the method parameters.
                The compiler determines which method to call at compile-time based on the number and arguments, and method overloading.

                (The call is resolved at compile time)
                (Also known as STATIC BINDING or EARLY BINDING)
                (method overloading)
                (compile time is faster because wo compile time per he ho jata hai)

                    Method Overloading: When there are multiple functions with the same name but different parameters then these functions are said to be overloaded.

            2. Runtime Polymorphism (achieved by method overriding)

                It is also known as Dynamic Method Dispatch.
                It is a process in which an "overridden method" is called by the function to resolved at Runtime.
                Binding of method calls during the runtime based on the actual type of the object.
                The decision of which method implementation to execute is made at "runtime"
                based on the object's type and the overridden method in the class hierarchy.

                (The call is resolved at runtime time)
                (Also known as DYNAMIC BINDING or LATE BINDING)
                (method overriding)





    6. INHERITANCE:

    Child class is allowed to inherit the features(fields and methods) of Patent/another class.
    Inheriting from the existing class and modified it.
    To prevent creating the class form the scratch

    Real-world ex.: Taking bike engine from the previous generation, and after modification it is launched in the next generation
                    KTM Duke 390
                    KTM RC 390
                    KTM Adventure 390

    Diamond Problem:

            [ A ]       parent class
            /   \
           /     \
        [ B ]   [ C ]   both B and C are inheriting the properties of A
           \     /
            \   /
            [ D ]       D is inheriting both B and C

        Now if we want to call any function from D,
        so D will get confused, ki kiske function ko call karna hai? B or C.
        This will create ambiguity.

            Solution:
                C++:    using the virtual keyword
                Java:   using default methods and interfaces
                Python: using method resolution order




    */
}
