package com.Chapter_9_ACCESS_MODEFIERS_AND_CONSTRUCTORS;

class asd{
    asd(){
        System.out.println("no args");
    }
    asd(int i){
        System.out.println(i);
        System.out.println("with args");
    }
    asd(int j, int k){
        System.out.println(j);
        System.out.println(k);
        System.out.println("with more args");
    }
}

public class Ch_9_4_Constructors_Overloading {
    public static void main(String[] args) {
        asd as = new asd();
        asd as2 = new asd(1);
        asd as3 = new asd(2,3);
    }
}
