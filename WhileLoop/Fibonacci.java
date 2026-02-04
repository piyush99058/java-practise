package WhileLoop;

public class Fibonacci {
    //palindrome
    public static void main(String[] args) {
        int first=0;
        int second=1;
        int Final;
        int num =2;
        System.out.print(first+" ");
        System.out.print(second+" ");
        while(num<=12){
            Final = first + second;
            first = second;
            second = Final;
            num++;
            System.out.print(Final+" ");
        }
       
    }
}
