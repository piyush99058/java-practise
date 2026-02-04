package GFG_JAVA_QUESTIONS;

public class DecimalToBinary {
    static void DecimalToBinary(int n)
    {
            int BinaryNum[] = new int[1000];
            int i=0;
            while(n > 0)
            {   
                BinaryNum[i] = n % 2;
                n = n/2;
                i++;
            }
            //output
            for(int j=i-1;j>=0;j--)
            {
                System.out.print(BinaryNum[j]);
            }



    } 
    public static void main(String [] args){

        System.out.println("Decimal to Binary");
        DecimalToBinary(9);
        System.out.println("\n");
        DecimalToBinary(10);

    }
}
