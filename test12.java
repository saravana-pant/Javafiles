import java.util.*;
class test12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Initial Balance : ");
        int balance = sc.nextInt();
        int user,w;
        while(true)
        {
            System.out.print("Enter what you want to do 1.Widrawal 2.Exit : ");
            user = sc.nextInt();
            if(user==2)
            {
                System.out.println("Exit Successfuly");
                break;
            }
            System.out.print("Enter Amount to Widthdraw : ");
            w = sc.nextInt();
            if(w<=balance)
            {
                System.out.printf("%d is Widthdrawed Successfully\n",w);
                balance-=w;
            }
            else
                System.out.println("Insufficiant Balance");
        }
    }
}