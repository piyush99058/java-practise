// ✅ 2) Take 2 numbers and print sum, subtraction, multiplication, division
package INPUT;
import java.util.Scanner;
public class TwoInteger {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a +b;
        int mul = a*b;
        int div=0;
        if(a > b){
             div = a/b;
            System.out.println(div);
        }
        System.out.println("sum"+sum);
        System.out.println("Mul"+mul);
        System.out.println("Div"+div);
    }
}
