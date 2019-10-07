package Array;

public class MatrixInverse {

    public static void main (String[] args) {
        double matrix[][] = {
                {1, 0, 0,},
                {0, 1, 0,},
                {0, 0, 1,},
        };

        double invertedMatrix[][] = MatrixOperations.invertMatrix (matrix);


        MatrixOperations.printMatrix (invertedMatrix, 4);
    }
}
