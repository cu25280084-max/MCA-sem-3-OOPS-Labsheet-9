import java.util.LinkedList;
public class Q12_LinkedListRemoveEnds {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Roorkee");
        cities.add("Delhi");
        cities.add("Moradabad");
        cities.removeFirst();
        cities.removeLast();
        System.out.println(cities);
    }
}
