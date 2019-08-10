import java.util.Scanner;

public class PatternGeneralisation {
    public static void main(String[] ags) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        byte number = sc.nextByte();
        byte midPoint;
        if (number < 2) {
            System.out.println("Please run again and enter positive number greater than 1");
        }
        if (number % 2 != 0) {
            midPoint = (byte) ((number + 1) / 2);
        } else {
            midPoint = (byte) (number / 2);
        }

        for (byte row = 1; row <= number - 1; row++) {
            for (byte column = 1; column <= number; column++) {
                if (row == 1 || row == number - 1 || column == 1 || column == number || column == midPoint) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println("\t");

        }

    }
}
