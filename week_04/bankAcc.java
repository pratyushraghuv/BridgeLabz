package week_04;

public class bankAcc {
    private static String bankName = "State Bank of India"; 
    private static int totalAccounts = 0;  
    private final String accountNumber;  
    private String accountHolderName;
    private double balance;

    public bankAcc(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total number of accounts: " + totalAccounts);
    }

    public void displayAccountDetails() {
        if (this instanceof bankAcc) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balance);
        } else {
            System.out.println("Invalid account instance.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.err.println("Insufficient balance or invalid amount.");
        }
    }

    public static void main(String[] args) {
        bankAcc account1 = new bankAcc("Lynda Princy", "ACC12345", 1000.00);
       bankAcc account2 = new bankAcc("Prince Danish", "ACC67890", 500.00);

        System.out.println("\nAccount 1 Details:");
        account1.displayAccountDetails();

        System.out.println("\nAccount 2 Details:");
        account2.displayAccountDetails();

        bankAcc.getTotalAccounts();

        System.out.println("\nPerforming transactions on Account 1:");
        account1.deposit(200);
        account1.withdraw(150);
        account1.displayAccountDetails();

        System.out.println("\nPerforming transactions on Account 2:");
        account2.deposit(100);
        account2.withdraw(800);
        account2.displayAccountDetails();
    }
}