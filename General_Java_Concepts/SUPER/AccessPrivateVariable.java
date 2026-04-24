package General_Java_Concepts.SUPER;

//Accessing priate variable.
class A
{

int x =10;


}

class B extends A
{
    int x =20;
void display()
{
    System.out.println("Parent variable"+x); //Child classes bypasses parent class .
    System.out.println(super.x);
}

}
public class AccessPrivateVariable 
{
    public static void main(String[] args) 
    {
        B b1 = new B();
        b1.display();



    }
}
