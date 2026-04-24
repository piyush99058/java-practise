package MULTITHREADING;
//start -> process gets initiated , run() : running state , gets instruction .
class One extends Thread
{

    public void run()
    {
        System.out.println("Running");  //running .
        fast();
    }

    void fast()
    {
        System.out.println("Fast running");
    }

}

public class Extending_Thread 
{
    public static void main(String[] args) 
    {
        One t1 = new One();
        t1.start(); //runnable state  


    }
}
