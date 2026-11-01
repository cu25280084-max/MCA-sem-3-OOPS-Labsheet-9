import java.util.ArrayList;
public class Q06_ArrayListForEach {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Java");
        names.add("Python");
        names.add("C++");
        for (String name : names) System.out.println(name);
    }
}
