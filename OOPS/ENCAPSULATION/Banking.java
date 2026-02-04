package OOPS.ENCAPSULATION;

class AmericanExpress{
    private int balance;
    private String AccountHolderName;

    void SetDetails(String AccHolder, int balance){
        this.balance = balance;
        this.AccountHolderName = AccHolder;

    }

    void withdraw(int amount){
        if(amount > 0){
            balance = balance - amount;
            System.out.println("Withdrawn  amount is ->"+amount);
            System.out.println("Final Balance is ->"+balance);

        }
        else{
            System.out.println("Invalid amout");
        }

    } 

    void deposit(int amount){
        if(amount > 0){
            balance = balance + amount;
            System.out.println("Deposited amount is ->"+amount);
            System.out.println("Final Balance is ->"+balance);

        }
        else{
            System.out.println("Invalid amout");
        }

    }

    void getBalance(){
        System.out.println("Final balance is"+balance);
        // return balance;
        
    }

    void getAccHolderName()
    {
        System.out.println("Final balance is"+AccountHolderName);
    }


}


public class Banking {
    public static void main(String [] args)
    {

        AmericanExpress AE = new AmericanExpress();
        AE.SetDetails("Piyush",1500000);
        AE.deposit(1500000);
        AE.withdraw(100000);


    }
}
