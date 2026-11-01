import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
public class Q30_ClearCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3));
        Queue<String> queue = new LinkedList<>(Arrays.asList("One", "Two", "Three"));

        list.clear();
        set.clear();
        queue.clear();

        System.out.println("List after clear: " + list);
        System.out.println("Set after clear: " + set);
        System.out.println("Queue after clear: " + queue);
    }
}
