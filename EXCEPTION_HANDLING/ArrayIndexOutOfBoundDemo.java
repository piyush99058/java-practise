package EXCEPTION_HANDLING;

public class ArrayIndexOutOfBoundDemo {
    public static void main(String [] args)
    {
        try
        {
            int arr1[] = {12,4,51,12,90};
            System.out.println(arr1[10]);

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index : "+e.getMessage());



        }
        finally{
            System.out.println("done");
        }   


    }
}
