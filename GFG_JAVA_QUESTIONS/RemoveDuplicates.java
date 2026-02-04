package GFG_JAVA_QUESTIONS;
//Removing elements from an array
//Note:- Only works for sorted arrays.

public class RemoveDuplicates {

    public static int duplicatesRemoval(int arr1[])
    {
        if(arr1.length == 0)
        {
            return 0;
        }

        int j=0;
        int n = arr1.length;
        for(int i=1;i<n;i++)
        {
            if(arr1[i] != arr1[j])
            {
                j++;
                arr1[j] = arr1[i];
                 
            }
            


        }
        return j+1;
    }

    public static void main(String[] args) {
        int arr1[] = {13,26,39,40,41,41,52,65,};
        int k = duplicatesRemoval(arr1);
        System.out.println("Count of unique elements"+k);

        //output extracting all elements
        for(int i=0;i<k;i++)
        {
            System.out.print(arr1[i]+" ");
        }

    }
}
