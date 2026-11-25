import java.util.Scanner;

interface CalculateResult {
    int calculateTotal();
    double calculatePercentage();
    String calculateGrade();
}

public class Student implements CalculateResult {
    int[] marks;

    Student(int[] marks) {
        this.marks = marks;
    }

    public int calculateTotal() {
        int total = 0;

        for (int m : marks) {
            total = total + m;
        }

        return total;
    }

    public double calculatePercentage() {
        return calculateTotal() / 5.0;
    }

    public String calculateGrade() {
        double percentage = calculatePercentage();

        if (percentage >= 90)
            return "A";
        else if (percentage >= 80)
            return "B";
        else if (percentage >= 70)
            return "C";
        else if (percentage >= 60)
            return "D";
        else if (percentage >= 40)
            return "E";
        else
            return "Fail";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        System.out.println("Enter marks of 5 subjects:");

        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }

        Student s = new Student(marks);

        System.out.println("\nTotal Marks = " + s.calculateTotal());
        System.out.println("Percentage = " + s.calculatePercentage() + "%");
        System.out.println("Grade = " + s.calculateGrade());

        sc.close();
    }
}