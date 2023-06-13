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
        getStudentInfo();
        getSportsInfo();
        getAcademicInfo();
    }

    public void displayResult() {
        displayStudentInfo();
        displaySportsInfo();
        displayAcademicInfo();
    }
}

class Person {
    String firstName;
    String lastName;

    public void getPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        lastName = scanner.nextLine();
    }

    public void displayPerson() {
        System.out.println("Name: " + firstName + " " + lastName);
    }
}

class StudentResult extends Person implements Student, Sports {
    Result result = new Result();

    public void getSt() {
        result.getSt();
    }

    public void displaySt() {
        result.displaySt();
    }

    public void getSp() {
        result.getSp();
    }

    public void displaySp() {
        result.displaySp();
    }

    public void getAcademic() {
        result.getAcademic();
    }

    public void displayAcademic() {
        result.displayAcademic();
    }

    public void getResult() {
        getPerson();
        result.getResult();
    }

    public void displayResult() {
        displayPerson();
        result.displayResult();
    }
}

public class stuspt {
    public static void main(String[] args) {
        StudentResult studentResult = new StudentResult();
        studentResult.getResult();
        studentResult.displayResult();
    }
}
