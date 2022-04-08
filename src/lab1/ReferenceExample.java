package lab1;

public class ReferenceExample {
    public static void main(String[] args) {
        Person person1 = new Person("Cristi");
        foo(person1);

        if(person1.getName().equals("Cristian")){
            System.out.println("Java passes by value");
        } else if (person1.getName().equals("Andrei")){
            System.out.println("Java passes by reference");
        }
    }

    public static void foo(Person person2){
        person2 = new Person("Andrei");
        person2.setName("Cristian");
    }
//
//    public void draw(){
//        person1 -> Person@8890("Cristi")
//            foo(person1) -> Person person2 -> Person@8890("Cristi")
//                person2 -> Person@8891("Andrei")
//            person1.getName() -> Person@8890("Cristi")
//    }
}