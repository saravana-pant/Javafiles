class bankAccount
{
    private String name,email;
    private long acc_no;
    private float amount;
    
    String getName()
    {
        return name;
    }
    String getEmail()
    {
        return email;
    }
    long getAcc_no()
    {
        return acc_no;
    }
    float getAmount()
    {
        return amount;
    }
    void setName(String name)
    {
        this.name=name;
    }
    void setEmail(String email)
    {
        this.email=email;
    }
    void setAcc_no(long acc_no)
    {
        this.acc_no=acc_no;
    }
    void setAmount(float amount)
    {
        this.amount=amount;
    }
}

public class test6
{
    public static void main(String[] args)
    {
        bankAccount b = new bankAccount();

        b.setName("Saravanan");
        b.setEmail("saravana123@gmail.com");
        b.setAcc_no(9876541);
        b.setAmount(10000);

        System.out.println("Name : "+b.getName());
        System.out.println("Account No : "+b.getAcc_no());
        System.out.println("Email : "+b.getEmail());
        System.out.println("Amount "+b.getAmount());
    }
}