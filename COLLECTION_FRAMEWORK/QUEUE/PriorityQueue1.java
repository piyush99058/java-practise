//Important points
/*
-> Does not follow FIFO strictly .
-> Follows normal sorting . 
-> Entertain Duplicates
 */

package COLLECTION_FRAMEWORK.QUEUE;
import java.util.*;
public class PriorityQueue1 {
    public static void main(String [] args)
    {
    PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Piyush");
        queue.offer("Ankit Singh");
        queue.offer("Varun kedia");
        queue.offer("Varun kedia");
        System.out.println(queue);

        while(!queue.isEmpty()){
            System.out.print(queue.poll() + " ");
        }
    }
}
