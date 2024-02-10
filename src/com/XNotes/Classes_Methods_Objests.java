/*

ANIMALS --------------------------------------> DOGS/CATS etc --------------------------------------------------------> EAT(), RUN(), SLEEP() etc.

(class)                                        | (objects)                                                            | (methods)
=======                                          =========                                                              =========
(class is the collection of objects)           | (set of codes which performs a particular task)                      | {
(class is not a real world entity)             | (Advantages:){                                                       |     (tasks which they performs)
(it is template/blueprint/prototype)           |    1. code re usability                                              |     (class has methods)
(it does not occupy memory)                    |    2. code optimisation                                              |     (methods are accessed through objects)
                                               |  }                                                                   | }
                                                                                                                      | object is an instance of class
                                                                                                                      | (dog   is an instance of animal)
                                                                                                                      | it is real world entity
                                                                                                                      | it occupies memory
                                                                                                                      |
                                                                                                                      | Objects consists of:{
                                                                                                                      |     1. identity         : name of dog
                                                                                                                      |     2. state/attribute  : breed, age, color
                                                                                                                      |     3. behaviour        : eat, run, bark
                                                                                                                      | }
                                                                                                                      |
                                                                                                                      | How to create new keyword?
                                                                                                                      |     - by using new keyword
                                                                                                                      |     - newInstance
                                                                                                                      |     - clone() methods
                                                                                                                      |     - deserialization
                                                                                                                      |     - factory methods

SYNTAX:

access-modifier class className                | access-modifier return-type methodName(list of parameters)
{                                              | {
    body:                                      |
    -methods                                   |
    -constructors                              |
    -fields                                    |
    -blocks                                    |
    -nested class                              |
}                                              | }
 */