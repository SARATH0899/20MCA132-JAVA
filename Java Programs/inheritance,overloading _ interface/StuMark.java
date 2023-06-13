import java.util.Scanner;

class Student {
    int rollNo;
    String name;

    public void getStudentDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        rollNo = scanner.nextInt();
        System.out.print("Enter Name: ");
        name = scanner.next();
    }
}

class Exam extends Student {
    int[] marks = new int[3];

    public void getMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks for 3 subjects: ");
        for (int i = 0; i < 3; i++) {
            System.out.print("Subject " + (i+1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }
}

class Result extends Exam {
    int totalMarks;
    float percentage;

    public void displayResult() {
        totalMarks = marks[0] + marks[1] + marks[2];
        percentage = (float) totalMarks / 3;
		System.out.println("***** STUDENT DETAILS *****");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
		System.out.println("************************");
		System.out.println("************************");
    }
}

public class StuMark {
    public static void main(String[] args) {
        Result result = new Result();
        result.getStudentDetails();
        result.getMarks();
        result.displayResult();
    }
}
