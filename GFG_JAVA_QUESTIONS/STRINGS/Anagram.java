package GFG_JAVA_QUESTIONS.STRINGS;
import java.util.Arrays;
public class Anagram {
    public static boolean areAnagrams(char arr1[], char arr2[])
    {
        int n = arr1.length;
        int m = arr2.length;
        if(n!=m)
        {
            System.out.println("Not an Anagram");
            return false;
        }
        //sort an array
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0;i<n;i++)
        {
            if(arr1[i] != arr2[i])
            {
                System.out.println("Not an anagrams");
                return false;
            }

        }
        return true;



    }
    public static void main(String[] args) 
    {
        char arr1[] = {'s','i','l','e','n','t'};
        char arr2[] = {'l','i','s','t','e','n','p'};
        boolean result = areAnagrams(arr1,arr2);
        if(result == true){
            System.out.println("Both the strings are anagram");
        }
        else{
            System.out.println("No anagrams");
        }
    }
}
