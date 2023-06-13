import java.util.Scanner;

public class LarNum {
	static int findLargest(int num1, int num2) {
        return Math.max(num1, num2);
    }
	
	static int findLargest(int num1, int num2, int num3) {
    return Math.max(num1, Math.max(num2, num3));
}

	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
		
		System.out.println("The largest of two numbers is: " + findLargest(num1, num2));
		
		System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
		
		System.out.println("The largest of three numbers is: " + findLargest(num1, num2, num3));
	}
}

