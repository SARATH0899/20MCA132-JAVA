import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {
    public static void main(String[] args) {
        // Create an ArrayList to store strings
        ArrayList<String> myList = new ArrayList<>();
        
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter strings to add to the list
        System.out.println("Enter strings to add to the list (enter 'done' to finish):");
        
        // Read input from the user and add it to the list until they enter 'done'
        String input = scanner.nextLine();
        while (!input.equals("done")) {
            myList.add(input);
            input = scanner.nextLine();
        }
        
        // Print the list to the console
        System.out.println("List contents:");
        for (String element : myList) {
            System.out.println(element);
        }
        
        // Remove an element from the list
        System.out.println("Enter an element to remove:");
        String toRemove = scanner.nextLine();
        myList.remove(toRemove);
        
        // Print the updated list to the console
        System.out.println("Updated list contents:");
        for (String element : myList) {
            System.out.println(element);
        }
        
        // Check if an element is in the list
        System.out.println("Enter an element to check for:");
        String toCheck = scanner.nextLine();
        boolean containsElement = myList.contains(toCheck);
        if (containsElement) {
            System.out.println("The list contains " + toCheck);
        } else {
            System.out.println("The list does not contain " + toCheck);
        }
    }
}
