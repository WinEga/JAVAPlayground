package Array;

public class MatrixMultiplication {

    public static void main (String args[]) {
        int x[][] = {
                {1, 2, 3,},
                {0, 5, 6,},
                {-1, 8, 9,},
        };

        int y[][] = {
                {1, 0, 7,},
                {0, 5, 4,},
                {0, 2, 1,},
        };

        int z[][] = MatrixOperations.multiplyMatrices (x, y);

        MatrixOperations.printMatrix (x, 1);
        MatrixOperations.printMatrix (y, 2);
        MatrixOperations.printMatrix (z, 3);

    }
}
