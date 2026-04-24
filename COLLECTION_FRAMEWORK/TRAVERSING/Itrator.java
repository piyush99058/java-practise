package COLLECTION_FRAMEWORK.TRAVERSING;
import java.util.*;
public class Itrator {
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList<>();
        l1.add(39);
        l1.add(52);
        l1.add(65);

        Iterator<Integer> itr = l1.iterator();
        //Iterator<Integer> itr = l1.iterator();
        

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
