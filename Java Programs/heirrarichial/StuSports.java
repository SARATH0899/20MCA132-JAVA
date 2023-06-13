import java.util.Scanner;

interface Student {
    void getSt();
    void displaySt();
}

interface Sports {
    void getSp();
    void displaySp();
}

class Result implements Student, Sports {
    String name;
    int rollNo;
    int academicScore;
    int sportsScore;

    public void getSt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        rollNo = scanner.nextInt();
    }

    public void displaySt() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }

    public void getSp() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sports score: ");
        sportsScore = scanner.nextInt();
    }

    public void displaySp() {
        System.out.println("Sports score: " + sportsScore);
    }

    public void getAcademic() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter academic score: ");
        academicScore = scanner.nextInt();
    }

    public void displayAcademic() {
        System.out.println("Academic score: " + academicScore);
    }

    public void getResult() {
        getSt();
        getSp();
        getAcademic();
    }

    public void displayResult() {
        displaySt();
        displaySp();
        displayAcademic();
    }
}

public class StuSports {
    public static void main(String[] args) {
        Result result = new Result();
        result.getResult();
        result.displayResult();
    }
}
