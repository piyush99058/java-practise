package GFG_JAVA_QUESTIONS;
import java.util.Scanner;
public class swap {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int a = sc.nextInt();
        System.out.println("Enter second Number");
        int b = sc.nextInt();
        System.out.println("Before swapping"+a+" "+b);
        int temp= 0;
        temp = a;
        a = b;
        b = temp;

        
         System.out.println("After swapping"+a+" "+b);
    }   
}
