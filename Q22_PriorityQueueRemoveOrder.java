import java.util.PriorityQueue;
public class Q22_PriorityQueueRemoveOrder {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(40);
        queue.add(10);
        queue.add(30);
        queue.add(20);
        while (!queue.isEmpty()) System.out.println(queue.poll());
    }
}
