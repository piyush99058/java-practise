package GFG_JAVA_QUESTIONS.STRINGS;
import java.util.Scanner;
public class PalindromeString {
    public static boolean checkPalindrome(String name)
    {
        name =name.toLowerCase();
        String rev ="";
        for(int i=name.length()-1;i>=0;i--){
            rev = rev + name.charAt(i);
        }

        return name.equals(rev);

    }
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name->");
        String name = sc.next();
        boolean status = checkPalindrome(name);
        if(status == true){
            System.out.println(name+" is a palindrome");
        }
        else{
            System.out.println(name+" is  not a palindrome");
        }
    }
}
