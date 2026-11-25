import java.util.*;

class Student {
    int roll;
    String name;
    double marks;

    Student(int r, String n, double m) {
        roll = r;
        name = n;
        marks = m;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(101, "Rahul", 85));

        System.out.println("1.Add  2.Search  3.Update");
        System.out.println("4.Delete  5.Display");
        System.out.print("Enter choice: ");
        int ch = sc.nextInt();

        System.out.print("Enter Roll Number: ");
        int r = sc.nextInt();

        switch (ch) {
            case 1:
                sc.nextLine();
                System.out.print("Enter Name: ");
                String n = sc.nextLine();
                System.out.print("Enter Marks: ");
                double m = sc.nextDouble();
                list.add(new Student(r, n, m));
                System.out.println("Student Added");
                break;

            case 2:
                for (Student s : list)
                    if (s.roll == r)
                        System.out.println(s.name + " " + s.marks);
                break;

            case 3:
                for (Student s : list)
                    if (s.roll == r) {
                        System.out.print("Enter New Marks: ");
                        s.marks = sc.nextDouble();
                        System.out.println("Updated");
                    }
                break;

            case 4:
                list.removeIf(s -> s.roll == r);
                System.out.println("Student Deleted");
                break;

            case 5:
                for (Student s : list)
                    System.out.println(s.roll + " " + s.name + " " + s.marks);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}