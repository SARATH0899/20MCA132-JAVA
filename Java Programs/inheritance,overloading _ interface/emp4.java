import java.util.Scanner;

class Employee {
    int emp_id;
    String emp_name;
    String emp_designation;
    
    void acceptData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        emp_id = sc.nextInt();
        System.out.print("Enter employee name: ");
        emp_name = sc.next();
        System.out.print("Enter employee designation: ");
        emp_designation = sc.next();
    }
    
    void displayData() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee name: " + emp_name);
        System.out.println("Employee designation: " + emp_designation);
    }
}

class Salary extends Employee {
    double basic;
    double HRA;
    double DA;
    double gross_salary;
    
    void calculateSalary() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        basic = sc.nextDouble();
        DA = basic * 35 / 100;
        HRA = basic * 15 / 100;
        gross_salary = basic + DA + HRA;
    }
    
    void displaySalary() {
        System.out.println("Basic salary: " + basic);
        System.out.println("DA: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("Gross salary: " + gross_salary);
    }
}

public class emp4 {
    public static void main(String[] args) {
        Salary s = new Salary();
        s.acceptData();
        s.calculateSalary();
        s.displayData();
        s.displaySalary();
    }
}
