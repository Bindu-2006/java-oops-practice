public class BankAccount
{
    String accountNumber;
    String accountHolder;
    double balance;
    BankAccount(String accountNumber,String accountHolder,double balance)
    {
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    void withdraw(double amount)
    {
        if(amount<=0)
        {
            System.out.println("amount should be positive");
        }
        else if(amount>balance)
        {
            System.out.println("Insufficient Balance! your account has:$"+balance);
        }
        else
        {
            System.out.println(amount+" withdrawn successfully");
            balance=balance-amount;
            display();
        }
      
    }
    void deposit(double amount)
    {
        if(amount<=0)
        {
            System.out.println("amount should be positive");
        }
        else
        {
            System.out.println(amount +" deposited successfully");
            balance=balance+amount;
            display();
        }   
    }
    void display()
    {
        System.out.println(accountNumber+" "+accountHolder+"  $"+balance);
        System.out.println("---------------------------");
    }
    public static void main(String args[])
    {
        BankAccount b1=new BankAccount("SBI987654","Hima Bindu",10000);
        b1.display();
        b1.withdraw(5000);
        b1.deposit(2000);
        b1.withdraw(10000);
        b1.deposit(-5);
    }

}