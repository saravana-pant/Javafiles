import java.util.*;
class test3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Elements : ");
        int n = sc.nextInt();
        int x=1;
        for(int i=0;i<=n;i++)
        {
            System.out.print(x+" ");
            x=x*2;
        }
    }
}