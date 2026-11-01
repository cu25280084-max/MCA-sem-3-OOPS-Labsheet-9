import java.util.LinkedHashSet;
public class Q19_LinkedHashSetOrder {
    public static void main(String[] args) {
        LinkedHashSet<String> languages = new LinkedHashSet<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Java");
        System.out.println(languages);
    }
}
