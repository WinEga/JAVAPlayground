package OOPS;

interface Integration {
    void contact();
    int x = 30_10_1990;
}

public class LambdaExpression {
    public static void main(String[] args) {

//                Integration obj1 = new Integration() {
//                    public void contact() {
//                        System.out.println("I am the contact from Insurance policy");
//
//                    }
//                };
//        obj1.contact();

        Integration obj1 = () -> System.out.println("I am the contact from Insurance policy");

        obj1.contact();
        System.out.println(obj1.x);

    }
}
