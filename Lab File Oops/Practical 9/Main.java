class Employee {
    String name;
    double salary;
    static int count = 0;

    Employee() {
        this("Unknown", 0);
    }

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        count++;
    }

    static void showCount() {
        System.out.println("Total employees: " + count);
    }

    void show() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee.showCount();

        Employee e1 = new Employee();
        Employee e2 = new Employee("Neha", 35000);
        Employee e3 = new Employee("Rohit", 52000);

        e1.show();
        e2.show();
        e3.show();

        Employee.showCount();
    }
}
