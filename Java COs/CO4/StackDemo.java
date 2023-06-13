//Program to remove an object from a stack when the position is passed as a parameter.

import java.util.*;

public class StackDemo {
	public static void main (String args []) {
		
		Scanner sc = new Scanner(System.in);
		
		 // create a empty Stack object
		Stack<String> mystack = new Stack<String>();
		
		// Parameters are passed
		for(int i=0;i<5;i++){
			int j = i + 1;
		System.out.println("Enter the Element "+ j + " : ");
		String var1 = sc.next();
		mystack.add(var1);
		}
		
		//Print the stack
		System.out.println("Stack : " + mystack);
		
		// Remove an element from Stack
		String rem_ele = mystack.remove(2);

		// print the removed elements
		System.out.println("Removed element	: " + rem_ele);	
		
		// print the stack again
		System.out.println("Final Stack: " + mystack);
	}
}
