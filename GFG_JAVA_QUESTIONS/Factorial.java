package GFG_JAVA_QUESTIONS;

public class Factorial {
    static int Factorial(int n){
        int fact=1;
        for(int i=2;i<=n;i++)
        {
            fact = fact*i;

        }
        return fact;
    }
    public static void main(String[] args) 
    {
        int n =5;
        int Final_Answer = Factorial(n);
        System.out.println("Factorial->"+Final_Answer);

    }
    
}
