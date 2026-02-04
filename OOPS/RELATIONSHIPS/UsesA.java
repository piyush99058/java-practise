package OOPS.RELATIONSHIPS;

class Printer{
    String name="Java";
    public void PrinterDetails(String name){
        System.out.println(name+" is a very good printer");
    }
}

class work
{
    public void PrintingDocs()
    {
        Printer pr = new Printer();
        pr.PrinterDetails("Xerox");
    }


}


public class UsesA {
    public static void main(String []args){
        work w1 = new work();
        w1.PrintingDocs();


    }
}
