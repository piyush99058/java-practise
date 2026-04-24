package MULTITHREADING;

 class Daemon_Thread1 extends Thread
{
    public void run()
    {
        while(true){
            System.out.println("Daemon thread is running");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }

    }

}


public class Daemon_thread {
    public static void main(String[] args) 
    {
        Daemon_Thread1 t1 = new Daemon_Thread1();
        t1.setDaemon(true); //marked thread as daemon
        t1.start();

        System.out.print("Main thread running");
        try{
            Thread.sleep(3000);

        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Main thread ends");





    }
}
