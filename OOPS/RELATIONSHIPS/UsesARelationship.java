package OOPS.RELATIONSHIPS;

class Puneri_Tea{
    void print(){
        System.out.println("Puneri Tea Franchise has a branch all over Bangalore");
    }

}

class Kundanhalli_Branch{

    void Kundanhalli_Branch(){
        System.out.println("Puneri tea Franchise  has a branch in Kundanhalli gate , in front of empire restaurant");
    }

    void ShowDetails()
    {
        Puneri_Tea PT = new Puneri_Tea();
        PT.print();
    }
}

public class UsesARelationship {
    public static void main(String [] args){
        Kundanhalli_Branch k1 = new Kundanhalli_Branch();
        k1.Kundanhalli_Branch();
        k1.ShowDetails();
    }
}
