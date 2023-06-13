import java.util.*;
class staff {
	int staff_id;
   staff(int id) {
	   staff_id=id;
     
   }
}

class teacher extends staff {
   
   String subject;
   
   
   teacher(int id,String sub) {
	 super(id);
    
	 subject = sub;
	 
   }
   
   void display() {
     
	  System.out.println("teacher id " + staff_id);
	  
	  System.out.println("subject of teacher " + subject);
	  
   }
}
class officer extends staff {
   
   String grade;
   
   officer(int id,String grdd) {
	 super(id);
     
	 grade = grdd;
   }
   
   void display() {
      System.out.println("officer id " + staff_id);
	  System.out.println("grade of officer " + grade);
   }
}



class schoolstaffs {
   public static void main(String[] args) {
	   int i;
	   Scanner obj=new Scanner(System.in);
	   System.out.println("enter the total size");
	   int size=obj.nextInt();
	   teacher arr1[]=new teacher[size];
	   officer arr2[]=new officer[size];
      
	  for(i=0;i<size;i++)
	  {
		 
			System.out.println("Enter the id:");
			int id=obj.nextInt();
			System.out.println("Enter the subject:");
			String sub=obj.next();
			arr1[i]=new teacher(id,sub);
	  }
	  for(i=0;i<size;i++)
	  {
		  
			System.out.println("Enter the id:");
			int id=obj.nextInt();
			System.out.println("Enter the grade:");
			String grdd=obj.next();
			arr2[i]=new officer(id,grdd);
	  }
	  for(i=0;i<size;i++)
      {
	  arr1[i].display();
	  arr2[i].display();
      }
   }
}
