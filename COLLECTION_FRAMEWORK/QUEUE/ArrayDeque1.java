/*
-> Faster than Linked List
-> Entertain duplicates . 
*/
package COLLECTION_FRAMEWORK.QUEUE;

import java.util.*;
public class ArrayDeque1 {
    public static void main(String[] args) 
    {
        Queue<Character> queue = new ArrayDeque<>();
        queue.offer('A');
        queue.offer('B');
        queue.offer('C');
        queue.offer('D');
        queue.offer('D');
        System.out.println("Queue peek "+queue.peek()); //returns the top element of the list .

        while(!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }


    }
}
