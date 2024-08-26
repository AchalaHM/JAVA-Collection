import java.util.ArrayDeque;

public class Main3 {
    public static void main(String[] args){

        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Achala");
        arrayDeque.add("Punsara");
        arrayDeque.add("Vinuri");
        arrayDeque.add("Ridmika");

        //arrayDeque.addFirst("::::");
        arrayDeque.addLast("::::");

        System.out.println(arrayDeque);
        System.out.println(arrayDeque.getFirst());


    }
}
