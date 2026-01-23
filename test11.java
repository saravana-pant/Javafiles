import java.util.*;
class test11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        int rem,sum=0,power,count=0;
        int temp1=n;
        int temp2=n;
        while(n>0)
        {
            count+=1;
            n/=10;
        }
        while(temp1>0)
        {
            rem=temp1%10;
            power=(int)Math.pow(rem,count);
            sum+=power;
            temp1/=10;
        }
        if(temp2==sum)
            System.out.printf("%d is a Amstrong Number!",temp2);
        else   
            System.out.printf("%d is a Not a Amstrong Nubmer!",temp2);
    }
}