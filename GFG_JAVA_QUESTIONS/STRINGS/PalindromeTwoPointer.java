package GFG_JAVA_QUESTIONS.STRINGS;
import java.util.Scanner;
class PalindromeTwoPointer{
	public static boolean  checkPalindrome(String name)
	{
		name = name.toLowerCase();
		int i=0;
		int j=name.length() -1;
		while(i<j)
		{
			if(name.charAt(i) != name.charAt(j))
			{
				return false;
			}
			i++;
			j--;
			
		}
		
		return true;
	}
	public static void main(String [] args)
	{
	    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
		String name = sc.nextLine();
		boolean result = checkPalindrome(name);
		if(result == true){
			System.out.print("Palindrome");
		}
		else{
			System.out.print("Not Palindrome");
		}
	}
	
	
}