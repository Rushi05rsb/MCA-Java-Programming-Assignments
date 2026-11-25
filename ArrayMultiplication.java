import java.util.Scanner;

public class ArrayMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array size.");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        long product = 1;

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            product = product * arr[i];
        }

        System.out.println("Multiplication of all elements = " + product);

        sc.close();
    }
}