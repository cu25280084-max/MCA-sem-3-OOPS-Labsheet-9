import java.util.ArrayList;
import java.util.Collections;
public class Q09_ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Aman");
        names.add("Devesh");
        names.add("Ravi");
        Collections.reverse(names);
        System.out.println(names);
    }
}
