package OOPS.POLYMORPHISM;

public class mainMethodOverload 
{
    public static void main(String[] args)
    {
        System.out.println("main method");
        mainMethodOverload obj1 = new mainMethodOverload();
        obj1.main();
        obj1.main(new int[]{10,20,30});
    }

    public static void main()
    {
        System.out.println("second main method");
    }

    public static void main(int[] args)
    {
        System.out.println("Integer ");
    }
    

}
