package EXCEPTION_HANDLING;

class NullPointerExceptionDemo{
    public static void main(String[] args) 
    {
        try{
            String name  = null;
            
    System.out.println(name.length());
        }
        
        catch(NullPointerException e1){
            System.out.println("Null string");

        }
        finally
        {
        System.out.println("done. program executed successfully");
        }

    }
}