import java.util.Scanner;

class Item {
    int itemNo;
    String name;
    int cost;

    public Item(int itemNo, String name, int cost) {
        this.itemNo = itemNo;
        this.name = name;
        this.cost = cost;
    }
}

public class item2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Item[] items = new Item[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter details for item " + (i + 1) + ":");
            System.out.print("Item No.: ");
            int itemNo = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Cost: ");
            int cost = scanner.nextInt();

            items[i] = new Item(itemNo, name, cost);
        }

        System.out.println("Items with cost greater than 5000:");
        for (Item item : items) {
            if (item.cost > 5000) {
                System.out.println(item.itemNo + " " + item.name + " " + item.cost);
            }
        }
    }
}
