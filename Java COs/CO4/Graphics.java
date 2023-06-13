package graphics;
import java.util.Scanner;
interface fig{
   public double recArea();
   public double cirArea();
   public double squArea();
   public double triArea();
}

public class Graphics implements fig {

    Scanner s = new Scanner(System.in);
    int r,l,b,a;
      double pi = 3.14,area;
	  public  double recArea(){
		
		System.out.println("Enter length of rectangle:");
        l=s.nextInt();
        System.out.println("Enter breadth of rectangle:");
        b=s.nextInt();	
		area=l*b;
		 return area;
		 }
    public double cirArea(){
        
       
        System.out.println("Enter radius of circle:");
        r = s.nextInt();
        area = pi * r * r;
        return area;
		}
    public double squArea(){
		
        System.out.println("Enter the side of the square:");
        a = s.nextInt();
        area = a * a;
			return area;
        
    }
    public double triArea(){
		
      System.out.println("Enter the width of the Triangle:");
      double base = s.nextDouble();

      System.out.println("Enter the height of the Triangle:");
      double height = s.nextDouble();

      
      double area = (base* height)/2;
      return area; 
    }
    
}