import java.util.Scanner;

class Employee {
    int empNumber;
    String name;
    int salary;

    public Employee(int empNumber, String name, int salary) {
        this.empNumber = empNumber;
        this.name = name;
        this.salary = salary;
    }
}

public class emp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Emp Number: ");
            int empNumber = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Salary: ");
            int salary = scanner.nextInt();

            employees[i] = new Employee(empNumber, name, salary);
        }

        System.out.println("Employees with salary between 10000 and 15000:");
        for (Employee employee : employees) {
            if (employee.salary >= 10000 && employee.salary <= 15000) {
                System.out.println(employee.empNumber + " " + employee.name + " " + employee.salary);
            }
        }
    }
}
