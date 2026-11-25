interface Payroll {
    double calculateSalary();
    double calculateTax();
    double calculateNetSalary();
}

class PermanentEmployee implements Payroll {
    double salary = 30000;

    public double calculateSalary() {
        return salary;
    }

    public double calculateTax() {
        return salary * 0.10;
    }

    public double calculateNetSalary() {
        return calculateSalary() - calculateTax();
    }
}

class ContractEmployee implements Payroll {
    double salary = 20000;

    public double calculateSalary() {
        return salary;
    }

    public double calculateTax() {
        return salary * 0.05;
    }

    public double calculateNetSalary() {
        return calculateSalary() - calculateTax();
    }
}

class PartTimeEmployee implements Payroll {
    double salary = 10000;

    public double calculateSalary() {
        return salary;
    }

    public double calculateTax() {
        return salary * 0.02;
    }

    public double calculateNetSalary() {
        return calculateSalary() - calculateTax();
    }
}

public class PayrollDemo {
    static void display(Payroll p) {
        System.out.println("Salary: " + p.calculateSalary());
        System.out.println("Tax: " + p.calculateTax());
        System.out.println("Net Salary: " + p.calculateNetSalary());
        System.out.println();
    }

    public static void main(String[] args) {
        Payroll p;

        System.out.println("Permanent Employee:");
        p = new PermanentEmployee();
        display(p);

        System.out.println("Contract Employee:");
        p = new ContractEmployee();
        display(p);

        System.out.println("Part-Time Employee:");
        p = new PartTimeEmployee();
        display(p);
    }
}