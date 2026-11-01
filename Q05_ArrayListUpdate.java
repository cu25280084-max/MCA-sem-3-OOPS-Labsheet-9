import java.util.ArrayList;
public class Q05_ArrayListUpdate {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Aman");
        names.add("Ravi");
        names.set(1, "Devesh");
        System.out.println(names);
    }
}
