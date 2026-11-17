import java.util.*;
public class Assign1 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println("Print queue " + q);
        System.out.println("front element " + q.peek());
        System.out.println("Removed element " + q.poll());
        System.out.println("queue after removal " + q);
        if(q.isEmpty()) {
            System.out.println("queue empty");
        }
        else {
            System.out.println("queue empty");
        }
    }
}

