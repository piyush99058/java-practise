package JAVA8.MethodReference;

interface Message{
    Test getMessage(String msg);

}

class Test{
    Test(String msg){
        System.out.println(msg);
    }
}
public class ReferenceToConstructor {
    public static void main(String[] args) {
        
        Message m1 = Test::new;  //Use test constructor to create any objects . -  Just storing a reference to a construcor . 
        m1.getMessage("Hello constructor Reference"); //object is only created when we call . 

    }
}
