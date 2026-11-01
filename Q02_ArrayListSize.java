import java.util.ArrayList;
public class Q02_ArrayListSize {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Elements: " + numbers);
        System.out.println("Size: " + numbers.size());
    }
}
