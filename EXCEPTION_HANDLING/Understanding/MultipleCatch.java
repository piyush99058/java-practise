package EXCEPTION_HANDLING.Understanding;

public class MultipleCatch 
{   
    public static void main(String[] args)
    {
        try
        {
            int arr1[] =  new int[5];
            arr1[10] = 89;

            int x = 10/0;
            String name1 = "Piyush";
            String name2 = null;
        }
        catch(ArithmeticException e1)
        {
           System.out.println("Math error :"+e1.getMessage());
        }
        catch(NullPointerException e2)
        {
            //demo
            System.out.println("Error :"+e2.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("error:"+e.getMessage());
        }
        finally
        {
            System.out.println("Program executed successfully");
        }

    }
}
