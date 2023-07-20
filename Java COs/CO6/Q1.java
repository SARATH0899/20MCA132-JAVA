import java.io.File;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the directory path: ");
        String directoryPath = scanner.nextLine();

        File directory = new File(directoryPath);
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory path.");
            return;
        }

        System.out.println("Subdirectories and files in the given directory:");
        File[] files = directory.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }

        System.out.print("Enter the file name to search: ");
        String searchFileName = scanner.nextLine();

        boolean found = false;
        for (File file : files) {
            if (file.getName().equals(searchFileName)) {
                System.out.println("File found: " + file.getAbsolutePath());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("File not found.");
        }
    }
}
