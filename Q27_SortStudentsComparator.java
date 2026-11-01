import java.util.ArrayList;
import java.util.Comparator;
public class Q27_SortStudentsComparator {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Devesh", 91.5));
        students.add(new Student(2, "Aman", 85.0));
        students.add(new Student(3, "Ravi", 88.5));

        students.sort(Comparator.comparingDouble(Student::getMarks));
        for (Student student : students) System.out.println(student);
    }
}
