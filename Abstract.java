abstract class Vehcile{
    abstract void start();
}

class Car extends Vehcile{

    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

class Bike extends Vehcile{

    @Override
    void start() {
        System.out.println("Bike starts with kick");
    }



}


public class Abstract {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
