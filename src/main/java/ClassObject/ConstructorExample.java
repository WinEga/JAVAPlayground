package ClassObject;
class maths {

    double sum;
    int add;
    double PI = (double) 22 / (double) 7;

    public maths() {
        System.out.println("Inside default constructor :-)");
    }

    public maths(double num1, double num2) {
        sum = num1 + num2;
    }

    public maths(int num1, int num2) {
        add = num1 + num2;
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        maths obj = new maths(); // maths() - Constructor
        System.out.println();
        System.out.println(obj.PI);
        maths obj1 = new maths(3.4, 4);
        System.out.println(obj1.sum);
        maths sumInt = new maths(4, 4);
        System.out.println(sumInt.add);

    }
}
