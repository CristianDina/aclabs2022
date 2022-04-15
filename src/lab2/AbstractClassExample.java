package lab2;

abstract class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void study() {
        System.out.println(name + " is studying");
    }

    public abstract void goToSchool();
}

class PoliStudent extends Student {
    public PoliStudent(String name) {
        super(name);
    }

    @Override
    public void goToSchool() {
        System.out.println(getName() + " goes to Poli.");
    }
}

class UvtStudent extends Student {
    public UvtStudent(String name) {
        super(name);
    }

    @Override
    public void goToSchool() {
        System.out.println(getName() + " goes to UVT.");
    }
}


public class AbstractClassExample {

    public static void main(String[] args) {
        PoliStudent poliStudent = new PoliStudent("Alex");
        poliStudent.study();
        poliStudent.goToSchool();

        UvtStudent uvtStudent = new UvtStudent("Sebi");
        uvtStudent.study();
        uvtStudent.goToSchool();
    }
}
