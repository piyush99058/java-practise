package MULTITHREADING;

class Three extends Thread
{
    public void run()
    {
        System.out.println("running");
        for(int i=0;i<5;i++)
        {

            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }

}
public class Multiple_Threads 
{
    public static void main(String[] args)
    {
        Three t1 =  new Three();
        Three t2 =  new Three();
        t1.start();
        t2.start();



    }
}
