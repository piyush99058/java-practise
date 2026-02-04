package GFG_JAVA_QUESTIONS;

public class ComplexNumber {
    int real;
    int imag;

    public ComplexNumber(int r, int i)
    {
        this.real = r;
        this.imag=i;
    }

    public void display()
    {
        System.out.println(this.real+"+i"+this.imag);
    }

    public  static ComplexNumber add(ComplexNumber n1, ComplexNumber n2){
        ComplexNumber result = new ComplexNumber(0, 0);
        result.real = n1.real + n2.real;
        result.imag = n2.imag + n2.imag;
        return result;


    }



    public static void main(String[] args) {
        ComplexNumber c1 =  new ComplexNumber(4,5);
        ComplexNumber c2 =  new ComplexNumber(5,6);

        System.out.println("First complex Number");
        c1.display();
        System.out.println("Second complex Number");
        c2.display();

        ComplexNumber res = add(c1,c2);

        System.out.println("Addition is ");
            res.display();
        

    }
}
