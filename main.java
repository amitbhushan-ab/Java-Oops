package transport.java;

public class main {
    public static void main(String[] args) {
        car myCar = new car("Toyota", "Camry", 4, "Red");
        motorcycle myMotorcycle = new motorcycle("Harley-Davidson", "Street 750", 2, "Cruiser");

        myCar.displayDetails();
        myCar.startEngine();
        myCar.stopEngine();

        System.out.println();

        myMotorcycle.displayDetails();
        myMotorcycle.startEngine();
        myMotorcycle.stopEngine();
    }
}
