package INPUT;
import java.util.Scanner;
public class MaximumNumber {
    public static void main(String [] args)
    {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of an array");
int size = sc.nextInt();
System.out.println("Input of an Array");

int arr1[] = new int[size];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }

for (int num:arr1)
    {
    System.out.print("output"+num+" ");
}
int max = arr1[0];
for(int i=0;i<arr1.length;i++){
    if(arr1[i] > max){
        max = arr1[i];
    }

}
System.out.println("Maximum->"+max);
    }
}
