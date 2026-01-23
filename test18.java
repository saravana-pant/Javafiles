import java.util.*;
class test18
{
    public static void main(String[] args)
    {
        int array [] = {1,2,3,4,2,5,3,2};
        for(int i=0;i<7;i++)
        {
            for(int j=i+1;j<8;j++)
            {
                if(array[i]==array[j])
                {
                    System.out.println(array[i]);
                    break;
                }
            }
        }
    }
}