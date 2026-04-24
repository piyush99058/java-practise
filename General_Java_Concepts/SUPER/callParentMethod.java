package General_Java_Concepts.SUPER;

class Animal{

    void show(){
        System.out.println("Animal sound");
    }
}

class Dog extends Animal
{
    void show(){
    super.show();
    System.out.println("Bark");
    }
    
}

public class callParentMethod {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.show();



    }
}
