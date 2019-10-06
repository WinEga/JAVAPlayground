
/*

We can use final keyword with
variable --> it will become Constant
class --> then not possible to extend(inherit) your class
method --> not possible to override your method

*/
package Basic;

class Alpha{
    //final
    public void show(){
        System.out.println("In Alpha show");
    }

}
class Beta extends Alpha{
    public void show(){
       System.out.println("In Beta show");

    }

}

public class FinalKeyWordInMethod {
    public static void main(String[] args) {
    Beta Obj1 = new Beta();
    Obj1.show();


    }
}
