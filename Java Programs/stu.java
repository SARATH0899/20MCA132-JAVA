import java.util.Scanner;

class Student {
    int rollNumber;
    int enrollmentNumber;
    String name;

    public Student(int rollNumber, int enrollmentNumber, String name) {
        this.rollNumber = rollNumber;
        this.enrollmentNumber = enrollmentNumber;
        this.name = name;
    }
}

public class stu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[50];

        for (int i = 0; i < 50; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll Number: ");
            int rollNumber = scanner.nextInt();
            System.out.print("Enrollment Number: ");
            int enrollmentNumber = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.next();

            students[i] = new Student(rollNumber, enrollmentNumber, name);
        }

        System.out.println("Student Details:");
        for (Student student : students) {
            System.out.println(student.rollNumber + " " + student.enrollmentNumber + " " + student.name);
        }
    }
}
