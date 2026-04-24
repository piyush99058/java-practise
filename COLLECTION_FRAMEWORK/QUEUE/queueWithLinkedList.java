/*
IMPORTNAT POINTS 
(i) Does Not entertain Duplicates.
(ii) Follows FIFO
(iii) mainly used in buffering . 
(iv) No Index based

*/

package COLLECTION_FRAMEWORK.QUEUE;


import java.util.*;
public class queueWithLinkedList {
    public static void main(String[] args) {
     
      Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.offer("C");

        System.out.println(queue); //A,B,C
        queue.poll(); //Removes A
        System.out.println(queue);

      };  

    }

