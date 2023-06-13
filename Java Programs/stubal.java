import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    int feesPaid;

    public Student(int rollNumber, String name, int feesPaid) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.feesPaid = feesPaid;
    }

    public int getBalanceFees() {
        return 74000 - feesPaid;
    }
}

public class stubal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll Number: ");
            int rollNumber = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Fees Paid: ");
            int feesPaid = scanner.nextInt();

            students[i] = new Student(rollNumber, name, feesPaid);
        }

        System.out.println("Students with balance fees:");
        for (Student student : students) {
            if (student.getBalanceFees() > 0) {
                System.out.println(student.rollNumber + " " + student.name + " " + student.getBalanceFees());
            }
        }
    }
}
