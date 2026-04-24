// ) Take N numbers in an array and print them

package INPUT;
import java.util.Scanner;
public class ArrayNNumbers 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr1[] = new int[size];
        for (int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        
        for(int num :arr1)
        {
            System.out.print(num+" ");
        }
    }
}
