package GFG_JAVA_QUESTIONS.SEARCHING_ALGORITHMS;

public class LinearSearch {
    public static void main(String[]args){
        int arr1[] = {13,26,39,52,65,78,91,104,117,130};
        int x =91;

        for(int i=0;i<arr1.length;i++){
            if(arr1[i] == x){
                System.out.println("Element found at index"+i);
            }
            System.out.println("\n");
            System.out.print(arr1[i]+" ");
        }

        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        
    }
}
