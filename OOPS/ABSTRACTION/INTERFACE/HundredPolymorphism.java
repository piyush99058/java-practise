package OOPS.ABSTRACTION.INTERFACE;


interface Engine{
abstract void m1();
abstract void m2();

}

class Car implements Engine{
     public void m1(){
        System.out.println("Car started");
    }

     public void m2(){
        System.out.println("Car Stoped");
    }
}

class HondaCity implements Engine{
     public void m1(){
        System.out.println("HondaCity Car started");
    }

     public void m2(){
        System.out.println("Hondacity Car Stoped");
    }
}


public class HundredPolymorphism {
    public static void main(String [] arge)
    {
        Engine obj1 = new Car();
        obj1.m1();
        obj1.m2();

        Engine obj2 = new HondaCity();
         obj2.m1();
         obj2.m2();
    } 
}
