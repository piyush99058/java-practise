package MULTITHREADING;

class Two implements Runnable
{

    public void run()
    {
        System.out.println("Running");
    }


}

public class Implements_Runnable {
    public static void main(String[] args) 
    {
        Two t1 = new Two();
        Thread tx = new Thread(t1);
        tx.start();


    }
}
