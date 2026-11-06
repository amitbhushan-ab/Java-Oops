interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class AllInOnePrinter implements Printable, Scannable {
    public void print() {
        System.out.println("AllInOnePrinter: Printing document...");
    }

    public void scan() {
        System.out.println("AllInOnePrinter: Scanning document...");
    }
}

class Device {
    String brand;

    Device(String brand) {
        this.brand = brand;
    }

    void powerOn() {
        System.out.println(brand + " is switched ON.");
    }
}

class SmartPrinter extends Device implements Printable, Scannable {
    int pages;

    SmartPrinter(String brand, int pages) {
        super(brand);
        this.pages = pages;
    }

    public void print() {
        System.out.println(brand + " is printing " + pages + " pages.");
    }

    public void scan() {
        System.out.println(brand + " is scanning " + pages + " pages.");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("PART 1: INTERFACES");
        AllInOnePrinter p1 = new AllInOnePrinter();
        p1.print();
        p1.scan();

        System.out.println("\nPART 2: HYBRID STRUCTURE");
        SmartPrinter p2 = new SmartPrinter("HP", 15);
        p2.powerOn();
        p2.print();
        p2.scan();
    }
}
