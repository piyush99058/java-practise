package OOPS.ABSTRACTION.INTERFACE;
import java.util.*;

interface Vehicle
{
    int speed = 100; //public,static final.

    void run();   //public, abstract

    default void fuel()
    {
        System.out.println("Petrol");
    }

    static void type()
    {
        System.out.println("Car");
    }

}


public class Interview_Ques_Interface implements Vehicle
{
    public void run()
    {
        System.out.println("Running at "+speed);
    }




public static void main(String[] args)
{
Interview_Ques_Interface c1 = new Interview_Ques_Interface();
c1.run();
c1.fuel();

Vehicle.type();
System.out.println("Vehicle speed"+Vehicle.speed);



    }
}
