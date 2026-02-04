package ARRAYS;
import java.util.Scanner;

public class TwoD
{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows,col;
    rows=sc.nextInt();
    col=sc.nextInt();
    int  arr1[][];

    arr1 = new int[rows][col];
    
    System.out.println("Input numbers");
    for (int i=0;i<arr1.length;i++)
        {
        for(int j=0;j<arr1[i].length;j++)
        {
        arr1[i][j] = sc.nextInt();
        }
        }
        System.out.println("The final Output");

    for(int i []:arr1)
    {
        for(int k:i){
            System.out.print(k+" ");
        }
        System.out.println();
    }

   }

}
