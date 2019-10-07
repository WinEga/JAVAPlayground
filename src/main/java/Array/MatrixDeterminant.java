package Array;

import java.text.MessageFormat;

public class MatrixDeterminant {

    public static void main (String[] args) {
        double determinantValue;
        double x[][] = {
                {0, 8, 7},
                {1, -4, 2},
                {0, 2, 0},
        };

        determinantValue = MatrixOperations.matrixDeterminant (x);
        System.out.println (MessageFormat.format ("Determinant value is : {0}", Double.toString (determinantValue)));
    }
}
