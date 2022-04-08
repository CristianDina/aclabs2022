package lab1;

public class PrimitiveExample {

    public static void main(String[] args) {
        int age = 20;
        changeAge(age);
        System.out.println(age);
    }

    static void changeAge(int age) {
        age = 25;
    }
}