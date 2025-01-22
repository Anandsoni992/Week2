import java.util.ArrayList;

// Account class
class Account {
    private String accountNumber;
    private double balance;

    // Constructor to initialize account details
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to get account balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    // Method to display account details
    public String getAccountDetails() {
        return "Account Number: " + accountNumber + ", Balance: " + balance;
    }
}

// Customer class
class Customer {
    private String name;
    private ArrayList<Account> accounts;

    // Constructor to initialize customer details
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Method to add an account
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Method to view all accounts
    public void viewAccounts() {
        System.out.println("\nAccounts for Customer: " + name);
        for (Account account : accounts) {
            System.out.println(account.getAccountDetails());
        }
    }
}

// Bank class
class Bank {
    private String name;
    private ArrayList<Customer> customers;

    // Constructor to initialize bank details
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // Method to open an account for a customer
    public void openAccount(Customer customer, Account account) {
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        customer.addAccount(account);
        System.out.println("Account opened for Customer: " + customer + " in Bank: " + name);
    }

    // Method to display all customers in the bank
    public void displayCustomers() {
        System.out.println("\nCustomers in Bank: " + name);
        for (Customer customer : customers) {
            customer.viewAccounts();
        }
    }
}

public class BankAccountsMain{
    public static void main(String[] args) {
        // Creating Bank object
        Bank bank = new Bank("Global Bank");

        // Creating Customer objects
        Customer customer1 = new Customer("Anand");
        Customer customer2 = new Customer("Anshika");

        // Creating Account objects
        Account account1 = new Account("123456", 1000.0);
        Account account2 = new Account("654321", 2000.0);
        Account account3 = new Account("112233", 1500.0);

        // Associating accounts with customers in the bank
        bank.openAccount(customer1, account1);
        bank.openAccount(customer1, account2);
        bank.openAccount(customer2, account3);

        // Viewing accounts of all customers
        bank.displayCustomers();

        // Performing transactions
        account1.deposit(500.0);
        account1.withdraw(300.0);

        // Viewing updated balances
        customer1.viewAccounts();
    }
}
