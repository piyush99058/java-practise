package COLLECTION_FRAMEWORK.List;

import java.util.*;
// import java.util.ArrayList;
public class ArrayList {
    public static void main(String[] args) {
        List<String> list = new java.util.ArrayList<>();
        list.add("Java");
        list.add("Banana");
        list.add("Mango");
        list.add("java");
        
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(3));
        list.set(2,"springBoot");
        System.out.println(list.set(1,"HIBERNET"));
        System.out.println(list);
    }
}
