import java.util.*;
class customer
{
    String customerName;
    int customerId;
    long customerContact;
    String customerAddress;
    customer(String name,int id,long con,String address)
    {
        customerName=name;
        customerId=id;
        customerContact=con;
        customerAddress=address;
    }
    void display_details()
    {
        System.out.println("Name : "+customerName);
        System.out.println("Id : "+customerId);
        System.out.println("Contact : "+customerContact);
        System.out.println("Address : "+customerAddress);
    }
}
public class test14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name : ");
        String name = sc.nextLine();
        System.out.print("Enter the Id : ");
        int id = sc.nextInt();
        System.out.print("Enter the Contact : ");
        long con = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter the Address : ");
        String address = sc.nextLine();
        customer c = new customer(name,id,con,address);
        c.display_details();
    }
}