public class Printstarbykali {
    public static void main(String[] args) {
        byte row;
        byte column;
        for(row=0;row<4;row++)
        {
            for(column=0;column<5;column++)
            {
                if(row%3!=0 && column%2!=0)
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
