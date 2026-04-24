package DIAMOND_PROBLEM;

interface A
{
    void show();
}
interface B extends A{} 

interface C extends A{}

class D implements B,C
{

    public void show()
    {
        System.out.println("Diamond Problem");
    }
}
public class BeforeJava7 {
    public static void main(String[] args)
    {

        D d = new D();
        d.show();


    }
}
