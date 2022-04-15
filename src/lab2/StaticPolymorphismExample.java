package lab2;

public class StaticPolymorphismExample {

    public static void main(String[] args) {
        work();
        work("Java");
    }

    public static void work() {
        System.out.println("Do Java");
    }

    public static void work(String programmingLanguage){
        System.out.println("Do" + programmingLanguage);
    }
}
