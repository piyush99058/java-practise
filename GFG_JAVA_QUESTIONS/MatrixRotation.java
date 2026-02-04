//Rotate an Array by d - Counterclockwise or Left
package GFG_JAVA_QUESTIONS;
import java.util.*;
public class MatrixRotation {

    public static void RotateArrays(int arr1[], int d)
    {
        int n = arr1.length;
        for(int i=0;i<d;i++)
        {
            int first = arr1[0];
            
            for(int j=0;j<n-1;j++)
            {
                arr1[j] = arr1[j+1];


            }
            arr1[n-1] = first;

        }

   

    }
     public static void display1(int []arr1)
     {
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = {12,24,36,48,60};
        int d=2;

        RotateArrays(arr1,d);
        display1(arr1);



    }
}
