package TeamAssignment;

/*

pi/4 = 1-1/3+1/5-1/7+1/9-1/11+...

 */

import java.util.Scanner;

public class PiCalculation {
    public static void main(String[] args) {
        double pi=0;
        double t = 1;
        System.out.println("Enter integer value to get the Pi value (Larger value will give more accuracy)\n Range: -2,147,483,648 to 2,147,483,647");
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        for (int i=1; i<n; i=i+2){
            pi += t/i;
            t = -t;

        }
        System.out.println("The value of PI is "+pi*4);
    }
}
