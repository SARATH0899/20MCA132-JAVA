package arithmatic;
import java.util.Scanner;
interface cal{
   public double Sum();
   public double Difference();
   public double Multiplication();
   public double Division();
}

public class operate implements cal {

    Scanner sc = new Scanner(System.in);
    double result;
	int n1, n2 ;
	  public  double Sum(){
		
		System.out.println("Enter the Number 1 : ");
        n1 = sc.nextInt();
        System.out.println("Enter the Number 2 : ");
        n2 = sc.nextInt();	
		result = n1 + n2;
		 return result;
		 }
    public double Difference(){
        
       
        System.out.println("Enter the Number 1 : ");
        n1 = sc.nextInt();
        System.out.println("Enter the Number 2 : ");
        n2 = sc.nextInt();	
		result = n1 - n2;
		 return result;
		 }
    public double Multiplication(){
		
       System.out.println("Enter the Number 1 : ");
        n1 = sc.nextInt();
        System.out.println("Enter the Number 2 : ");
        n2 = sc.nextInt();	
		result = n1 * n2;
		 return result;
		 }
    public double Division(){
		
      System.out.println("Enter the Number 1 : ");
        n1 = sc.nextInt();
        System.out.println("Enter the Number 2 : ");
        n2 = sc.nextInt();	
		result = n1 / n2;
		 return result;
		 }
    
}
