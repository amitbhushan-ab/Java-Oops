class Shape {
    void display() {
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape {
    double radius = 7;

    void areaCircle() {
        double area = 3.14 * radius * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    int length = 25;
    int breadth = 10;

    void areaRectangle() {
        int area = length * breadth;
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area of Rectangle: " + area);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        System.out.println("===== HIERARCHICAL INHERITANCE =====");

        Circle ci = new Circle();
        ci.display();
        ci.areaCircle();

        System.out.println();

        Rectangle r = new Rectangle();
        r.display();
        r.areaRectangle();
    }
}
