package COLLECTION_FRAMEWORK.TRAVERSING;
import java.util.*;
public class ForEach 
{
    public static void main(String[] args) 
    {
        List <Integer> arr1 = new java.util.ArrayList<>();
        arr1.add(13);
        arr1.add(26);
        arr1.add(39);

        for(int num : arr1){
            System.out.print(num+" ");
        }

    }
}
