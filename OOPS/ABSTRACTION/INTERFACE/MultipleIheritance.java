package OOPS.ABSTRACTION.INTERFACE;

interface mulInet
{
abstract void method1();


}

interface mulInet2{
abstract void method2();
}
 
class first implements mulInet,mulInet2{

    public void method1(){
        System.out.println("We are going to implement method1");
    }

    public void method2()
    {
        System.out.println("This is the method2 implementation of multiple inheritance");
    }
}


public class MultipleIheritance {
    
    public static void main(String [] args){
        mulInet m1 = new first();
        m1.method1();
        mulInet2 m2 = new first();
        m2.method2();

        first f1 = new first();
        f1.method1();
        f1.method2();


    }
}
