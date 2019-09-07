
/*

Abstraction is one of the four major concepts behind object-oriented programming (OOP)
Abstraction is a process of hiding the implementation details from the user.
only the functionality will be provided to the user.

In Java, abstraction is achieved using abstract classes and interfaces.

5 points to remember:

1) We can not create object of the Abstract Class.
2) We should define every methods in the extended method from the abstract class
3) when abstract method defined then should have abstract class
4) Extended class called Concrete class
5) AOB :-)

 */
package OOPS;

abstract class Operation
{
    public abstract void add();
    public abstract String mul();
    public abstract void div();
}

class Ab extends Operation {
    public void add(){
    }
    public String mul(){

        return ("In multiplication method");

    }
    public void div(){

    }
}

public class Abstraction {
    public static void main(String[] args) {
        Operation obj1 = new Ab();
        System.out.println(obj1.mul());


    }

}
