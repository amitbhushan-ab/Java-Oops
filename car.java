public class car extends Vehicle {
    
    public String color;

    car(String name, String model, int nooftyres, String color) {
        super(name, model, nooftyres);
        this.color = color;
    }

    void displayDetails() {
        System.out.println("Car Name: " + name);
        System.out.println("Car Model: " + model);
        System.out.println("Number of Tyres: " + nooftyres);
        System.out.println("Car Color: " + color);
    }
    
}
