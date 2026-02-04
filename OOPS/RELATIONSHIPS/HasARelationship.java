package OOPS.RELATIONSHIPS;

class Flipkart{
    String Flipkart_Minutes;
    int rating;
    boolean successFul;

    Flipkart(String Flipkart_Minutes,int rating,boolean successFul)
    {
        this.Flipkart_Minutes = Flipkart_Minutes;
        this.rating=rating;
        this.successFul=successFul;
    }

    void printAllDetails(){
        System.out.println("New Product->"+Flipkart_Minutes+" and having rating of"+rating+" and is asuccessful brand->"+successFul);
    }
}

class SuperCoin
{
    String Payments;
    boolean FutureScope;
    int marketCap;

    Flipkart f11;

    SuperCoin(String Payments,boolean FutureScope,int marketCap)
    {
    this.Payments=Payments;
    this.FutureScope=FutureScope;
    this.marketCap=marketCap;
        f11 = new Flipkart(Payments, marketCap, FutureScope);
    }

     
    // f1.printAllDetails();
    
    

    void SuperCoinDetails()
    {
    
        System.out.println("1."+Payments+"2."+FutureScope+"3."+marketCap);
        f11.printAllDetails();
    }
}


public class HasARelationship {
    public static void main(String [] args){

        SuperCoin S1 = new SuperCoin("Supercoins", true,1200000000);
        S1.SuperCoinDetails();

    }
}
