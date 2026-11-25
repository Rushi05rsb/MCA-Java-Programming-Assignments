
import java.util.Scanner;

class InvalidLoginException extends Exception {
    InvalidLoginException(String msg) {
        super(msg);
    }
}

public class LoginDemo {

    static void validateLogin(String user, String pass)
            throws InvalidLoginException {

        if (!user.equals("admin") || !pass.equals("1234")) {
            throw new InvalidLoginException("Invalid Login!");
        }

        System.out.println("Login Successful!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        try {
            validateLogin(user, pass);
        } catch (InvalidLoginException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
