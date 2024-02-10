package com.Chapter_9_ACCESS_MODEFIERS_AND_CONSTRUCTORS;

/*
    PRIVATE:
    The access level of private modifier is only within the class.
    It cannot be accessed from outside the class
 */

class MyEmployee {
    private int id;
    private String name;

    public void setId(int id){
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Ch_9_2_Private {
    public static void main(String[] args) {
        MyEmployee sova = new MyEmployee();
//        sova.id = 45;
//        sova.name = "I am Sova"; --> Throws an error private access modifier

        sova.setId(1);
        sova.setName("Sova");
        System.out.println(sova.getId());
        System.out.println(sova.getName());
    }
}
/*
    GETTER AND SETTER

    SETTER: Sets/Update [Mutator]   ===>   TAKE VALUE
    GETTER: Return      [Accessor]  ===>   DISPLAY
 */