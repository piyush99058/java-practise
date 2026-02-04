package OOPS.POLYMORPHISM.OVERLOADING;

class Microsoft
{

    void ProductInfo(String name,int rating,boolean FutureScope)
    {
        System.out.println(name+" "+rating+" "+FutureScope);
    }

    void ProductInfo(String name,int rating)
    {
        System.out.println(name+" "+rating);
    }

    void ProductInfo(String name)
    {
        System.out.println(name);
    }

    public static void main()
    {
        System.out.println("Main Method");
    }

}

public class funcOverLoad {
    
public static void main(    String[] args) 
{
    Microsoft m1 = new Microsoft();
    m1.ProductInfo("Microsoft Teams",9,true);
    m1.ProductInfo("Microsoft Azure");
    m1.ProductInfo("Xbox",10);
    m1.main();

}


}
