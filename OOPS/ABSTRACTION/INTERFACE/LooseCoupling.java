package OOPS.ABSTRACTION.INTERFACE;
import java.util.Scanner;

interface Payment
{
    abstract void pay();
}

class UpiPayment implements Payment
{
    public void pay(){
        System.out.println("Payment is done through UPI ...");
    }


}

class InternetBanking implements Payment
{
    public void pay(){
        System.out.println("Payment is done through Internet Banking ...");
    }
}

class PaymentCheckout
{
    public void payment(Payment payment){
        payment.pay();
    }
}



public class LooseCoupling {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       PaymentCheckout checkout = new PaymentCheckout();
       System.out.println("Enter your choice");
       System.out.println("1. UPI Payment");
       System.out.println("2. Internet Banking");
       System.out.println("3. Invalid choice");
        int choice = sc.nextInt();
    switch (choice) {
        case 1:
            checkout.payment(new UpiPayment());
            break;
        

         case 2:
            checkout.payment(new InternetBanking());
            break;
        default:
            System.out.println("Invalid choice");
            break;
    }


    }
}
