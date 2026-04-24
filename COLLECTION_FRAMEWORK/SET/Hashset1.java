package COLLECTION_FRAMEWORK.SET;

import java.util.*;
public class Hashset1 {
    public static void main(String[] args) {
        Set<String> set = new java.util.HashSet<>();
        //Set <String> set = new java.util.HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("SpringBoot");
        set.add("KAFKA");
        set.add(null);

        System.out.println(set);


    }
}
