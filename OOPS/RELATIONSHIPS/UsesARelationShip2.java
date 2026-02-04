//Using method parameter.

package OOPS.RELATIONSHIPS;

class AU
{
    void Universal_Bank(){
        System.out.println("AU SMALL FINANCE BANK IS A UNIVERSAL BANK");
    }
}

class IT
{
    void IT_DEPARTMENT(AU au)
    {
        System.out.println("AU SMALL FINANCE BANK HAS AN IT DEPARTMENT WHICH HANDLES ALL IT RELATED STUFFS");
        au.Universal_Bank();
    }

}
class Operation{
    void AllOperations(AU au)
    {
        System.out.println("Operations department handles all works like account maintenance, Funds Transfer.");
        au.Universal_Bank();
    }


}

public class UsesARelationShip2 
{
    public static void main(String[] args) {
        
    
    AU au = new AU();
    IT it = new IT();
    Operation op = new Operation();

    op.AllOperations(au);
    it.IT_DEPARTMENT(au);


}
}