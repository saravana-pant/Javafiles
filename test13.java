import java.util.*;
class test13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        int x =1;
        for(int i=n;i>0;i--)
        {
            for(int j=x;j<=n;j++)
            {
                System.out.print((j)+" ");
            }
            System.out.println();
            x+=1;
        }
    }
}