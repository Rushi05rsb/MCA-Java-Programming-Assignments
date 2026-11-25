import java.util.Scanner;

class NoBallException extends Exception {
    NoBallException(String message) {
        super(message);
    }
}

public class CricketOver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalRuns = 0;
        int balls = 0;

        while (balls < 6) {
            System.out.print("Enter runs scored on ball " + (balls + 1) + " (-1 for No Ball): ");
            int runs = sc.nextInt();

            try {
                if (runs == -1) {
                    throw new NoBallException("No Ball! Extra 1 run added.");
                }

                if (runs < 0) {
                    System.out.println("Invalid input. Enter 0 or more.");
                    continue;
                }

                totalRuns = totalRuns + runs;
                balls++;

            } catch (NoBallException e) {
                System.out.println(e.getMessage());
                totalRuns++;
            }
        }

        System.out.println("\nTotal Runs Scored in One Over = " + totalRuns);

        sc.close();
    }
}