class calculator
{
    String findAverage(int x,int y,int z)
    {
        float avg = (x+y+z)/3.0f;
        
        return String.format("%.2f",avg);
    }
}
public class test19
{
    public static void main(String []args)
    {
        calculator c = new calculator();
        System.out.printf("The Average is  : "+(c.findAverage(51,27,37)));
    }
}