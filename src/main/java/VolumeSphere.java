import java.util.Scanner;

public class VolumeSphere {

    public static void main(String [] args){
        System.out.print("Enter the radius of the Sphere : ");
        Scanner r = new Scanner(System.in);
        //System.out.print("Enter the radius of the Sphere : ");
        double radius = r.nextDouble();
        double PI = 3.14;
        double volume  =   PI*radius*radius*radius/3;
        System.out.println("The volume of Sphere is :"+volume);
        System.out.println(radius);
    }

}
