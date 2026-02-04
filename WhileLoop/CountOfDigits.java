package WhileLoop;

public class CountOfDigits
{
    
    public static void main(String[] args)
    {
        int n = 114523;
        int count = 0;
     while(n>0)
        {
            n/=10;
            count++;

     }
        System.out.println(count);
    }
}