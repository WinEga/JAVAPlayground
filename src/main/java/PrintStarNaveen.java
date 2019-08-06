public class PrintStarNaveen {

    public static void main(String[] args) {
        for (int i=1;i<=4;i++) {
            if (i == 2 || i == 3) {
                for (int j = 1; j <= 3; j++) {
                    System.out.print("*\t\t");
                }
                System.out.println();
            } else {
                for (int j = 1; j <= 5; j++) {
                    System.out.print("*\t");
                }
                System.out.println();
            }
        }
    }

}
