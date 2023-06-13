import java.util.Scanner;

class Account {
    int accountNumber;
    String name;
    int balance;

    public Account(int accountNumber, String name, int balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }
}

public class acc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account[] accounts = new Account[6];

        for (int i = 0; i < 6; i++) {
            System.out.println("Enter details for account " + (i + 1) + ":");
            System.out.print("Account Number: ");
            int accountNumber = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Balance: ");
            int balance = scanner.nextInt();

            accounts[i] = new Account(accountNumber, name, balance);
        }

        System.out.println("Accounts with balance less than 500:");
        for (Account account : accounts) {
            if (account.balance < 500) {
                System.out.println(account.accountNumber + " " + account.name + " " + account.balance);
            }
        }
    }
}
