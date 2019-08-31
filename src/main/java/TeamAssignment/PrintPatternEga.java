/*
Write a Java programme to print the following pattern

*	*	*	*	*
*		*		*
*		*		*
*	*	*	*	*

 */


public class PrintPatternEga {

    public static void main(String[] args) {
        byte column;
        byte row;
        for (row = 1; row <= 4; row++) {

            for (column = 1; column <= 5; column++) {
                if (row == 2 && (column == 2 || column == 4)) {
                    System.out.print("\t");
                    continue;
                }

                if (row == 3 && (column == 2 || column == 4)) {
                    System.out.print("\t");
                    continue;
                }

                System.out.print("*\t");
            }
            System.out.println();
        }

    }

}
