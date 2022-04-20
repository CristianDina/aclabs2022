package lab3;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private Integer uid;
    private String name;

    public Student(Integer uid, String name) {
        this.uid = uid;
        this.name = name;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return uid.equals(student.uid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid);
    }

    @Override
    public int compareTo(Student s) {
        if(this.uid > s.getUid())
            return 1;
        else if(this.uid < s.getUid())
            return -1;
        else
            return 0;
    }
}
