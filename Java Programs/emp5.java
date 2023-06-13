import java.util.Scanner;

class Employee {
    int emp_id;
    String emp_name;
}

class Worker extends Employee {
    double daily_wages;
    
    void acceptData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        emp_id = sc.nextInt();
        System.out.print("Enter employee name: ");
        emp_name = sc.next();
        System.out.print("Enter daily wages: ");
        daily_wages = sc.nextDouble();
    }
    
    void displayData() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee name: " + emp_name);
        System.out.println("Daily wages: " + daily_wages);
    }
}

public class emp5 {
    public static void main(String[] args) {
        Worker w = new Worker();
        w.acceptData();
        w.displayData();
    }
}
