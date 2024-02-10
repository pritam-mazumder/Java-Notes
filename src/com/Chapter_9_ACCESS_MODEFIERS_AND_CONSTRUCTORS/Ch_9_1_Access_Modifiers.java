package com.Chapter_9_ACCESS_MODEFIERS_AND_CONSTRUCTORS;

public class Ch_9_1_Access_Modifiers {
}

/*
    ACCESS MODIFIERS:
    The access modifiers specify help to restrict the scope of a class, constructor, variable, method or data member.
    There are 4 types of access modifiers:
    1. Default
    2. Private
    3. Protected
    4. Public


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



        Access Modifier	    Class	    Package	    Subclass    Outside Package

        Public              Yes         Yes         Yes         Yes

        Protected           Yes      	Yes      	Yes     	No

        Default	            Yes      	Yes      	No      	No

        Private             Yes      	No        	No      	No
 */