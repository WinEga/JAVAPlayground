package ClassObject;
class mul {
    int num1;
    int num2;
    int result;

    public void perform() {

        result = num1 * num2;
    }
}

public class ClassAndObject {

    public static void main(String[] args) {
        mul obj = new mul(); //Object knows somethings(variables and methods) and does somethings (perform action on methods)
        obj.num1 = 4;
        obj.num2 = 5;
        obj.perform();
        obj.result=1_000_000_000;
        System.out.println(obj.result);
    }


    
}
