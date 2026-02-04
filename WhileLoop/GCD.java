package WhileLoop;

public class GCD {
    public static void main(String [] args){
        int a=24;
        int b=36;
        while(b!=0){
            int result = a % b;
            a =b;
            b = result;
        }
        System.out.println(a);
    }
}
