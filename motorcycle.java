package transport.java;

public class motorcycle extends Vehicle {
    
    public String type;

    motorcycle(String name, String model, int nooftyres, String type) {
        super(name, model, nooftyres);
        this.type = type;
    }

    void displayDetails() {
        System.out.println("Motorcycle Name: " + name);
        System.out.println("Motorcycle Model: " + model);
        System.out.println("Number of Tyres: " + nooftyres);
        System.out.println("Motorcycle Type: " + type);
    }
    
}
