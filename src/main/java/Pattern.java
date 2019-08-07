import java.util.Scanner;

public class Pattern
{
    public static void main(String[] ags)
    {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m;
        if(n%2!=0)
        {
            m =(n+1)/2;
        }
        else
        {
          m=n/2;
        }

        for(int i=1;i<=n-1;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1||i==n-1||j==1||j==n||j==m)
                {
                    System.out.print("* ");
                }

                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");

        }
    }
}
