package COLLECTION_FRAMEWORK.MAP;
import java.util.*;
public class entrySet {
    public static void main(String[] args)
    {

        Map <String,Integer> mp = new HashMap<>();
        mp.put("Maths",98);
        mp.put("Physics",90);
        mp.put("Chemistry",91);

        for(Map.Entry<String,Integer> entry : mp.entrySet())
        {
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }

    }
}
