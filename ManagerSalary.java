import java.util.Scanner;

class Employee {
    String name;
    double basicSalary;
}

class Manager extends Employee {
    double bonus;

    void displaySalary() {
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + (basicSalary + bonus));
    }
}

public class ManagerSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager m = new Manager();

        System.out.print("Enter employee name: ");
        m.name = sc.nextLine();

        System.out.print("Enter basic salary: ");
        m.basicSalary = sc.nextDouble();

        System.out.print("Enter bonus: ");
        m.bonus = sc.nextDouble();

        m.displaySalary();

        sc.close();
    }
}