/*
Step 1: Array arr with N size
Step 2: Initialise i=0 
Step 3: If(i<N-1) Check for any element arr[j] where j>i and arr[j]<arr[i] then Swap arr[i] and arr[j]
Step 4: i=i+1 and Goto Step 3
Step 5: Exit

 */

package GFG_JAVA_QUESTIONS.SORTING;

public class selectionSort 
{
    public static void sort(int arr1[])
    {
        int n = arr1.length;
        
        for(int i=0;i<n-1;i++)
        {
            int min_idx = i;
            for(int j = i + 1;j <n;j++ )  //here index of j > that i 
            {
                if (arr1[min_idx] > arr1[j])  //now checking for values
                {
                    min_idx = j;
                }
                
            }

            //swap
            int temp = arr1[min_idx];
            arr1[min_idx] = arr1[i];
            arr1[i] = temp;
        }


    }
    public static void main(String[] args) {
        int arr1[] ={13,52,36,39};
        sort(arr1);

        for(int num : arr1){
            System.out.print(num+" ");
        }
    }
}
