import java.util.*;
public class Hashset {
    
    public static void main(String[] args) {
        HashSet<Integer>set = new HashSet<>();

        //add
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(6);
        set.add(5);

        //contains
        if(set.contains(1)){
            System.out.println("set contains 1");
        }

        if(!set.contains(5)){
            System.out.println("set does not contains 5");
        }

        //delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("set does not contains 1");
        }

        //size
        int len = set.size();
        System.out.println(len);

        //to print all element of the set
        System.out.println(set);

        //iterator
        //set has no index
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
