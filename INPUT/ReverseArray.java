//7) Reverse an array and print it
package INPUT;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr1[] = new int[size];
        
        //taking input
        System.out.println("Taking input");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }

        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        //Reversed Array
        
        System.out.println("Reversed Array");
       for(int i=arr1.length - 1;i>=0;i--)
    {
        System.out.print(arr1[i]+" ");
    }

    }
}
