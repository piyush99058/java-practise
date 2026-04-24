//calling parent constructor
package General_Java_Concepts.SUPER;

class ClassMate
{

ClassMate(String name)
{
    System.out.println("name "+name);
}

}


class Navneet extends ClassMate
{

Navneet()
{
    super("Notebook");

}

}

public class callParentConstructor
{
    public static void main(String [] args)
    {

Navneet n1 = new Navneet();


    }
}
