package lab2;


class Animal{
    private String name;

    public Animal(String name){
        this.name = name;
        System.out.println("Animal was created");
    }

    public String getName(){
        return this.name;
    }

    public void makeSound(){
        System.out.println("No sound");
    }
}

class Cat extends Animal{
    public Cat(String name) {
        super(name);
        System.out.println("Cat was created");
    }
}

class Dog extends Animal{
    public Dog(String name) {
        super(name);
        System.out.println("Dog was created");
    }

    public void makeSound(){
        System.out.println( getName() + " is barking.");
    }
}

public class InheritanceExample {

    public static void main(String[] args) {
        Dog dog = new Dog("Pufi");
        Cat cat = new Cat("Mufi");

        dog.makeSound();
        cat.makeSound();
    }
}
