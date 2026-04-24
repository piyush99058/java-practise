package DIAMOND_PROBLEM;

interface Books
{
default void description()
{
    System.out.println("Books are man best friends");
}
}

interface AtomicHabbits extends Books{}

interface HowToInfuencePeople extends Books{}

class BestBooks implements AtomicHabbits,HowToInfuencePeople
{
    @Override
    public void description()
    {
        HowToInfuencePeople.super.description();
    }
}


public class Java8 {
    public static void main(String[] args)
    {

BestBooks b1 = new BestBooks();
b1.description();

    }
}
