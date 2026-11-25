import java.util.Scanner;

public class FirstLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int n = sc.nextInt();

        if (n >= 10000 && n <= 99999) {
            int first = n / 10000;
            int last = n % 10;

            System.out.println("First digit = " + first);
            System.out.println("Last digit = " + last);
        } else {
            System.out.println("Invalid five-digit number.");
        }

        sc.close();
    }
}