package OOPS.ABSTRACTION.INTERFACE;

interface print{
   abstract  void printable();
}

class Document implements print{

   public void printable(){
        System.out.println("Printing Document");
   }
}

class Images implements print
{
public void printable(){
        System.out.println("Printing Images");
   }

}

public class CommonBehaviour {
    public static void main(String[] args) {
        print p1 = new Images();
        p1.printable();
        
         print p2 = new Document();
        p2.printable();



    }
}
