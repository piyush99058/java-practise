package JAVA8;

interface calculator
{
int add(int a, int b);

static int result1(int a,int b)
{
    System.out.println("The result is -> ");
    int result = a + b;
    return result;
}

default void showMessage()
{
    System.out.println("The details are as follows");
}
}


public class FunctionalInterface
{
    public static void main(String[] args) 
    {

        calculator c = (a,b) -> a +b;  //here c is a functional interface . 
        int sum = c.add(2,5);
        System.out.println(sum);

        int z = calculator.result1(5,1);
        System.out.println("sum of z : "+z);
        c.showMessage();
        
    }
}
