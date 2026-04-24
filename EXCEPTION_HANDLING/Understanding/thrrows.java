package EXCEPTION_HANDLING.Understanding;

public class thrrows
{
    public static void ABC() throws ArithmeticException
    {
        int result = 10/0;
        System.out.println(result);
    }
    public static void main(String[] args) 
    {
        
        try
        {
            ABC();
        }
        catch(ArithmeticException e)
        {
            System.out.println("QWTC:"+e.getMessage());
        }
    }
}
