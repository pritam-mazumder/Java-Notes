// Que1: Create three class Calculator, ScCalculator and HybridCalculator and group them into a package.


package Ch_12_3_Practice_set.Question1;

class Calculator{
    public void calculate(int a, int b) {
        System.out.println("your result is = " + a+b);
    }
}

class ScCalculator{
    public void calculate(int a, int b) {
        System.out.println("your result is = " + Math.sin(a+b));
    }
}

class HyCalculator{
    public void calculate(int a, int b) {
        System.out.println("your result is = " + a+b);
        System.out.println("your result is = " + Math.sin(a+b));
    }
}

public class Question1 {
    public static void main(String[] args) {
        System.out.println("main method");
    }
}
