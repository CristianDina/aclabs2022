package lab2;

class Developer {
    public void work() {
        System.out.println("Do nothing");
    }
}

class JavaDeveloper extends Developer {
    public void work() {
        System.out.println("Do Java");
    }
}

class RubyDeveloper extends Developer {
    public void work() {
        System.out.println("Do Ruby");
    }
}

public class DynamicPolymorphismExample {
    public static void main(String[] args) {
        Developer javaEmployee = new JavaDeveloper();
        Developer rubyEmployee = new RubyDeveloper();

        javaEmployee.work();
        rubyEmployee.work();
    }
}