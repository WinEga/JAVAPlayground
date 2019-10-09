/*
The advantage of static method in interface is no need to create concrete class.
Directly we can call the method by interfaceName.method()
 */

package OOPS;

interface Algebra {

    static void equation() {
        System.out.println("Different order of equations in Algebra (Say: Liner, Quadratic, Cubic and ect.,)");
    }
}

public class StaticMethodInInterface {
    public static void main(String[] args) {
        Algebra.equation();

    }
}
