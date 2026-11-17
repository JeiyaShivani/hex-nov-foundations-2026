import java.util.*;
public class Assign2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("print list " + list);
        list.addFirst(5);
        System.out.println("After adding first " + list);
        list.addLast(40);
        System.out.println("After adding last " + list);
        System.out.println("First element " + list.getFirst());
        System.out.println("Last element " + list.getLast());
        list.removeFirst();
        System.out.println("After removing first " + list);

        list.removeLast();
        System.out.println("After removing last " + list);
        System.out.println("Element at index 1 " + list.get(1));
        if(list.isEmpty()) {
            System.out.println("List is empty");
        }
        else {
            System.out.println("List is not empty");
        }
    }
}
