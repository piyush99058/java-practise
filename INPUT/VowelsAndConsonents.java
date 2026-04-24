//8) Take a string and count vowels & consonants
package INPUT;
import java.util.Scanner;

public class VowelsAndConsonents 
{
    public static void main(String[] args)
    {
        
        int vowelCount=0;
        int ConsonentCount=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String name = sc.nextLine();
        String nameLowerCase = name.toLowerCase();
        for(int i=0;i<nameLowerCase.length();i++)
        {
            char ch =   nameLowerCase.charAt(i);      

            if(ch == 'a' || ch =='e' || ch =='i' || ch =='o' || ch =='u')
            {
                vowelCount++;
            }

            else
            {
                ConsonentCount++;
            }
        }

            System.out.println("Vowel count->"+vowelCount);
            System.out.println("Consonents count->"+ConsonentCount);

    }
}
