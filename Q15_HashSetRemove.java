import java.util.HashSet;
public class Q15_HashSetRemove {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.remove("Banana");
        System.out.println(fruits);
    }
}
