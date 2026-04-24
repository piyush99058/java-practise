/*
Key : One null value allowed
value : multiple nulll values are allowed
synchronized : yes
Does not maintain any order 
Fast performance . 
 */
package COLLECTION_FRAMEWORK.MAP;
import java.util.*;
import java.util.HashMap;
public class HashMap1 {
    public static void main(String[] args) {
        Map<Integer, String>  m1 = new HashMap<>();
        m1.put(1, "Piyush");
        m1.put(2, "Varun kedia");
        m1.put(3, "Abhishek mehra");
        m1.put(1,"Sundar pichai");
        m1.put(null,"Null value");
        m1.put(4,"Peeyush bansal");
        m1.put(5,null);
        m1.put(null,"Null value2");

        System.out.println(m1);


    }
}
