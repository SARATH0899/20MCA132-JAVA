import java.util.Scanner;

class Employee {
    int Empid;
    String Empname;
    double salary;
    String address;

    Employee(int empid, String name, double salary, String address) {
        this.Empid = eid;
        this.Empname = ename;
        this.salary = sal;
        this.address = addr;
    }
}

class Teacher extends Employee {
    String department;
    String[] subjects;

    Teacher(int empid, String name, double salary, String address, String department, String[] subjects) {
        super(empid, name, salary, address);
        this.department = dept;
        this.subjects = subj;
    }

    void display() {
		System.out.println("EMPLOYEE INFORMATIONS");
		System.out.println("-----------------------");
        System.out.println("EMPLOYEE ID: " + eid);
        System.out.println("EMPLOYEE NAME: " + ename);
        System.out.println("SALARY OF THE EMPLOYEE: " + sal);
        System.out.println("ADDRESS OF THE EMPLOYEE: " + addr);
        System.out.println("DEPARTMENTS: " + dept);
        System.out.println("SUBJECTS TAUGHT:");
        for (String subject : subjects) {
            System.out.println("- " + subject);
        }
    }
}

public class inherit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of teachers: ");
        int n = sc.nextInt();
        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for teacher " + (i + 1) + ":");
            System.out.print("Empid: ");
            int empid = sc.nextInt();
			sc.nextLine(); 
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
			sc.nextLine();
            System.out.print("Address: ");
            String address = sc.next();
            System.out.print("Department: ");
            String department = sc.next();
            System.out.print("Number of subjects taught: ");
            int numSubjects = sc.nextInt();
			sc.nextLine();
            String[] subjects = new String[numSubjects];
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                subjects[j] = sc.next();
            }
            teachers[i] = new Teacher(empid, name, salary, address, department, subjects);
        }

        System.out.println("\nDetails of all teachers:");
        for (Teacher teacher : teachers) {
            teacher.display();
            System.out.println();
        }
    }
}
