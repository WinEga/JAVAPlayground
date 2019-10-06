/*

We can use final keyword with
variable --> it will become Constant
class --> then not possible to extend(inherit) your class
method --> not possible to override your method

*/

package Basic;

final class Nothing{
    public void show(){
        System.out.println("Inside show method");
    }
}

//class Infinite extends Nothing{
//
//}

public class FinalKeyWordInClass {
    public static void main(String[] args) {
//        Infinite Obj1 = new Infinite();
//        Obj1.show();
        Nothing Obj2 = new Nothing();
        Obj2.show();

    }
}
