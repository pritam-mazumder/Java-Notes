package com.Chapter_12_PACKAGE.asdx;

/*
    ACCESS MODIFIERS:
    Access level modifiers determine whether other classes can use a particular field or invoke a particular method.


    Access      	class	package	subclass    outside package
    Modifier
    Public	        Y	    Y	    Y	        Y
    Protected	    Y	    Y	    Y	        N
    Default(no)     Y	    Y	    N	        N
    Private	        Y	    N	    N	        N

*/

class C1{
    public int x = 5;
    protected int y = 2;
    int z = 6;
    private int a = 12;
    public void m1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class Ch_12_2_Access_Modifiers {
    public static void main(String[] args) {

        // SAME CLASS
        C1 c = new C1();
        c.m1();     // all access modifiers can be accessed within the same class

        // SAME PACKAGE
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        //System.out.println(c.a);  private access modifiers can not be accessed within the same package
    }
}
