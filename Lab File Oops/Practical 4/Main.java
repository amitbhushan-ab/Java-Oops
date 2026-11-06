class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Employee {
    double calculatePay() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    double calculatePay() {
        double basic = 38000;
        double bonus = 7000;
        return basic + bonus;
    }
}

class PartTimeEmployee extends Employee {
    double calculatePay() {
        int hours = 80;
        double ratePerHour = 250;
        return hours * ratePerHour;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("METHOD OVERLOADING");
        Calculator calc = new Calculator();
        System.out.println("add(15, 25) = " + calc.add(15, 25));
        System.out.println("add(10, 25, 40) = " + calc.add(10, 25, 40));
        System.out.println("add(4.5, 5.5) = " + calc.add(4.5, 5.5));

        System.out.println("\nMETHOD OVERRIDING");
        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee();
        System.out.println("Full Time Pay : " + e1.calculatePay());
        System.out.println("Part Time Pay : " + e2.calculatePay());
    }
}
