import java.util.Scanner;

class Student {
    int rollno;
    String name;
}

class Marks extends Student {
    int m1, m2, m3, total;
    double percentage;

    void calculateTotal() {
        total = m1 + m2 + m3;
    }

    void calculatePercentage() {
        percentage = (double) total / 3.0;
    }

    void display() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Marks in Subject 1: " + m1);
        System.out.println("Marks in Subject 2: " + m2);
        System.out.println("Marks in Subject 3: " + m3);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}

public class stu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Marks student = new Marks();

        System.out.print("Enter Roll No: ");
        student.rollno = sc.nextInt();

        System.out.print("Enter Name: ");
        sc.nextLine(); 
        student.name = sc.nextLine();

        System.out.print("Enter Marks in Subject 1: ");
        student.m1 = sc.nextInt();

        System.out.print("Enter Marks in Subject 2: ");
        student.m2 = sc.nextInt();

        System.out.print("Enter Marks in Subject 3: ");
        student.m3 = sc.nextInt();

        student.calculateTotal();
        student.calculatePercentage();
        student.display();
    }
}
