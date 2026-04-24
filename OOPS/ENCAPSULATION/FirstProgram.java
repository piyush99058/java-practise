/*
How Is Encapsulation Implemented in Java?

Encapsulation is achieved using:

1️⃣ private variables (Data hiding)
2️⃣ public getter and setter methods (Access control) */
package OOPS.ENCAPSULATION;
class ChristUniversity
{
    private String Student_Department;
    private int Student_id;
    
    void setDetails(String department,int id)
    {
        this.Student_Department = department;
        this.Student_id = id;
    }

    int getId(){
        return Student_id;
    }

    String getDepartment(){
        return Student_Department;
    }



}


public class FirstProgram {
    public static void main(String [] args)
    {
            
        ChristUniversity c1 = new ChristUniversity();
        c1.setDetails("CSE-JAVA PROGRAMMING", 240);
        int id = c1.getId();
        String dept = c1.getDepartment();

        System.out.println("Student ID is"+id+"and he bolngs to department"+dept);



    }
}
