import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("JAVA List Interface");

        ArrayList<String> arrayList = new ArrayList<>();//create arraylist
        arrayList.add("David");//add elements
        arrayList.add("Marsh");
        arrayList.add("Smith");
        arrayList.add("David");

        System.out.println(arrayList);//ptint arrayList
        System.out.println(arrayList.size());//size of arrayList

        Iterator iterator = arrayList.iterator();//access element one by one
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        arrayList.remove(1);// remove elements

        //access element one by one using for
        for (String s : arrayList) {
            System.out.println(s);
        }


        // Sort arraylist
        Collections.sort(arrayList);
        System.out.println(arrayList);

        System.out.println("::::::::::::::::::::::::");
        System.out.println("ArrayList with USer Defined Objects");

        ArrayList<Parent> parentArrayList = new ArrayList<>();
        Parent parent = new Parent(1,2,3);
        Parent parent1 = new Parent(4,5,6);

        parentArrayList.add(parent);
        parentArrayList.add(parent1);

        System.out.println(parentArrayList);

        for (Parent value : parentArrayList) {
            System.out.println(value.a);
        }

    }



}