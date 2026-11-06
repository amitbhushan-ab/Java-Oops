class Demo {
    String name;

    Demo(String name) {
        this.name = name;
        System.out.println("Constructor: object " + name + " created.");
    }

    void use() {
        System.out.println("Using object " + name);
    }

    protected void finalize() {
        System.out.println("Finalize: object " + name + " is being cleaned up.");
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Demo d = new Demo("Sample1");
        d.use();

        d = null;
        System.out.println("Reference removed. Object is now eligible for GC.");

        System.gc();
        System.out.println("System.gc() requested.");

        Thread.sleep(1000);

        System.out.println("End of program.");
    }
}
