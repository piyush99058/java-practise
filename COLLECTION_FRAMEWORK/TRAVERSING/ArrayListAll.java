package COLLECTION_FRAMEWORK.TRAVERSING;

import java.util.*;
public class ArrayListAll {
    public static void main(String[] args) 
    {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("Python");
        list.add("springBoot");
        list.add("Hibernet");

        //display
        System.out.println("List"+list);
        //get
        System.out.println("First :"+list.get(0));
        //replace
        System.out.println("replace :"+list.set(2,"KAFKA"));
        //Remove
        System.out.println(list.remove(0));
        //size
        System.out.println("size"+list.size());

        //Traverse
        System.out.println("Elements :");
        for(String s : list){
            System.out.println(s);
        }


    }
}
