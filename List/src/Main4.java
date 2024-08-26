import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main4 {
    public static void main(String[] args){
        System.out.println(":::::::::: HashSet :::::::::::");

        HashSet<Integer> set = new HashSet<>();
        set.add(7);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);


        Iterator itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println(":::::: LinkedHshSet ::::::::");
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(7);
        linkedHashSet.add(4);
        linkedHashSet.add(3);
        linkedHashSet.add(2);

        System.out.println(linkedHashSet);

        System.out.println(":::::: TreeSet ::::::::");
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(7);
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(2);

        System.out.println(treeSet);
    }
}
