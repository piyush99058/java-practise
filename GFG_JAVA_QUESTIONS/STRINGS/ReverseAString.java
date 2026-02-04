//Reverse a string
package GFG_JAVA_QUESTIONS.STRINGS;
import java.util.Scanner;
public class ReverseAString {

    public static String reverse(String name){
        int n = name.length() - 1;
        String rev ="";
        for(int i=n;i>=0;i--){
        rev = rev + name.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String Final_name = reverse(name);
        System.out.println(Final_name);



    }
}
