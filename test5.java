class Restaurant
{
    String res_name;
    long contact;
    String address;
    double rating;
    void displayRestaurantDetails()
    {
        System.out.println("Restaurant Name : "+res_name);
        System.out.println("Contact : "+contact);
        System.out.println("Address : "+address);
        System.out.println("Rating : "+rating);
    }
}
public class test5
{
    public static void main(String[] args)
    {
        Restaurant r = new Restaurant();
        r.res_name="Foodies Spot";
        r.contact=987654321;
        r.address="Theni";
        r.rating=4.5;
        r.displayRestaurantDetails();
    }
}