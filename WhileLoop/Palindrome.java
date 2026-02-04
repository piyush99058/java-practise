package WhileLoop;

public class Palindrome 
{
    public static int pl(int num){
        int rev = 0;
        while(num > 0)
        {
            int last = num % 10;
            rev = rev*10 + last; 
            num/=10;
            
        }
        System.out.println(num);
        return num;
        
    }
    public static void main(String[] args)
    {
        int num=121;
        int reversed = pl(num);
        if (num == reversed){
System.out.println("PALINDROME");
        }
        else{
            System.out.println("NON-PLAINDROME");
        }
        
        
    }
}
