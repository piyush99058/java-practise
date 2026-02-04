package OOPS.RELATIONSHIPS;

class SmartBazaar{
    void Clothing_department()
    {
        System.out.println("Smart Bazaar have very big clothing department");
    }
    
    void Toys_section()
    {
        System.out.println("Smart Bazaar has very big toys section...");
    }

}

class Fruits{

    void freshVegetables(){
        System.out.println("smart bazaar has very fresh vegetables...");
    }
    SmartBazaar SB = new SmartBazaar();
    void printAllDetails()
    {
    SB.Clothing_department();
    SB.Toys_section();
    }

}


public class HasARelationship2 {
    public static void main(String [] args){

        Fruits f1 = new Fruits();
        f1.freshVegetables();
        f1.printAllDetails();
    }
}
