import java.util.*;

public class VolShape {
  static double Cuboid(double l, double w, double h) {
    return l*w*h;
  }
  
  static double Cube(double a) {
    return a*a*a;
  }
  
  static double Cylinder(double r, double h1) {
    return Math.PI*(r*r)*h1;
  }
  
  static double Prism(double l1, double h2, double b2) {
	double B = l1*b2;
    return B*h2;
  }
  
  static double Sphere(double r1) {
    return (4.0/3.0)*Math.PI*(r1*r1*r1);
  }
  
  static double Pyramid(double l2, double b3, double h6) {
	double B1 = l2*b3;
    return (1.0/3.0)*Math.PI*(h6);
  }
  
  static double RtCircularCone(double r2, double h4) {
    return (1.0/3.0)*Math.PI*(r2*r2)*h4;
  }
  
  static double RectPyramid(double l3, double w1, double h5) {
    return (1.0/3.0)*l3*w1*h5;
  }
  
  static double Ellipsoid(double a1, double b1, double c1) {
    return (4.0/3.0)*Math.PI*(a1*b1*c1);
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	
	System.out.println("*****************************");
	System.out.println("******VOLUME OF SHAPES******" );
	System.out.println("*****************************");
	System.out.println("<<< ENTER THE REQUIREMENTS >>>" );
	System.out.println("*****************************");
	System.out.print("\n");
	
	System.out.println("<<<<<<<<<< CUBOID >>>>>>>>>>>");
	System.out.println("*****************************");
    System.out.print("Enter the length of the cuboid: ");
    double l = sc.nextDouble();
    System.out.print("Enter the width of the cuboid: ");
    double w = sc.nextDouble();
	System.out.print("Enter the height of the cuboid: ");
    double h = sc.nextDouble();
    double cuboidVol = Cuboid(l, w, h);
	System.out.println("*****************************");
	System.out.println("Volume of the Cuboid: " + cuboidVol);
	System.out.println("*****************************");
	System.out.println("*****************************");
	System.out.print("\n");
	
	System.out.println("<<<<<<<<<<<< CUBE >>>>>>>>>>>");
	System.out.println("*****************************");
	System.out.print("Enter the length of the cube: ");
    double a = sc.nextDouble();
    double cubeVol = Cube(a);
	System.out.println("*****************************");
    System.out.println("Volume of the Cube: " + cubeVol);
	System.out.println("*****************************");
	System.out.println("*****************************");
	System.out.print("\n");
	
	System.out.println("<<<<<<<<<< CYLINDER >>>>>>>>>");
	System.out.println("*****************************");
	System.out.print("Enter the radius of the cylinder: ");
    double r = sc.nextDouble();
	System.out.print("Enter the height of the cylinder: ");
    double h1 = sc.nextDouble();
    double cylinderVol = Cylinder(r, h1);
	System.out.println("*****************************");
	System.out.println("Volume of the Cylinder: " + cylinderVol);
	System.out.println("*****************************");
	System.out.println("*****************************");
	System.out.print("\n");
    
	System.out.println("<<<<<<<<<< PRISM >>>>>>>>>>>");
	System.out.println("*****************************");
	System.out.print("Enter the length of the prism: ");
    double l1 = sc.nextDouble();
    System.out.print("Enter the breadth of the prism: ");
    double b2 = sc.nextDouble();
	System.out.print("Enter the height of the prism: ");
    double h2 = sc.nextDouble();
    double prismVol = Prism(l1, h2, b2);
	System.out.println("*****************************");
	System.out.println("Volume of the Prism: " + prismVol);
	System.out.println("*****************************");
	System.out.println("*****************************");
	System.out.print("\n");
    
   
	System.out.println("<<<<<<<<<< SPHERE >>>>>>>>>>");
	System.out.println("*****************************");
	System.out.print("Enter the radius of the sphere: ");
    double r1 = sc.nextDouble();
    double sphereVol = Sphere(r1);
	System.out.println("*****************************");
	System.out.println("Volume of the Sphere: " + sphereVol);
	System.out.println("*****************************");
	System.out.println("*****************************");
	System.out.print("\n");
    
	System.out.println("<<<<<<<<<< PYRAMID >>>>>>>>>>");
	System.out.println("*****************************");
	System.out.print("Enter the length of the pyramid: ");
    double l2 = sc.nextDouble();
    System.out.print("Enter the breadth of the pyramid: ");
    double b3 = sc.nextDouble();
	System.out.print("Enter the height of the pyramid: ");
    double h6 = sc.nextDouble();
    double pyramidVol = Pyramid(l2, b3, h6);
	System.out.println("*****************************");
	System.out.println("Volume of the Pyramid: " + pyramidVol);
	System.out.println("*****************************");
	System.out.println("*****************************");
	System.out.print("\n");
    
	System.out.println("<<< RECTANGULAR CIRCULAR CONE >>>");
	System.out.println("*****************************");
	System.out.print("Enter the radius of the RtCircularCone: ");
    double r2 = sc.nextDouble();
	System.out.print("Enter the height of the RtCircularCone: ");
    double h4 = sc.nextDouble();
    double rtCircularConeVol = RtCircularCone(r2, h4);
	System.out.println("*****************************");
	System.out.println("Volume of the RtCircularCone: " +rtCircularConeVol);
	System.out.println("*****************************");
	System.out.println("*****************************");
	System.out.print("\n");
    
	
    System.out.println("<<<< RECTANGULAR PYRAMID >>>>");
	System.out.println("*****************************");
	System.out.print("Enter the length of the rectangle pyramid: ");
    double l3 = sc.nextDouble();
    System.out.print("Enter the width of the rectangle pyramid: ");
    double w1 = sc.nextDouble();
	System.out.print("Enter the height of the rectangle pyramid: ");
    double h5 = sc.nextDouble();
    double rectPyramidVol = RectPyramid(l3, w1, h5);
	System.out.println("*****************************");
	System.out.println("Volume of the RectPyramid: " + rectPyramidVol);
	System.out.println("*****************************");
	System.out.println("*****************************");
    System.out.print("\n");
    
	System.out.println("<<<<<<<<< ELLIPSOID >>>>>>>>>");
	System.out.println("*****************************");
	System.out.print("Enter the axis 1 of ellipsoid : ");
    double a1 = sc.nextDouble();
    System.out.print("Enter the axis 2 of ellipsoid : ");
    double b1 = sc.nextDouble();
	System.out.print("Enter the axis 3 of ellipsoid : ");
    double c1 = sc.nextDouble();
    double ellipsoidVol = Ellipsoid(a1, b1, c1);
	System.out.println("*****************************");
	System.out.println("Volume of the Ellipsoid: " + ellipsoidVol);
	System.out.println("*****************************");
	System.out.println("*****************************");
	System.out.print("\n");
  }
}

	
	
