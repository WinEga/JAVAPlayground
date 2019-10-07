/*

Write a JAVA programme / program to multiple two given matrix 3x3

 */

package Array;
public class MatrixMultiplicationInitial {
    public static void main(String args[]) {
//Data for two matrices a and b
        byte a[][] = {
                {1, 1, 2},
                {2, 2, 2},
                {3, 3, 3}
        };

        byte b[][] = {
                {3, 2, 1},
                {0, 2, 1},
                {3, 0, 1}
        };

        short c[][] = new short[a.length][b.length];  //3 rows and 3 columns

//Multiplication of 2 matrices with same order
        for (byte aRow = 0; aRow < a.length; aRow++) {
            for (byte bColumn = 0; bColumn < b.length; bColumn++) {
                c[aRow][bColumn] = 0;
                for (byte runner = 0; runner < b.length; runner++) {

                    c[aRow][bColumn] += a[aRow][runner] * b[runner][bColumn];

                }
                System.out.print(c[aRow][bColumn] + "\t");
            }
            System.out.println();
        }
    }
}