//14. Write a Java Program to Compute the Sum of Array Elements.

package GFG_JAVA_QUESTIONS;
class ArraysSum{
    public static void main(String[] args) {
        int arr1[] = {2, 4, 6, 7, 9};
        int sum=0;
        for(int i=0;i<arr1.length;i++){
            sum+=arr1[i];
        }
        System.out.println("Arrays sum->"+sum);

    }
}