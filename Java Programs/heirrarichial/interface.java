interface A
{  
void print();  
}  
interface B
{  
void show();  
} 
class C implements A,B
{  
public void print()
{
	System.out.println("Hello");
}  
 public void show()
{
	System.out.println("hai");
}  
public static void main(String args[]){  
	C obj = new C();  
	obj.print();  
	obj.show();
 }  
}
