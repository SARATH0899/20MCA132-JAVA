import java.util.Scanner;

public class sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("The sum of two numbers is: " + sum(num1, num2));

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("The sum of digits in the number is: " + sum(num));

        System.out.print("Enter the first string: ");
        String str1 = sc.next();

        System.out.print("Enter the second string: ");
        String str2 = sc.next();

        System.out.println("The sum of two strings is: " + sum(str1, str2));

        sc.close();
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int sum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static String sum(String str1, String str2) {
        return str1 + str2;
    }
}
