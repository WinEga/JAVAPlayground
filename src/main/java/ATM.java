import java.util.Scanner;

public class ATM {
    public static void main(String[] ags)
    {
        Amount acc = new Amount();
        acc.balance=3000;
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter Your Option");
            System.out.println("1 - view Balance");
            System.out.println("2 - With Draw Cash");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    acc.Balan();
                    break;
                case 2:
                    System.out.println("Enter the With Drawn amount");
                    int amt = sc.nextInt();
                    acc.withdraw(amt);
                    break;
                default:
                    System.out.println("Invalid Option");

            }
            System.out.println("1--Continue,0--Exit");
            n = sc.nextInt();
        }
        while(n==1);
        {
            System.out.println("Thank You");
        }

    }
}
