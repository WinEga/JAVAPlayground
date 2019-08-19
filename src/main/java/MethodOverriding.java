/*

If subclass (child class) has the same method as declared in the super class (parent class), it is known as method overriding in Java.

Sub-class overrides super class. let's see in the below example.

Remove the display method in Sub class and see.
 */
class Sup {
    public void display() {
        System.out.println("I am in super class");

    }

}

class Sub extends Sup {

    public void display() {
        System.out.println("I am in sub class");

    }

}

public class MethodOverriding {

    public static void main(String[] args) {

        Sub obj1 = new Sub();
        obj1.display();


    }

}
