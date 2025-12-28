class prime
{
    public static void main(String[] args)
    {
        int num = 7;
        int i;
        int flag=0;
        for(i=2;i<num/2;i++)
        {
            if(num%i==0)
            {
                flag=1;
            }
        }
        if(flag==0)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }
}