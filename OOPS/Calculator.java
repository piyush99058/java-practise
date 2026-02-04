package OOPS;

class User{
    int firstNumber;
    int secondNumber;

    public int add(){
        int Final = firstNumber + secondNumber;
        return Final;
    }

     public int subtract(){
        int Final = firstNumber - secondNumber;
        return Final;
    }

     public int multiply(){
        int Final = firstNumber * secondNumber;
        return Final;
    }

     public float divide(){
        float Final = (secondNumber / firstNumber);
        return Final;
    }
}

public class Calculator {
    public static void main(String [] args)
    {
        User u1 = new User();
        u1.firstNumber=90;
        u1.secondNumber=451;
        int sum = u1.add();
        System.out.println(sum);

        int diff = u1.subtract();
        System.out.println(diff);

        int mull = u1.multiply();
        System.out.println(mull);

        float div = u1.divide();
        System.out.println(div);



    }
}
