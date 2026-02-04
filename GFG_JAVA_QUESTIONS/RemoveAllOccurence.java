//19. Java Array Program to Remove All Occurrences of an Element in an Array
package GFG_JAVA_QUESTIONS;

import java.util.Arrays;

public class RemoveAllOccurence {

    public static int[] removeElements(int []a,int k){
        int ind =0;
        for(int i=0;i<a.length;i++){
            if(a[i] != k){
                a[ind++] = a[i];
            }

        }
        return Arrays.copyOf(a, ind);   
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,5,6,5,7,8,9,10,1};
        int k=5;
         arr1 = removeElements(arr1,k);
        System.out.println(Arrays.toString(arr1));
    }
}
