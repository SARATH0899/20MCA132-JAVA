// program to remove all elements from linked List.

import java.util.*;

public class LinkedListQn {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        // Create a LinkedList
        LinkedList<String> myList = new LinkedList<>();

        // Add some elements to the LinkedList
        for(int i=0;i<7;i++){
			int j = i + 1;
		System.out.println("Enter the Element "+ j + " : ");
		String var1 = sc.next();
		myList.add(var1);
		}
		
		// Remove an element from the LinkedList
		String rem = myList.remove(3);
		
		// print the removed elements from LinkedList
		System.out.println("Removed Element : " + rem );
		
		// print the LinkedList after removing index 3
		System.out.println("Elements after removing the prescribed element : " + myList );

        // Remove all elements from the LinkedList
        myList.clear();

        // Print the contents of the LinkedList (should be empty)
        System.out.println("LinkedList after removing all elements: " + myList);
    }
}
