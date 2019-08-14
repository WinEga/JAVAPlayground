class A {

    public A() {

        System.out.println("I am in A");
    }

    public A(int i) {

        System.out.println("I am in A int");
    }
}

class B extends A {

    public B() {
        //super();
        System.out.println("I am in B");
    }

    public B(int j) {
        super(j);
        System.out.println("I am in B int");
    }
}


public class SuperMethod {
    public static void main(String[] args) {

        B obj1 = new B(4);


    }
}
