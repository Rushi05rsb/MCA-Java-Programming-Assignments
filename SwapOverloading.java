import java.util.Scanner;

public class SwapOverloading {

    void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping integers: " + a + " " + b);
    }

    void swap(float a, float b) {
        float temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping floats: " + a + " " + b);
    }

    void swap(char a, char b) {
        char temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping characters: " + a + " " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SwapOverloading obj = new SwapOverloading();

        System.out.print("Enter two integers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        obj.swap(x, y);

        System.out.print("Enter two float numbers: ");
        float p = sc.nextFloat();
        float q = sc.nextFloat();
        obj.swap(p, q);

        System.out.print("Enter two characters: ");
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        obj.swap(c1, c2);

        sc.close();
    }
}