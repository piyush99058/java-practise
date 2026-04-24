package EXCEPTION_HANDLING;

public class AirthmaticExceptionDemo {
    public static void main(String []args){
        try{
        int x = 10/0;
        }
        catch(Exception e){
            System.out.println("Error hanlded , cannot be divided by zero");
        }
        finally{
            System.out.println("Done");
        }
    }
}
