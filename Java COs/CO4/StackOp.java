import java.util.Scanner;  

class Stack {  
    int size = 5;  
    int arr[] = new int[size];  
    int top = -1;  
	
    void push (){  
        Scanner sc = new Scanner(System.in);  
        if(top == size-1){  
            System.out.println("Overflow !!");  
            
        }  
        else {  
            System.out.println("Enter Value");  
            int val = sc.nextInt();  
            top++;  
            arr[top]=val;  
            System.out.println("Item pushed");  
           
        }  
    }  
    void pop (){  
        if (top == -1){  
            System.out.println("Underflow !!");  
           
        }  
        else {  
            top --;   
            System.out.println("Item popped");  
         
        }  
    }  
    void display (){  
        System.out.println("stack elements are .....");  
        for(int i = top; i>=0;i--){  
            System.out.println(arr[i]);  
        }  
    }  
}  
public class StackOp {  
public static void main(String[] args) {  
    int choice=0;  
    Scanner sc = new Scanner(System.in);  
    Stack s = new Stack();  
    System.out.println("*********Stack operations using array*********\n");  
    System.out.print("------------------------------------------------");  
    while(choice != 4)  
    {  
        System.out.println("\nChose one from the below options...\n");  
        System.out.println("1.Push\n2.Pop\n3.Show\n4.Exit");  
        System.out.println("Enter your choice");        
        choice = sc.nextInt();  
        switch(choice)  
        {  
            case 1:  
            {   
                s.push();  
                break;  
            }  
            case 2:  
            {  
                s.pop();  
                break;  
            }  
            case 3:  
            {  
                s.display();  
                break;  
            }  
            case 4:   
            {  
                System.exit(0);  
                break;   
            }  
            default:  
            {  
                System.out.println("Choose a valid option");  
            }   
        };  
    }  
}  
} 
