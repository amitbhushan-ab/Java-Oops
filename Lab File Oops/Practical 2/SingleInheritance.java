class Vehicle {
    String brand = "Toyota";
    int speed = 140;

    void start() {
        System.out.println("Vehicle is starting...");
    }

    void showVehicle() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/hr");
    }
}

class Car extends Vehicle {
    String model = "Corolla";

    void showCar() {
        System.out.println("Car Model: " + model);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        System.out.println("===== SINGLE INHERITANCE =====");
        Car c = new Car();
        c.start();
        c.showVehicle();
        c.showCar();
    }
}
