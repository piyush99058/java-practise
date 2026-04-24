// Online Java Compiler
// Use this editor to write, compile and run your Java code online
package OOPS.RELATIONSHIPS;

class HasARelationship3 
{
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        HouseOfDragons hd = new HouseOfDragons();
        hd.showAll();
    }
}

class GOT
{
    String character;
    int rating;
    boolean Acting;
    float performanceNumber;
    char grade;
    
    GOT(String character,int rating,boolean Acting,float performanceNumber,char grade){
        this.character = character;
        this.rating = rating;
        this.Acting= Acting;
        this.performanceNumber = performanceNumber;
        this.grade=grade;
    }
    
    void printDetails()
    {
        System.out.println("Charcter : "+character+" rating : "+rating+"Acting : "+Acting+"performanceNumber : "+performanceNumber+"grade : "+grade);
    }

}

class HouseOfDragons 
{
    //GOT got = new GOT("Danerays Targerian",9,true,97.90,'A');
    GOT got;
    void showAll()
    {
        got = new GOT("Danerays Targerian",9,true,97.90f,'A');
        System.out.println("All details are here :");
        got.printDetails();
    }
    
}

