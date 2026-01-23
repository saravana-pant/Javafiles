import java.util.*;
class test17
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int x = sc.nextInt();
        System.out.print("Enter the Seed Number to Check : ");
        int y = sc.nextInt();
        int rem,temp=y;
        int mul=y;
        while(temp>0)
        {
            rem=temp%10;
            mul=mul*rem;
            temp/=10;
        }
        if(x==mul)
            System.out.printf("The Number %d is a Seed of %d",y,x);
        else
            System.out.printf("The Number %d is not a Seed of %d",y,x);
    }
}