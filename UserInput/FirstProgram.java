package UserInput;
import java.util.Scanner;
public class FirstProgram {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int rollNo = sc.nextInt();
        float marks = sc.nextFloat();

        System.out.println(name+"rollNo is"+rollNo+"he got marks"+marks);


    }
}
