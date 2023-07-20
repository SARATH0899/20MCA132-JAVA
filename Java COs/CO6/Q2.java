import java.io.*;

public class Q2 {
    public static void main(String[] args) {
        try {
            // Write to file
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, this is a text written to the file.\n");
            writer.write("You can write multiple lines using FileWriter.\n");
            writer.close();
            System.out.println("Data written to the file successfully.");

            // Read from file and display on console
            FileReader reader = new FileReader("output.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            System.out.println("Contents of the file:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
