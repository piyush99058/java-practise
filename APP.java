
//vowels and consonents
import java.util.Scanner;
class APP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    String nameStr = name.toLowerCase();
    int vowelCount = 0;
    int ConsonentCount =0;
    
    for(int i=0;i<nameStr.length();i++)
    {
        char ch = nameStr.charAt(i);
           if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u')
           {
               vowelCount++;
           } 
           else
           {
               ConsonentCount++;
           }
        
    }
    System.out.println("Final vowel count"+vowelCount);
        System.out.println("Final consonent count"+ConsonentCount);
        
    
    
        
    }
}