package lab1;

public class ObjectExample {

    public static void main(String[] args) {
        Person person = new Person("Cristi");
        changeName(person);
        System.out.println(person.getName());
    }

    static void changeName(Person person) {
        person.setName("Andrei");
    }
}