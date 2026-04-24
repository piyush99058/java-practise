package PojoAndJavaBean;
import java.io.Serializable;
public class javaBean implements Serializable {
    private int id;           //private variables
    private String name;

    public javaBean() {}  //no-args constructor

    public int getId(){     //public getter id 
        return id;
    }

    public void setId(int id)  //public setter method
    {
        this.id = id;
    }

    public String getName() //public getter method
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }


    public static void main(String[] args)
    {
        javaBean j1 = new javaBean();
        j1.setId(870359);
        j1.setName("Piyush");
        System.out.println("Output");
        System.out.println(j1.getId());
        System.out.println(j1.getName());


    }
}
