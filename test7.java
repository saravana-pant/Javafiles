import java.util.*;
class books
{
    String author;
    String publisher,title;
    float price;
    int stack_position;
    Scanner sc = new Scanner(System.in);
    void inputBook(String author,String publisher,String title,float price,int stack_position)
    {
        this.author=author;
        this.publisher=publisher;
        this.title=title;
        this.price=price;
        this.stack_position=stack_position;
    }
    void display()
    {
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("Publisher : "+publisher);
        System.out.println("Price : "+price);
    }
    void search(String author,String title,books [] objs,int n)
    {
        for(int i=0;i<n;i++)
        {
            if(objs[i].author.equals(author) && objs[i].title.equals(title))
            {
                System.out.println("Book Details are!");
                objs[i].display();
                System.out.print("Enter Number of Quantity : ");
                int count = sc.nextInt();
                if(count<=objs[i].stack_position)
                {
                    System.out.println("Total Cost : "+(count*objs[i].price));
                }
                else 
                    System.out.println("Required copies not in stock");
                return;
            }
        }
        System.out.print("The Book is Not Exist!");
    }
}

public class test7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        books b [] =new books [3];

        b[0] = new books();
        b[1] = new books();
        b[2] = new books();
        
        b[0].inputBook("James","java.association","Java",170,7);
        b[1].inputBook("John","javascript.association","JavaScript",210,15);
        b[2].inputBook("Zeus","python.association","Python",150,11);

        String author,title;
        books c1 = new books();
        System.out.print("Enter the Author Name : ");
        author = sc.nextLine();
        System.out.print("Enter the Title : ");
        title = sc.nextLine();
        c1.search(author,title,b,3);
    }
}