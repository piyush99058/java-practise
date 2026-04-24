package MULTITHREADING.INTERTHREAD_COMMUNICATION;
class sharedResource{
    int data;
    boolean hasData;

    synchronized public void produce(int data)
    {
    try
    {
        while(hasData)
        {
            wait();
        }

        System.out.println("Data ->"+data);
        this.data=data;
        hasData = true;
        notify();
    }
    catch(InterruptedException e)
    {
System.out.println(e.getMessage());
    }   }

synchronized public void consume()
    {
    try
    {
        while(!hasData)
        {
            wait();
        }

        System.out.println("consumed data ->"+data);
        
        hasData = false;
        notify();
    }
    catch(InterruptedException e)
    {
System.out.println(e.getMessage());
    }  
 }
}


class Producer implements Runnable
{

sharedResource sr;
Producer(sharedResource sr)
{
    this.sr = sr;
}

public void run(){
    for(int i=0;i<5;i++){
        sr.produce(1);
    }

}

}

class consumer implements Runnable
{

sharedResource sr;
consumer(sharedResource sr)
{
    this.sr = sr;
}

public void run(){
    for(int i=0;i<5;i++){
        sr.consume();
    }

}

}

public class ProducerConsumer
{

    public static void main(String [] args)
    {
        sharedResource sr1 = new sharedResource();
        Producer p1 = new Producer(sr1);
        consumer c1 = new consumer(sr1);
        
        Thread producerThread = new Thread(p1);
        Thread consumerThread = new Thread(c1);
        producerThread.start();
        consumerThread.start();
    }
}