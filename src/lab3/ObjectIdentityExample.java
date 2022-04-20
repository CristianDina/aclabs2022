package lab3;

import java.util.Set;
import java.util.TreeSet;

public class ObjectIdentityExample {

    public static void main(String[] args) {
        Student alexandra = new Student(32422, "Alexandra");
        Student sebi = new Student(11321, "Sebi");
        Student student = new Student(11321, "Sebi");

        Set<Student> students = new TreeSet<>();
        students.add(sebi);
        students.add(alexandra);
        students.add(student);

        System.out.println(students);

    }
}
