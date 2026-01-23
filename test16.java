import java.util.*;
class media
{
    String title;
    int price;
    media(String title,int price)
    {
        this.title=title;
        this.price=price;
    }
    void display()
    {
        System.out.println("Title : "+title);
        System.out.println("Price : "+price);
    }
}
class book extends media
{
    int pages;
    book(String title,int price,int pages)
    {
        super(title,price);
        this.pages=pages;
    }
    void display()
    {
        super.display();
        System.out.println("Pages : "+pages);
    }
}
class tape extends media
{
    float time;
    tape(String title,int price,float time)
    {
        super(title,price);
        this.time=time;
    }
    void display()
    {
        super.display();
        System.out.println("Time Duration : "+time+" Minutes");
    }
}
public class test16
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Book details!");
        System.out.print("Enter Book title : ");
        String title_b = sc.nextLine();
        System.out.print("Enter Price : ");
        int price_b = sc.nextInt();
        System.out.print("Enter Number of Pages : ");
        int pages = sc.nextInt();
        book b = new book(title_b,price_b,pages);
        tape t = new tape("History",170,60);
        System.out.print("Book Details are!");
        b.display();
        System.out.print("Tape Details are!");
        t.display();
    }
}
