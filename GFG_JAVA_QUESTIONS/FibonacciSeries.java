//8. Write a Program to Find Sum of Fibonacci Series Number
package GFG_JAVA_QUESTIONS;

public class FibonacciSeries {
    public static void main(String [] args)
    {
        int a =0;
        int b =1;
        int next = 0;
        for(int i=2;i<=12;i++){
            next = a + b;
            a = b;
            b = next;
        }

        System.out.println("Fibonacci ->"+next);

    }
}
