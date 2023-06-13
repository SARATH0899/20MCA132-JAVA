class BankAccount {
   String accountNo;
   String accountType;
   double balance;
   
   BankAccount(String accNo, String accType, double bal) {
      accountNo = accNo;
      accountType = accType;
      balance = bal;
   }
   
   void display() {
      System.out.println("Account Number: " + accountNo);
      System.out.println("Account Type: " + accountType);
      System.out.println("Balance: " + balance);
   }
}

class SavingsAccount extends BankAccount {
   double interestRate;
   
   SavingsAccount(String accNo, String accType, double bal, double intRate) {
      super(accNo, accType, bal);
      interestRate = intRate;
   }
   
   void display() {
      super.display();
      System.out.println("Interest Rate: " + interestRate);
   }
}

class CurrentAccount extends BankAccount {
   double overdraftLimit;
   
   CurrentAccount(String accNo, String accType, double bal, double odLimit) {
      super(accNo, accType, bal);
      overdraftLimit = odLimit;
   }
   
   void display() {
      super.display();
      System.out.println("Overdraft Limit: " + overdraftLimit);
   }
}

class bank {
   public static void main(String[] args) {
      SavingsAccount sa = new SavingsAccount("123456", "Savings", 5000.0, 4.0);
      CurrentAccount ca = new CurrentAccount("789012", "Current", 10000.0, 20000.0);
      
      sa.display();
      System.out.println();
      ca.display();
   }
}
