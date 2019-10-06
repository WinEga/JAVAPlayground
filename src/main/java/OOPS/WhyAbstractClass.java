/*
What is the need for Abstract Class?

We can avoid multiple methods creations as Number is Abstract class extends all type of numbers(Integer, Double, Float and ect.,)

 */

package OOPS;

class Display{
     public void show(Number i){
         System.out.println(i);

     }

}

public class WhyAbstractClass {
    public static void main(String[] args) {
        Display obj1 = new Display();

    }


}
