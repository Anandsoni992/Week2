class BankAccount {
    // Static variable shared by all accounts
    static String bankName = "Global Bank"; 
    private static int totalAccounts = 0; // Tracks the total number of accounts

    // Final variable ensures account number cannot be changed
    private final int accountNumber; 
    private String accountHolderName;

    // Constructor to initialize account details using 'this' keyword
    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++; // Increment total accounts count
    }

    // Static method to return the total number of accounts
    static int getTotalAccounts() {
        return totalAccounts;
    }

    // Display account details, checking if the object is an instance of BankAccount
    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating BankAccount objects
        BankAccount acc1 = new BankAccount("Alice", 101);
        BankAccount acc2 = new BankAccount("Bob", 102);

        // Displaying account details
        acc1.displayDetails();
        acc2.displayDetails();

        // Display total accounts
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}
