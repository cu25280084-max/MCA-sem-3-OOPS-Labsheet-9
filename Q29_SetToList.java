import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
public class Q29_SetToList {
    public static void main(String[] args) {
        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        List<Integer> list = new ArrayList<>(numbers);
        for (Integer number : list) System.out.println(number);
    }
}
