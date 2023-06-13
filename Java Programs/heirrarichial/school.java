import java.util.*;
class common {
	String name;
	String gender;
	int age;
   common(String n,String g,int a) {
	   name=n;
	   gender=g;
	   age=a;
     
   }
}

class principal extends common {
   int salary;
   
   principal(String n,String g,int a,int sal) {
	 super(n,g,a);
     salary = sal;
	 
   }
   
   void display() {
      System.out.println("name of principal " + name);
	  System.out.println("gender of principal " + gender);
	  System.out.println("age of principal " + age);
	  System.out.println("salary of principal " + salary);
	  
   }
}
class teacher extends common {
   
   String subject;
   
   
   teacher(String n,String g,int a,String sub) {
	 super(n,g,a);
    
	 subject = sub;
	 
   }
   
   void display() {
      System.out.println("name of teacher " + name);
	  System.out.println("gender of teacher " + gender);
	  System.out.println("age of teacher " + age);
	  
	  System.out.println("subject of teacher " + subject);
	  
   }
}
class student extends common {
   
   String grade;
   
   student(String n,String g,int a,String grdd) {
	 super(n,g,a);
     
	 grade = grdd;
   }
   
   void display() {
      System.out.println("name of student " + name);
	  System.out.println("gender of student " + gender);
	  System.out.println("age of student " + age);
	  System.out.println("grade of student " + grade);
   }
}



class school {
   public static void main(String[] args) {
	   int i;
	   Scanner obj=new Scanner(System.in);
	   System.out.println("enter the total size");
	   int size=obj.nextInt();
	   principal arr[]=new principal[size];
	   teacher arr1[]=new teacher[size];
	   student arr2[]=new student[size];
      
	  for(i=0;i<size;i++)
	  {
		  System.out.println("Enter the name:");
			String n=obj.next();
			System.out.println("Enter the gender:");
			String g=obj.next();
			System.out.println("Enter the age:");
			int a=obj.nextInt();
			System.out.println("Enter the salary:");
			int sal=obj.nextInt();
			arr[i]=new principal(n,g,a,sal);
	  }
	  for(i=0;i<size;i++)
	  {
		  System.out.println("Enter the name:");
			String n=obj.next();
			System.out.println("Enter the gender:");
			String g=obj.next();
			System.out.println("Enter the age:");
			int a=obj.nextInt();
			System.out.println("Enter the subject:");
			String sub=obj.next();
			arr1[i]=new teacher(n,g,a,sub);
	  }
	  for(i=0;i<size;i++)
	  {
		  System.out.println("Enter the name:");
			String n=obj.next();
			System.out.println("Enter the gender:");
			String g=obj.next();
			System.out.println("Enter the age:");
			int a=obj.nextInt();
			System.out.println("Enter the grade:");
			String grdd=obj.next();
			arr2[i]=new student(n,g,a,grdd);
	  }
	  for(i=0;i<size;i++)
      {
      arr[i].display();
	  arr1[i].display();
	  arr2[i].display();
      }
   }
}
