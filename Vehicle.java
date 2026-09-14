package transport.java;

public class Vehicle {
    
    public String name;

    public String model;

    public int nooftyres;

    Vehicle(String name, String model, int nooftyres) {
        this.name = name;
        this.model = model;
        this.nooftyres = nooftyres;
    }

    void startEngine() {
        System.out.println("Engine started");
    }
    void stopEngine() {
        System.out.println("Engine stopped");
    }   
}
