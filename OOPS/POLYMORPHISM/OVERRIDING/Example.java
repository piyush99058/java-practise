package OOPS.POLYMORPHISM.OVERRIDING;

class Animal{
    public void sound(){
        System.out.println("All animal sound");
    }
}

class Lion extends Animal{
    @Override
    public void sound(){
        System.out.println("Roar");
    }
}


class Tiger extends Animal{
    @Override
    public void sound(){
        System.out.println("Tiger sound");
    }
}



public class Example 
{
    public static void main(String[] args){
        Animal obj1 = new Tiger();
        Animal obj2 = new Lion();
        obj1.sound();
        obj2.sound();


    }
}
