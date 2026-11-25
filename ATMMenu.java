import java.util.Scanner;

public class ATMMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000;

        int choice;

        do {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance = " + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance = balance + deposit;
                        System.out.println("Money deposited successfully.");
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= 0) {
                        System.out.println("Invalid amount.");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        balance = balance - withdraw;
                        System.out.println("Money withdrawn successfully.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        sc.close();
    }
}