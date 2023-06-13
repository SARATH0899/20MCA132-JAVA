import java.util.Scanner;

class Box {
    double length;
    double width;
    double height;
}

class Cupboard extends Box {
    int no_of_shelves;
    
    void acceptData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter width: ");
        width = sc.nextDouble();
        System.out.print("Enter height: ");
        height = sc.nextDouble();
        System.out.print("Enter number of shelves: ");
        no_of_shelves = sc.nextInt();
    }
    
    void displayData() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Number of shelves: " + no_of_shelves);
    }
}

public class cupbd {
    public static void main(String[] args) {
        Cupboard c = new Cupboard();
        c.acceptData();
        c.displayData();
    }
}
