package MULTITHREADING.IMPORTANT_METHOODS;
//sleep() :

class wait extends Thread
{
    void print(){
    try
    {
        for(int i=0;i<3;i++)
        {
            Thread.sleep(1000);
            System.out.println("Iteration: " + i);
        }
}
    catch(Exception e)
    {
        System.out.println("Error handling"+e.getMessage());
    }
    }


}

public class sleep {
    public static void main(String[] args) {
        wait w1 = new wait();
        w1.print();
    }
}
