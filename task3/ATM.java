import java .util.Scanner;
class Bank
{
    double bank_balance;
    Scanner sc=new Scanner(System.in);
     public void  balance()
    {
        System.out.println("enter your bank balance");
        bank_balance=sc.nextDouble();
        
    }
    public double checkbalance()
    {
        return bank_balance;
    }
}
class Withdrawel extends Bank
{
    double withdraw_amount;
    public double withdraw(double amount)
    {
        if(amount<bank_balance)
        {
                System.out.println("you can doing the with draw");
                double new_balance=bank_balance-amount;
                return new_balance;
        }
        else
        {
            System.out.println("sufficient bankbalace you have");
        }
        return 0.0;
    }
}
class deposit extends Bank
{
    double deposit_amount;
    public double depositamount(double amount)
    {
       
        deposit_amount=bank_balance+amount;
        return deposit_amount;
    }
}
class ATM 
{
    public void display()
    {
        System.out.println("1: checking the balance");
        System.out.println("2: doing the withdrawel");
        System.out.println("3: doing the deposit");
        System.out.println("1: Exit");

    }

    public static void main(String args[])
    {
        ATM at=new ATM();
        Withdrawel with=new Withdrawel();
        deposit dep=new deposit();
        int choise;
        char ch;
        double amount;
        Scanner sc=new Scanner(System.in);
        with.balance();
        do
        {
            
            System.out.println("*******ATM INTERFACE*****");
            at.display();
            System.out.println("****Enter your choise according to the option or need");
            choise=sc.nextInt();
            switch(choise)
            {
                       
                case 1:
                         System.out.println("your bank balance is : "+with.checkbalance());
                         break;
                case 2:
                         
                        System.out.println("how much amount do you want to withdraw");
                        amount=sc.nextDouble();
                        System.out.println("your new balance after the with drawel"+with.withdraw(amount));
                        break;
                case 3:
                         System.out.println("how much amount do you want to deposit");
                         amount=sc.nextDouble();
                         System.out.println("your new balance after the deposit: "+dep.depositamount(amount));
                         break;
                default:
                         System.out.println("you want to exit");
                         break;
            }
            System.out.println("do you want to again this programming");
            ch=sc.next().charAt(0);
        }while(ch=='Y' || ch=='y');
       System.out.println("*******Thank You ******* see you again *****");
        
    }
}