/* Write a java programme to print the following numbers

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6 7 8

 */

package Loops;
public class NestedLoop2 {

    public static void main(String[] args) {
        int i;
        int j;
        for (i = 1; i <= 8; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }
    }
}
