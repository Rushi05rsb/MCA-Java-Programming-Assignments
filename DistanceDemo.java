import java.util.Scanner;

class Distance {
    int feet;
    double inches, cm;

    Distance() {
        feet = 0;
        inches = 0;
    }

    void get_value(Scanner sc) {
        System.out.print("Enter feet: ");
        feet = sc.nextInt();

        System.out.print("Enter inches: ");
        inches = sc.nextDouble();
    }

    void show_distance() {
        System.out.println("Distance = " + feet + " feet " + inches + " inches");
    }

    void centi() {
        cm = (feet * 12 + inches) * 2.54;
    }

    void display() {
        System.out.println("Distance in centimeters = " + cm + " cm");
    }
}

public class DistanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Distance d1 = new Distance();
        Distance d2 = new Distance();

        System.out.println("Enter first distance:");
        d1.get_value(sc);

        System.out.println("\nEnter second distance:");
        d2.get_value(sc);

        System.out.println("\nFirst Distance:");
        d1.show_distance();
        d1.centi();
        d1.display();

        System.out.println("\nSecond Distance:");
        d2.show_distance();
        d2.centi();
        d2.display();

        sc.close();
    }
}