class Person {
    String name = "Rohan";
    int age = 28;

    void showPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int employeeId = 205;
    double salary = 85500;

    void showEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department = "Software Development";

    void showManager() {
        System.out.println("Department: " + department);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        System.out.println("===== MULTILEVEL INHERITANCE =====");
        Manager m = new Manager();
        m.showPerson();
        m.showEmployee();
        m.showManager();
    }
}
