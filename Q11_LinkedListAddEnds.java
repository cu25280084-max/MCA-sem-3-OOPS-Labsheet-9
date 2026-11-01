import java.util.LinkedList;
public class Q11_LinkedListAddEnds {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Delhi");
        cities.addFirst("Roorkee");
        cities.addLast("Moradabad");
        System.out.println(cities);
    }
}
