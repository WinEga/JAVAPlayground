/*
Definition - What does Inheritance mean in JAVA?
Inheritance is a mechanism wherein a new class is derived(extended) from an existing class.
Super and Sub class in JAVA when we do single level inheritance
Here is example for inheritance at multi level

Will JAVA support multiple inheritance???
*/

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

public class Inheritance {

    public static void main(String[] args) {

        Calculator4 obj1 = new Calculator4();
        System.out.println(obj1.add(8, 5));
        System.out.println(obj1.sub(8, 5));
        System.out.println(obj1.mul(8, 5));
        System.out.println(obj1.rem(8, 5));

    }
}
