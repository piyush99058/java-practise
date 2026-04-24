package JAVA8.MethodReference;

public class ReferenceParticularObject 
{

    public void JavaDevelopment()
    {
        System.out.println("I am java developer");
    }
    public static void main(String[] args) 
    {
       ReferenceParticularObject r1 = new ReferenceParticularObject();
       Runnable r = r1::JavaDevelopment; 
        r.run();
    }
}
