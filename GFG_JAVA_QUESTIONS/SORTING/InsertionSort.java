/*
🔹 How it Works

Assume the first element is already sorted
Pick the next element (called key)
Compare it with elements before it
Shift larger elements one position to the right
Insert the key at the correct position
*/

package GFG_JAVA_QUESTIONS.SORTING;

public class InsertionSort {
    static void insertionSort(int arr1[])
    {
        int n = arr1.length;

        for(int i=1;i<n;i++)
        {

            int key = arr1[i]; //elements to be played
            int j = i - 1;

            while(j>=0 && arr1[j] > key)
            {
                arr1[j+1] = arr1[j];
                j--;

            }
            arr1[j+1] = key; //placed key at correct position .

        }

        //move elements 




    }
    public static void main(String[] args) {
        
    
    int [] arr1 = {9,5,1,4,3};
    insertionSort(arr1);
        System.out.println("Sorted Array: ");
        for(int num :arr1){
            System.out.print(num+ " ");
        }
}
}