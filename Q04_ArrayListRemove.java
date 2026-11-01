import java.util.ArrayList;
public class Q04_ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.remove(0);
        numbers.remove(Integer.valueOf(30));
        System.out.println(numbers);
    }
}
