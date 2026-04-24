//used when conversion of string into number wrongly

package EXCEPTION_HANDLING;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) 
    {
        try
        {
            int number1 = Integer.parseInt("abc");
        }

        catch(NumberFormatException e1)
        {
            System.out.println("Not a number");
        }



    }
}
