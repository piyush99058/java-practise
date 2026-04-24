package COLLECTION_FRAMEWORK.MAP;

import java.util.HashMap;
import java.util.Map;

public class keySet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Math", 90);
        map.put("Science", 85);
        map.put("Physics", 81);

        for(String key : map.keySet()){

            System.out.println(key + " = "+map.get(key));
        }
    }
}
