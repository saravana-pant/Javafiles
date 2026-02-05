import java.util.*;
class NationalBank{

    private int accNo;
    private float balance;

    private String loanType;
    private double salary;
    private double loanAmount;
    private int emiCount;

    Scanner sc = new Scanner(System.in);
    
    NationalBank()
    {
        System.out.println("Welcome to National Bank of India");

        accNo = 1000;
        for(int i=1;i<=3;i++)
        {
            var ranNum = Math.floor(Math.random()*10)+1;
            accNo += (int) ranNum*(1000/(Math.pow(10,i)));
        }

        System.out.println("Your Account : "+accNo);

    }

    void loanInputs()
    {
        System.out.print("Enter Your Account No : ");
        int tempAccNo = sc.nextInt();

        System.out.print("Enter Your Account Balance : ");
        balance = sc.nextFloat();

        System.out.print("Enter Your Salary : ");
        salary = sc.nextDouble();

        System.out.print("Enter Loan Type : ");
        sc.nextLine();
        loanType = sc.nextLine().trim().toLowerCase();

        System.out.print("Enter Expected Loan Amount : ");
        loanAmount = sc.nextDouble();

        System.out.print("Enter Expect No of EMI's : ");
        emiCount = sc.nextInt();

        this.validation(tempAccNo);
    }

    void validation(int acc)
    {
        int attempt = 0;
        while(attempt<2){
            if(accNo==acc)
                break;
            else{
                System.out.print("Account No Not Found!\nEnter a Correct Account No : ");
                acc = sc.nextInt();
                attempt++;
            }
            
        }
        if(attempt==2){
            System.out.println("You have Reached Maximum Attempts \nTry Again Later");
            return;
        }


        if(this.balance<1000)
        {
            System.out.println("Insufficiant Balace , Minimum Blance Amount 1000 ");
            return;
        }

        switch (this.loanType) {
            case "car":
                if(this.loanAmount<=500000){
                    if(this.salary>25000)
                    {
                        System.out.println("For Car Loan You have to Pay 36 Emi's");
                        this.emiCount = 36;
                        this.display();
                        break;
                    }
                    else{
                        System.out.println("Due to your current income level the loan could not be approved");
                        break;
                    }
                }
                else{
                    System.out.println("The Maximum Loan Amount is : 400000");
                    break;
                }
            case "house":
                if(this.loanAmount<=6000000){
                    if(this.salary>50000)
                    {
                        System.out.println("For Car Loan You have to Pay 36 Emi's");
                        this.emiCount = 60;
                        this.display();
                        break;
                    }
                    else{
                        System.out.println("Due to your current income level the loan could not be approved");
                        break;
                    }
                }
                else{
                    System.out.println("The Maximum Loan Amount is : 6000000");
                    break;
                }
                
            case "buisness":
                if(this.loanAmount<=8000000){
                    if(this.salary>75000)
                    {
                        System.out.println("For Car Loan You have to Pay 84 Emi's");
                        this.emiCount = 84;
                        this.display();
                        break;
                    }
                    else{
                        System.out.println("Due to your current income level the loan could not be approved");
                        break;
                    }
                }
                else{
                    System.out.println("The Maximum Loan Amount is : 7500000");
                    break;
                }
            default: 
                System.out.printf("%s this Loan was Not Provide in Our Bank",loanType);
                break;
        }
    }
    void display(){
        System.out.println("\n");
        System.out.println("Account Holder Details");
        System.out.println("Account No : "+this.accNo);
        System.out.printf("Eligible for %s Loan\n",this.loanType.toUpperCase());
        System.out.println("Loan Amount : "+this.loanAmount);
        System.out.println("No of Emis : "+this.emiCount);
        System.out.println("\n");
        System.out.println("Your Loan Application has been Successfully Sanctioned");
        System.out.println("Thanks for Visiting Our Bank");
    }
}

public class Bank {
    public static void main(String[] args) {
        var n = new NationalBank();
        
        n.loanInputs();

    }
}