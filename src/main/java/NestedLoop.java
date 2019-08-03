public class NestedLoop {

    public static void main(String[] args) {
        int i;
        int j;
        for (i = 1; i <= 8; i++) {
            for (j = 1; j <= 5; j++) {
                System.out.print("^ ");
            }
            System.out.println();
        }
    }
}

