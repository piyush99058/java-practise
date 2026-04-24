package MULTITHREADING;

class BankAccount{
    private int balance = 1000;

    public synchronized void withdraw(int amount)
    {
        String name = Thread.currentThread().getName();
        System.out.println(name+" is checking the balance ...");
        if(balance >= amount){
            System.out.println(name+" finds enough money.Withdrawing : "+amount+"...");


            try{
                Thread.sleep(500);

            }
            catch(InterruptedException e){

            }
            balance -=amount;

        }
        else{
            System.out.println("sorry : "+name+" balance is only : "+balance+"Transaction denied");
        }



    }
}

class TransactionTask implements Runnable
{
    private BankAccount account;
    public TransactionTask(BankAccount account)
    {

        this.account = account;
    }

    public void run()
    {
        //each person tries to withdraw 700.
        account.withdraw(700);
    }


}


public class Synchronization {
    public static void main(String[] args) 
    {
        BankAccount sharedAccount = new BankAccount();
        //creating 2 threads
        Thread userA = new Thread(new TransactionTask(sharedAccount), "User A");

        Thread userB = new Thread(new TransactionTask(sharedAccount), "User B");


        userA.start();
        userB.start();

    }
}
