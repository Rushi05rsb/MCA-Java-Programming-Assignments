class Bank {
    int balance = 1000;

    synchronized void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance after deposit: " + balance);
    }

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    synchronized void displayBalance() {
        System.out.println("Final Balance: " + balance);
    }
}

class Deposit extends Thread {
    Bank b;

    Deposit(Bank b) {
        this.b = b;
    }

    public void run() {
        b.deposit(500);
    }
}

class Withdraw extends Thread {
    Bank b;

    Withdraw(Bank b) {
        this.b = b;
    }

    public void run() {
        b.withdraw(300);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Bank b = new Bank();

        Deposit d = new Deposit(b);
        Withdraw w = new Withdraw(b);

        d.start();
        w.start();

        try {
            d.join();
            w.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        b.displayBalance();
    }
}