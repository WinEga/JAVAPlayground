public class Printstarbykali {
    public static void main(String[] args) {
        int i,j;
        for(i=0;i<4;i++)
        {
            for(j=0;j<5;j++)
            {
                if(i%3!=0 && j%2!=0)
                {
                    System.out.print("\t");
                }
                else
                {
                    System.out.print("\t*");
                }

            }
            System.out.println();
        }

    }
}
