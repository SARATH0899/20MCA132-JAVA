// program to demonstrate the create Queue Object using Priority Queue Class.

import java.util.*;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
        // create a empty Priority Queue object
        PriorityQueue<Integer> myqueue = new PriorityQueue<Integer>();
        
        // add elements to the Queue
       for(int i=0;i<5;i++){
			int j = i + 1;
		System.out.println("Enter the Element "+ j + " : ");
		int var1 = sc.nextInt();
		myqueue.add(var1);
		}
        
        // print the Queue
        System.out.println("Queue: " + myqueue);
		
		// print the top element of Priority Queue.
		System.out.println(myqueue.peek());
        
        // remove an element from the Queue
        int removedElement = myqueue.poll();
        System.out.println("Removed element: " + removedElement);
        
        // print the Queue again
        System.out.println("Queue after removal: " + myqueue);
    }
}
