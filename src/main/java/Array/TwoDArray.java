public class TwoDArray {
    public static void main(String args[]) {


        byte d[][] = {
                        {2, 1, -3, 4},
                        {4, 2, -5, 4},
                        {0, 4, -4, 7}
                     };
        for (byte row = 0; row < d.length; row++) {
            for (byte column = 0; column < d[row].length; column++) {
                System.out.print("\t" + d[row][column]);
            }
            System.out.println();
        }
    }
}
