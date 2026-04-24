package MULTITHREADING;


class JavaDevelopment extends Thread
{
    
    public void run(){
        while(true)
    {
        System.out.println("Running state");
        try{
        Thread.sleep(1000);
    }
    catch(InterruptedException e1)
    {
        e1.getMessage();
    }
    }
    }

}
public class DaemonThread {
    public static void main(String [] args){
        // Thread t1 = new Thread();
        JavaDevelopment j1 = new JavaDevelopment();
        j1.setDaemon(true);
        j1.start();

        System.out.println("Main thread ends");
    }
}
