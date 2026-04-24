// ✅ 6) Count even and odd numbers in an array
package INPUT;
import java.util.Scanner;
public class OddEven {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int ODD=0;
        int EVEN=0;
        int arr1[] = new int[3];
        System.out.println("Input arrays");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        } 

        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i] % 2 == 0)
            {                   //logic
                EVEN+=1;
            }
            else
            {
                ODD=+1;
            }
        }
        System.out.println("ODD number count->"+ODD);
        System.out.println("ODD number count->"+EVEN);
    }
}
