class employee
{
    String name;
    employee(String name)
    {
        this.name=name;
        System.out.println("Employee Constructor Called!");
    }
    int claculateSalary()
    {
        return 10000;
    }
}
class manager extends employee
{
    int bonus;
    manager(String name,int bonus)
    {
        super(name);
        this.bonus=bonus;
        System.out.println("Manager Constructor is Called!");
    }
    int claculateSalary()
    {
        return 10000+bonus;
    }
}
class test21
{
    public static void main(String[] args)
    {
        employee e = new manager("John",5000);
        System.out.println("Salary : "+e.claculateSalary());
    }
}