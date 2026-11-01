import java.util.LinkedList;
import java.util.Queue;
public class Q24_QueueLinkedList {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        System.out.println("Queue: " + queue);
        queue.remove();
        System.out.println("After removing head: " + queue);
    }
}
