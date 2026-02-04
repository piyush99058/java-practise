//15. Write a Java Program to Find the Largest Element in Array
// package GFG_JAVA_QUESTIONS;

public class APP2{
    public static void main(String [] args){
        int maxElement = 0;
        int arr1[] = {13,26,39,52,65,78,1300,91,104,117,130,2};
        int n = arr1.length;
        int i =0;
        while(i<n){
			
            System.out.println("Entering while loop");
             if(arr1[i] > arr1[n-1])
                {
                maxElement = arr1[i];
                n++;
                }
            else{
                maxElement = arr1[n-1];
                i++;
            }
            
                

        }
        System.out.println("maxElement->"+maxElement);
        


    }
}
