import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {10, 20, 30, 40, 50};

        System.out.print("Enter first number: ");
        String n1 = sc.nextLine();

        System.out.print("Enter second number: ");
        String n2 = sc.nextLine();

        try {
            int a = Integer.parseInt(n1);
            int b = Integer.parseInt(n2);

            System.out.println("Division = " + (a / b));

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }

        System.out.print("Enter array index: ");

        try {
            int index = Integer.parseInt(sc.nextLine());
            System.out.println("Array Element = " + arr[index]);

        } catch (NumberFormatException e) {
            System.out.println("Invalid index format!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }

        sc.close();
    }
}