import java.util.PriorityQueue;
public class Q21_PriorityQueueAdd {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(40);
        queue.add(10);
        queue.add(30);
        queue.add(20);
        System.out.println(queue);
        System.out.println("Head element: " + queue.peek());
    }
}
