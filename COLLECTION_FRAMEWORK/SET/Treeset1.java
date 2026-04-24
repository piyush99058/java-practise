/*
Automatically sorts elements
No duplicates
Does not allow null
slower than Has set
 */

package COLLECTION_FRAMEWORK.SET;
import java.util.*;
public class Treeset1 {
    public static void main(String []args){
        Set<Character> set = new TreeSet<>();

        set.add('A');
        set.add('B');
        set.add('C');
        set.add('D');
        set.add('C');
        set.add('Z');
        set.add('Q');
        System.out.println(set);
    }
}
