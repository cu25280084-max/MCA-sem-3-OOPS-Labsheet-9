import java.util.HashSet;
import java.util.Iterator;
public class Q16_HashSetIterator {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
