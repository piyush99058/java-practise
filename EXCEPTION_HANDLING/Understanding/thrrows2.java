package EXCEPTION_HANDLING.Understanding;

public class thrrows2 {
    public void methodBody(String name) throws NullPointerException
    {
        if(name == null)
        {
            throw new NullPointerException("Null string");
        }
        else
        {
            System.out.println("No error");
        }
    }
public static void main(String[] args)
{
        

thrrows2 t2 = new thrrows2();
try
{
t2.methodBody(null);
}

catch(NullPointerException n1)
{
    System.out.println("NullpointerException"+n1.getMessage());
}

    }
}
