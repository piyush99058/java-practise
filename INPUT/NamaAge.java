//3) Take a name and age and print in a sentence
package INPUT;
import java.util.Scanner;
public class NamaAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Enter Name");
        String name = sc.nextLine();
        System.out.println("Name of customer is->"+name+" and age is->"+age);
    }
}
