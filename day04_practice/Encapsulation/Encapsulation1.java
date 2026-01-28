class BankAccount
{
    private double balance;
    BankAccount(double balance)
    {
        if(balance>0)
        {
            this.balance=balance;
        }
        else
        {
            this.balance=0;
        }
    }

    public void deposit(double amount)
    {
        if(amount<=0)
        {
            System.out.println("amount cannot be added");
            return;
        }
        else
        {
            balance+=amount;
            System.out.println("deposited successfully");
        }
    }

    public void withdraw(double amount)
    {
        if(amount<=0 || amount>balance)
        {
            System.out.println("amount cannot be drawn");
        }
        else
        {
            balance-=amount;
            System.out.println("withdrawn successfully");
        }
    }

    public double getBalance()
    {
        return balance;
    }
}
class Encapsulation1
{
    public static void main(String args[])
    {
        BankAccount b=new BankAccount(10000);
        b.withdraw(5000);
        System.out.println("Balance:"+b.getBalance());
        b.deposit(-2);
        System.out.println("Balance:"+b.getBalance());
        b.deposit(2000);
        System.out.println("Balance:"+b.getBalance());
        

    }
}