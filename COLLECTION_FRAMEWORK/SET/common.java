//Set is an interface in Java that stores unique elements and does not allow duplicates.
package COLLECTION_FRAMEWORK.SET;
import java.util.*;
public class common {
    public static void main(String [] args)
    {
        Set<Integer> set = new HashSet<>();
        set.add(13);
        set.add(26);
        set.add(39);
        set.add(52);
        set.add(65);

        System.out.println("20 is present :"+set.contains(52));
        System.out.println("set size : "+set.size());
        System.out.println("remove 13 : "+set.remove(13));

        //Traversing set

        for(int num : set){
            System.out.print("Trvaesing elements through for-each loop"+num +" ");
        }

        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext()){
            System.out.print("Iterator : "+itr.next());
        }

    }
}
