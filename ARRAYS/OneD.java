package ARRAYS;
import java.util.Scanner;
public class OneD {
    public static void main(String [] args){
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int arr1[] = new int[size];
        System.out.println("Fill the values");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Output-");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
