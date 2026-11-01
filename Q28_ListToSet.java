import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
public class Q28_ListToSet {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java", "Python", "Java", "C++", "Python");
        Set<String> uniqueNames = new LinkedHashSet<>(names);
        System.out.println("List: " + names);
        System.out.println("Set: " + uniqueNames);
    }
}
