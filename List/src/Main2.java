import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args){
        System.out.println("::::::::::::::: Linked List ::::::::::::::::");
        LinkedList<String> list = new LinkedList<>();
        // add elements
        list.add("Maths");
        list.add("Science");
        list.add("Arts");
        list.add("Music");
        list.add("Maths");
        list.remove(4);

        Collections.sort(list);
        System.out.println(list);


        System.out.println("::::::::::::::: Stack ::::::::::::::::");
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.add(4);

        System.out.println(stack);
    }
}
