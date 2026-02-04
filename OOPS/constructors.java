package OOPS;
import java.util.Scanner;

 class A
 {
    String technology;
    int scope;

    A(String technology1, int popularity)
    {
        technology = technology1;
        scope = popularity;
    }

    public void printDetails()
    {
        System.out.println("Technology->"+technology);
        System.out.println("Technology->"+scope);
    }

    
}

public class constructors {
    public static void main(String[] args) {
        A obj = new A("Java",89);
        A obj1 = new A("KAFKA ",11);
        obj.printDetails();
        obj1.printDetails();

    }
}
