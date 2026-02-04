public class GradingSystem {
    public static void main(String[] args)
    {
        int studentsMarks =  88;
        if (studentsMarks >= 90){
            System.out.println("Grade A");
        }
        else if(studentsMarks >= 50)
        {
            System.out.println("Grade B");
        }
        else if(studentsMarks >= 70){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
        }
    }
}
