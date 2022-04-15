package lab2;

class Employee {
    public void work(){
        System.out.println("Work.");
    }
}
class JavaEmployee extends Employee {
    public void work(){
        System.out.println("Do Java");
    }

    public void work(String language){
        System.out.println("Do " + language);
    }
}
class PythonEmployee extends Employee {
    public  void work(){
        System.out.println("Python");
    }
}

public class PolymorphismExercise {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.work();

        JavaEmployee javaEmployee1 = new JavaEmployee();
        PythonEmployee pythonEmployee1 = new PythonEmployee();
        javaEmployee1.work();
        javaEmployee1.work("Scala");
        pythonEmployee1.work();

        Employee employee2 = new JavaEmployee();
        Employee employee3 = new PythonEmployee();
        employee2.work();
        employee3.work();

        JavaEmployee javaEmployee2 = (JavaEmployee) employee1;
        JavaEmployee javaEmployee3 = (JavaEmployee) employee2;
        PythonEmployee pythonEmployee2 = (PythonEmployee) employee3;
        PythonEmployee pythonEmployee3 = (PythonEmployee) employee1;
        javaEmployee2.work();
        javaEmployee2.work("Scala");
        javaEmployee3.work();
        javaEmployee3.work("Scala");
        pythonEmployee2.work();
        pythonEmployee3.work();

        Employee employee4 = (Employee) javaEmployee1;
        Employee employee5 = (Employee) pythonEmployee1;
        employee4.work();
        employee5.work();
    }
}