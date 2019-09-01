package TeamAssignment;
public class BoxPrint {

    public static void main(String[] args) {
        int i;
        int j;
        for (i = 1; i <= 4; i++) {

            for (j = 1; j <= 4; j++) {
                if (i == 2 && (j == 2 || j == 3)) {
                    System.out.print("  ");
                    continue;
                }

                if (i == 3 && (j == 2 || j == 3)) {
                    System.out.print("  ");
                    continue;
                }

                System.out.print("^ ");
            }
            System.out.println();
        }

    }

}
