import java.util.ArrayList;
import java.util.Iterator;
public class Q07_ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
