//static + default interfaces in java
package JAVA8;


interface T1
{
    int add(int a,int b); // Uncommented to make T1 a functional interface
    default void table(){
        System.out.println("This is a default method");
    }

    static int result(int z){
        return z*2;
    }


}

class ABC implements T1
{
    @Override
    public int add(int a, int b) 
    {
        System.out.println("X");
        return a + b;
    }
}

public class StaticPlusDefaultInterfaces {
    public static void main(String[] args)
    {
    
        ABC abc = new ABC();
            abc.table();
        System.out.println(T1.result(12));
        int plus = abc.add(89,1);
        System.out.println("plus : "+plus);
        


    }
}
