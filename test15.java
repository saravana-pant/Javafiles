import java.util.*;
class test15
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int array[] ={5,7,2,1,6,9};
        for(int i=0;i<6;i++)
            System.out.print(array[i]+" ");
        System.out.print("\nThis is Array Elements Enter Element to Search : ");
        int key = sc.nextInt();
        int flag=0;
        for(int i=0;i<6;i++)
            if(array[i]==key)
            {
                flag=1;
                break;
            }
        if (flag==0)
            System.out.printf("The Element %d is not Present in the Array",key);
        else
            System.out.printf("The Element %d is Present in the Array",key);
    }
}