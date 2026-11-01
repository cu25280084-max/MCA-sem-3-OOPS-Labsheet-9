import java.util.LinkedList;
public class Q13_LinkedListGetEnds {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Roorkee");
        cities.add("Delhi");
        cities.add("Moradabad");
        System.out.println("First: " + cities.getFirst());
        System.out.println("Last: " + cities.getLast());
    }
}
