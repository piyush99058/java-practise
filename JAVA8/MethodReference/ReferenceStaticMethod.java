/*
Reference mehtod usually replaces lamda expression .
: - called method reference operator .
*/

//static method reference 
package JAVA8.MethodReference;


interface Runnable1
{

     void run();
}
public class ReferenceStaticMethod  
{
    public static void printMessage()
    {
System.out.println("Hello from static method");
    }

    public static void main(String[] args) 
    {
        Runnable1 r =  ReferenceStaticMethod::printMessage;
        r.run();

    }
}
