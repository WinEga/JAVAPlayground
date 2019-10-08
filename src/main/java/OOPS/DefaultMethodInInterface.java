/*
In functional Interface, we can have only one abstract method whereas more default methods allowed
In default method, we can declare and define.
 */

package OOPS;

@FunctionalInterface
interface People {
    void eat();

    default void sleep() {
        System.out.println("You must sleep everyday");
    }

    default void walk() {
        System.out.println("You must walk everyday at least 30 minutes ");
    }
}

class PeopleImp implements People {

    public void eat() {
        System.out.println("Eat"); //method def on the declared method
    }

    public void sleep() {
        System.out.println("Sleep"); // method overriding
    }

    public void walk() {
        System.out.println("Walk"); // method overriding
    }
}

public class DefaultMethodInInterface {
    public static void main(String[] args) {

        People Obj1 = new PeopleImp();// creating an object from the defined concrete class PeopleImp
        Obj1.eat();
        Obj1.sleep();
        Obj1.walk();

        People Obj2 = () -> {
        };// here creating an object without calling the concrete class PeopleImp
        Obj2.walk();
        Obj2.eat();
        Obj2.sleep();

    }
}
