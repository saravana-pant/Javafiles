class test8
{
    public static void main(String [] args)
    {
        int array [] = {712,105,265,132,154};
        int rem,sum,mul,copy;
        for(int i=0;i<5;i++)
        {
            copy=array[i];
            sum=0;
            mul=1;

            while (copy>0)
            {
                rem = copy%10;
                sum+=rem;
                mul*=rem;
                copy/=10;
            }
            if(sum>mul)
                System.out.printf("For %d Max is %d\n",array[i],sum);
            else
                System.out.printf("For %d Max is %d\n",array[i],mul);
        }
        
        
    }
}