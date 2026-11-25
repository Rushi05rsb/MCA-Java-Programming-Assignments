import java.io.*;
import java.util.Scanner;

class Employee {
    int id;
    String name, department;
    double salary;

    void accept(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        id = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Department: ");
        department = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = Double.parseDouble(sc.nextLine());
    }

    void save() throws IOException {
        FileOutputStream fos = new FileOutputStream("Employee.txt");

        String data = id + "\n" + name + "\n" + department + "\n" + salary;
        fos.write(data.getBytes());
        fos.close();
    }

    void display() throws IOException {
        FileInputStream fis = new FileInputStream("Employee.txt");

        int ch;
        while ((ch = fis.read()) != -1) {
            System.out.print((char) ch);
        }

        fis.close();
    }
}

public class EmployeeFileManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();

        try {
            e.accept(sc);
            e.save();

            System.out.println("\nEmployee Details:");
            e.display();

        } catch (NumberFormatException ex) {
            System.out.println("Invalid number format!");
        } catch (IOException ex) {
            System.out.println("File Error: " + ex.getMessage());
        }

        sc.close();
    }
}