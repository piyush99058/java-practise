//15. Write a Java Program to Find the Largest Element in Array
package GFG_JAVA_QUESTIONS;

public class LargestElement {
    public static void main(String [] args){
        
        int arr1[] = {13,26,39,52,65,78,1300,91,104,117,130,2};
        int n = arr1.length;
        int maxElement = arr1[0];
        for(int i=0;i<n;i++){
            if(arr1[i] > maxElement)
                {
                maxElement = arr1[i];
               }

        }
        System.out.println("maxElement->"+maxElement);
        


    }
}
