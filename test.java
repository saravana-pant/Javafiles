import java.util.*;
class resturant
{
    String cus_type;
    float price = 150;
    int count;

    Scanner sc = new Scanner(System.in);

    float dis;

    void input()
    {
        System.out.print("Enter the Customer Type (R or G) : ");
        cus_type = sc.nextLine().toUpperCase();
        System.out.print("Enter the Food Quantity : ");
        count = sc.nextInt();
    }
    void bill()
    {
        if(cus_type.equals("R"))
        {
            System.out.println("Bill Amount : "+(price*count));
            System.out.println("Discount : "+(0.05f*price*count));
            dis = (price*count) - (0.05f*price*count);
            if(dis>=300) System.out.println("You hava an Special Gift");
            System.out.println("Total Bill : "+dis);
        }
        else if(cus_type.equals("G"))
        {
            System.out.println("Bill Amount : "+(price*count));
            System.out.println("Delivery Charge : 5");
            System.out.println("Total Bill : "+(price*count+5));
        }
        else
        {
            System.out.println("Invalid Customer Type!!!");
        }
    }
}

public class test
{
    public static void main (String[] args)
    {
        resturant c1 = new resturant();
        c1.input();
        c1.bill();
    }
}