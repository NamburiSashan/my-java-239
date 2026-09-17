class Account {

    protected int accountNumber;
    protected String accountHolderName;
    protected double balance;
    protected String accountType;

    // Constructor
    Account(int accountNumber, String accountHolderName,
            double balance, String accountType) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Deposit
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Transfer
    void transfer(Account receiver, double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            receiver.balance = receiver.balance + amount;

            System.out.println("Transferred: " + amount);
        } else {
            System.out.println("Transfer failed.");
        }
    }

    // Display details
    void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : " + balance);
    }
}


// Savings Account
class SavingsAccount extends Account {

    double interestRate;

    // Constructor
    SavingsAccount(int accountNumber, String accountHolderName,
                   double balance, double interestRate) {

        super(accountNumber, accountHolderName, balance, "Savings");
        this.interestRate = interestRate;
    }

    // Calculate interest
    void calculateInterest() {

        double interest = balance * interestRate / 100;

        balance = balance + interest;

        System.out.println("Interest Added: " + interest);
    }
}


// Current Account
class CurrentAccount extends Account {

    double overdraftLimit;

    // Constructor
    CurrentAccount(int accountNumber, String accountHolderName,
                   double balance, double overdraftLimit) {

        super(accountNumber, accountHolderName, balance, "Current");
        this.overdraftLimit = overdraftLimit;
    }

    // Method overriding
    @Override
    void withdraw(double amount) {

        if (amount > 0 && amount <= balance + overdraftLimit) {

            balance = balance - amount;

            System.out.println("Withdrawn: " + amount);

        } else {

            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }
}


// Main Class matching Upi.java filename
public class Upi {

    public static void main(String[] args) {

        // Creating objects
        SavingsAccount savings =
                new SavingsAccount(101, "Sashank", 10000, 5);

        CurrentAccount current =
                new CurrentAccount(102, "Rahul", 5000, 3000);


        // Before transactions
        System.out.println("===== BEFORE TRANSACTIONS =====");

        System.out.println("\nSavings Account");
        savings.displayAccountDetails();

        System.out.println("\nCurrent Account");
        current.displayAccountDetails();


        // Deposit
        System.out.println("\n===== DEPOSIT =====");
        savings.deposit(2000);


        // Withdrawal
        System.out.println("\n===== WITHDRAWAL =====");
        savings.withdraw(1000);


        // Interest
        System.out.println("\n===== INTEREST CALCULATION =====");
        savings.calculateInterest();


        // Current account withdrawal
        System.out.println("\n===== CURRENT ACCOUNT WITHDRAWAL =====");
        current.withdraw(7000);


        // Transfer
        System.out.println("\n===== FUND TRANSFER =====");
        savings.transfer(current, 3000);


        // After transactions
        System.out.println("\n===== AFTER TRANSACTIONS =====");

        System.out.println("\nSavings Account");
        savings.displayAccountDetails();

        System.out.println("\nCurrent Account");
        current.displayAccountDetails();


        // Final balance
        System.out.println("\n===== FINAL BALANCES =====");

        System.out.println(
                "Savings Account Balance : " + savings.balance);

        System.out.println(
                "Current Account Balance : " + current.balance);
    }
}
