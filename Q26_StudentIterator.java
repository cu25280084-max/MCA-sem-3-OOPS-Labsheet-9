import java.util.ArrayList;
import java.util.Iterator;
public class Q26_StudentIterator {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Devesh", 91.5));
        students.add(new Student(2, "Aman", 85.0));
        students.add(new Student(3, "Ravi", 88.5));

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
