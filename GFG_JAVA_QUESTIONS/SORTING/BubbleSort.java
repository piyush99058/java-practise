package GFG_JAVA_QUESTIONS.SORTING;

public class BubbleSort {
    public void sort(int arr1[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++)
                {

                if(arr1[j] > arr1[j+1])
                {
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;

                }

                }
        }
    }
    public static void main(String [] args)
    {
        BubbleSort BS = new BubbleSort();
        int arr1[] = {130,117,104,91};
        int n = arr1.length;
        BS.sort(arr1,n);
        System.out.println("Bubble sort");
        //output
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}
