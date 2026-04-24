package SEARCHING_ALGORITHMS;

public class BinarySearch {
public static int BinarySearch(int arr1[],int start,int end,int k){
    
    System.out.println("Starting while loop");
    while(start < end)
        {
            int mid = (start + end)/2;
             if(arr1[mid] == k){
                return mid;
             }
             else if (arr1[mid] > k) {
                end = mid -1;
             }
             else{
                start = mid + 1;
             }

        }
        System.out.println("-1");
        return -1;
}

    public static void main(String [] args)
    {

        int arr1[] = {13,26,39,52,65,78,91,104,117};
        int n = arr1.length;
        int z1 = BinarySearch(arr1,0,n ,78);
        System.out.println("Element found at index"+z1);


    }
}
