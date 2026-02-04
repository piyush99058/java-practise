//9) 2D Array Input (Matrix) and print it
package INPUT;
import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of rows");
        int size = sc.nextInt();
        System.out.println("Enter size of cols");
        int size2 = sc.nextInt();
        int arr1[][] = new int [size][size2];
        for(int i=0;i<arr1.length;i++)
            {
            for(int j=0;j<arr1[i].length;j++)
            {
                arr1[i][j] = sc.nextInt();
            }
            }
        for(int i=0;i<arr1.length;i++)
            {
            for(int j=0;j<arr1[i].length;j++)
            {
                System.out.print(arr1[i][j]+ " ");
            }
            System.out.println();
            }





    }
}
