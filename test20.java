import java.util.*;
class test20
{
    public static void main(String[] args)
    {
        int array [] = {5,4,3,2,1};
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<4;j++)
                if(array[j]>array[j+1])
                {
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
        }
        for(int i=0;i<5;i++)
        {
            System.out.print(array[i]+" ");
        }
    }

}