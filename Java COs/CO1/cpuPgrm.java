import java.util.*;

public class cpuPgrm {
    int price;

    class Processor {
        int numCores;
        String manufacturer;

        Processor(int numCores, String manufacturer) {
            this.numCores = numCores;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("Processor information: ");
            System.out.println("Number of cores: " + numCores);
            System.out.println("Manufacturer: " + manufacturer);
			System.out.println(" ");
        }
    }

    static class RAM {
        int memory;
        String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        void display() {
            System.out.println("RAM information: ");
            System.out.println("Memory: " + memory);
            System.out.println("Manufacturer: " + manufacturer);
			System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cpuPgrm cpu = new cpuPgrm();
        System.out.print("Enter CPU price: ");
        cpu.price = sc.nextInt();

        System.out.print("Enter number of processor cores: ");
        int numCores = sc.nextInt();
        System.out.print("Enter processor manufacturer: ");
        String processorManufacturer = sc.next();
		System.out.println(" ");
        cpuPgrm.Processor processor = cpu.new Processor(numCores, processorManufacturer);
        processor.display();

        System.out.print("Enter RAM memory: ");
        int ramMemory = sc.nextInt();
        System.out.print("Enter RAM manufacturer: ");
        String ramManufacturer = sc.next();
		System.out.println(" ");
        cpuPgrm.RAM ram = new cpuPgrm.RAM(ramMemory, ramManufacturer);
        ram.display();
    }
}
