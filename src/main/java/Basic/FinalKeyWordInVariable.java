/*

We can use final keyword with
variable --> it will become Constant
class --> then not possible to extend your class
method --> not possible to override your method

*/

package Basic;

class Fan {
    final int J = 4;

    public void show(){

        System.out.println("Inside the show method");
        //J=10;
    }

}

public class FinalKeyWordInVariable {
    public static void main(String[] args) {
        Fan obj1 = new Fan();
        System.out.println(obj1.J);
        obj1.show();

    }

}
