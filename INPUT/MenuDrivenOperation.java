
/*
10) Menu Driven Program (Loop Input)
📌 Show menu repeatedly:
Add
Subtract
Multiply
Exit
*/
package INPUT;

import java.util.Scanner;

public class MenuDrivenOperation {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter choice");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. divide");
        int res =0;

        int ch;

        
        do{
            
            System.out.println("First Number");
            int firstNum = sc.nextInt();
            System.out.println("Enter 2nd Number");
            int SecondNum = sc.nextInt();
            System.out.println("Enter choice");
            ch = sc.nextInt();
            switch (ch) {
                
            case 1:
                 res = firstNum + SecondNum;
                System.out.println(res);
                break;

            case 2:
                res = firstNum - SecondNum;
                System.out.println(res);
                break;

            case 3:
                res = firstNum * SecondNum;
                System.out.println(res);
                break;
            case 4:
                if(firstNum > SecondNum)
                {
                res = firstNum / SecondNum;
                System.out.println(res);
                break;
                }
            case 5:
                return;
            default:
                System.out.println("Print valid Option");
                break;
        }
        }
        while(ch != 5);
        


    }
    
}
