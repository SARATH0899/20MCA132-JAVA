import java.util.Scanner;

public class average {
public static int average(int num1, int num2) {
        return (num1 + num2) / 2;
    }

    public static double average(double d1, double d2) {
        return (d1 + d2) / 2.0;
    }

    public static float average(float f1, float f2, float f3) {
        return (f1 + f2 + f3) / 3.0f;
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two integers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The average of the two integers is " + average(num1, num2));

        System.out.println("Enter two double values:");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println("The average of the two double values is " + average(d1, d2));

        System.out.println("Enter three float values:");
        float f1 = sc.nextFloat();
        float f2 = sc.nextFloat();
        float f3 = sc.nextFloat();
        System.out.println("The average of the three float values is " + average(f1, f2, f3));
    }
}