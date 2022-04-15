package lab2;

interface Driveable{
    void drive();
    void drive(String speed);
}

class Car implements Driveable{

    @Override
    public void drive() {
        System.out.println("Is driving");
    }

    @Override
    public void drive(String speed) {
        System.out.println("Is driving with " + speed);
    }
}

public class InterfaceExample {

    public static void main(String[] args) {
        Driveable car = new Car();
        car.drive();
        car.drive("90 km/h");
    }
}
