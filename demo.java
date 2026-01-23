class demo
{
    public static void main(String[] args)
    {
        int x=5;
        for(int i=1;i<=x;i++)
        {
            for(int space=0;space<x-i;space++)
                System.out.print(" ");
            for(int star=0;star<i;star++)
                System.out.print("* ");
            System.out.println();
        }
    }
}