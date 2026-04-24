package General_Java_Concepts.SUPER;

class A
{
void show(){
    System.out.println("Function A");
}

}

class B extends A
{

    void show(){
        System.out.println("Function  B");
    }
}

public class defaultSuper
{
    public static void main(String[] args)
    {

        B obj = new B();
        obj.show();


    }
}
