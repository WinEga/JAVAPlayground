package ClassObject;
public class Amount {
        double balance;
    void Balan()
    {
        System.out.println("Current balance"+balance+"rs");
    }
    void withdraw(int amt)
    {
        if(amt>balance)
        {
            System.out.println("Less Balance");
        }
        else
        {
            System.out.println(amt+"rs is withdraw");
            balance-=amt;
        }
    }

}

