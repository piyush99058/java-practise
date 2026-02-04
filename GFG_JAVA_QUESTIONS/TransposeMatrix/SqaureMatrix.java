package GFG_JAVA_QUESTIONS.TransposeMatrix;
import java.util.*;
public class SqaureMatrix {
    final static int N=3;
    

     public static void Transpose(int arr1[][], int arr2[][])
    {
        int i,j;
        // System.out.println("Transpose");
        for(i=0;i<N;i++)
            {
            for(j=0;j<N;j++){
                arr2[i][j] = arr1[j][i];
            }
            // System.out.println("Transpose");
            }


    }

    public static void main(String[] args) 
    {
        int arr1[][] = {{1,1,1},
                        {2,2,2},
                        {3,3,3}
        };


        int arr2[][] = new int[N][N],i,j;
        Transpose(arr1, arr2);
        // int i,j;
        
        for(i=0;i<N;i++){
            for(j=0;j<N;j++)
                {
                System.out.print(arr2[i][j]+ " ");
                }
            System.out.println();
        }
    }
}
