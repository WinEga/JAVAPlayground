/*
Definition - What does Inheritance mean in JAVA?
Inheritance is a mechanism wherein a new class is derived(extended) from an existing class.
Super and Sub class in JAVA when we do single/multi level inheritance
Here is example for inheritance at multi level

Is A (Class)/ Has A (Objects)

Will JAVA support multiple inheritance???
*/

package OOPS;
class Calculator1 {
    public int add(int i, int j) {
        return i + j;
    }

}

class Calculator2 extends Calculator1 {
    public int sub(int i, int j) {
        return i - j;
    }

}

class Calculator3 extends Calculator2 {
    public int mul(int i, int j) {
        return i * j;
    }

}

class Calculator4 extends Calculator3 {
    public int rem(int i, int j) {
        return i % j;
    }

}

class Calculator5 extends Calculator4 {
    public double div(double i, double j) {
        return i / j;
    }

}

class Calculator6 extends Calculator5 {
    public double hun(double i, double j) {
        return (i / j)*100;
    }

}

public class Inheritance {

    public static void main(String[] args) {

        Calculator6 obj1 = new Calculator6();
        System.out.println("Addition "+obj1.add(8, 5));
        System.out.println("Subtraction "+obj1.sub(8, 5));
        System.out.println("Multiplication "+obj1.mul(8, 5));
        System.out.println("Reminder "+obj1.rem(8, 5));
        System.out.println("Division "+obj1.div(22, 7));
        System.out.println("Multiply by 100 "+obj1.hun(22, 7));

    }
}
