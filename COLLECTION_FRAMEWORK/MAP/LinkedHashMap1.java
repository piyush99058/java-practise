/*
maintains insertion order
Allow one null key
Slightely slower than HashMap.
 */
package COLLECTION_FRAMEWORK.MAP;
import java.util.*;
public class LinkedHashMap1 {
    public static void main(String[] args) 
    {
        
        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"Zepto");
        map.put(2,"Blinkit");
        map.put(3,"Porter");
        map.put(null,"Zomato");

        System.out.println(map);
        

        
    }
}
