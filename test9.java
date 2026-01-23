import java.util.*;
class student
{
    int rollno;
    Scanner sc = new Scanner(System.in);
    void setter()
    {
        System.out.print("Enter the Roll No : ");
        rollno = sc.nextInt();
    }
    void getter()
    {
        System.out.println("Roll No : "+rollno);
    }
}
class test extends student
{
    int mark1,mark2;
    void setter()
    {
        super.setter();
        System.out.print("Enter the Mark1 : ");
        mark1=sc.nextInt();
        System.out.print("Ente the Mark2 : ");
        mark2=sc.nextInt();
    }
    void getter()
    {
        super.getter();
        System.out.println("Mark 1 : "+mark1);
        System.out.println("Mark 2 : "+mark2);
    }
}
class result extends test
{
    int total;
    void dispaly()
    {
        super.getter();
        System.out.println("Total : "+(mark1+mark2));
    }
}
public class test9
{
    public static void main(String[] args)
    {
        result r = new result();
        r.setter();
        r.dispaly();
    }
}