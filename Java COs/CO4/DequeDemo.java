// program to demonstrate the addition and deletion of elements dequeue.

import java.util.*;

public class DequeDemo {

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        // create a deque object
        ArrayDeque<String> mydeque = new ArrayDeque<String>();
        
        // add elements to the deque
		for(int i=0;i<3;i++){
			int j = i + 1;
		System.out.println("Enter the Element "+ j + " : ");
		String var1 = sc.next();
		mydeque.add(var1);
		}
		System.out.println("Enetr the Element to be added first");
		String var2 = sc.next();
		mydeque.addFirst(var2);
		
		System.out.println("Enetr the Element to be added last");
		String var3 = sc.next();
		mydeque.addLast(var3);
		
        
        // print the deque
        System.out.println("Deque: " + mydeque);
        
        // remove elements from the deque
        String removedFirst = mydeque.removeFirst();
        String removedLast = mydeque.removeLast();
        
        // print the deque after removal
        System.out.println("Removed first: " + removedFirst);
        System.out.println("Removed last: " + removedLast);
		System.out.println("Deque after removal: " + mydeque);
    }
}
