package GFG_JAVA_QUESTIONS.SORTING;
import java.util.*;
public class QuickSort {
    public static int partition(int arr1[], int low, int high)
    {
        int pivot = arr1[high];
        int i = (low -1);
        for(int j=low;j<high;j++)
        {
            if(arr1[j] <= pivot)
            {
                i++;
                int temp = arr1[i];
                arr1[i] = arr1[j];
                arr1[j] = temp;
            }
            
        }
        int temp = arr1[i+1];
        arr1[i+1] = arr1[high];
        arr1[high] = temp;

        return i+1;
    }


    public static void sort(int arr1[], int low, int high)
    {
        if(low < high)
        {
            int pi = partition(arr1,low,high);
            sort(arr1,low,pi-1);
            sort(arr1,pi+1,high);

        }


    }

    public static void main(String [] args){
        int arr1[] = {10,7,8,9,1,5};
        int n = arr1.length -1;
        sort(arr1,0,arr1.length-1);
        for(int num:arr1)
        {
            System.out.print(num+" ");
        }
    }
}
