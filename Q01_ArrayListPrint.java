import java.util.ArrayList;
public class Q01_ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        for (int number : numbers) System.out.println(number);
    }
}
