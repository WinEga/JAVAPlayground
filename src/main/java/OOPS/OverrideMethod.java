//Sub-class overrides the super class
package OOPS;
class class1{
    public void show(){

        System.out.println("In class1");
    }

}

class class2 extends class1 {
@Override
    public void show(){
        System.out.println("In class2");
    }

}


public class OverrideMethod {

    public static void main(String[] args) {
        class2 obj1 = new class2();
        obj1.show();

    }
}
