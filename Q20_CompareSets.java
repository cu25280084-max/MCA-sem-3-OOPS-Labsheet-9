import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class Q20_CompareSets {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>(Arrays.asList("Banana", "Apple", "Mango"));
        LinkedHashSet<String> linkedSet = new LinkedHashSet<>(Arrays.asList("Banana", "Apple", "Mango"));
        TreeSet<String> treeSet = new TreeSet<>(Arrays.asList("Banana", "Apple", "Mango"));
        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedSet);
        System.out.println("TreeSet: " + treeSet);
    }
}
