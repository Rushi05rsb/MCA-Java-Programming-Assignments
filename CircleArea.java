import java.util.Scanner;

public class CircleArea {
    static final double pi = 3.14;
    double r, a;

    void cal_area() {
        a = pi * r * r;
    }

    void display() {
        System.out.println("Area of Circle = " + a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CircleArea c = new CircleArea();

        System.out.print("Enter radius: ");
        c.r = sc.nextDouble();

        c.cal_area();
        c.display();

        sc.close();
    }
}