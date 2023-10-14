package Week7;

class Account {
    String customerName;
    int accountNumber;
    String accountType;
    double balance;

    public Account(String customerName, int accountNumber, String accountType, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful.");
    }

    public void displayBalance() {
        System.out.println("Your current balance is: " + balance);
    }

    public void calculateInterest() {
        // Implement interest calculation based on the account type
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful.");
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    public void checkMinimumBalance() {
        // Implement checking for minimum balance and impose penalty if necessary
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(String customerName, int accountNumber, String accountType, double balance) {
        super(customerName, accountNumber, accountType, balance);
    }

    @Override
    public void checkMinimumBalance() {
        // Implement checking for minimum balance and impose penalty if necessary for current account
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String customerName, int accountNumber, String accountType, double balance) {
        super(customerName, accountNumber, accountType, balance);
    }

    @Override
    public void checkMinimumBalance() {
        // Implement checking for minimum balance and impose penalty if necessary for savings account
    }

    @Override
    public void calculateInterest() {
        // Implement interest calculation for savings account
    }
}

public class Main {
    public static void main(String[] args) {
        Account currentAccount = new CurrentAccount("John Doe", 123456789, "Current", 5000.0);
        currentAccount.deposit(1000.0);
        currentAccount.displayBalance();
        currentAccount.withdraw(2000.0);
        currentAccount.displayBalance();

        Account savingsAccount = new SavingsAccount("Jane Doe", 987654321, "Savings", 10000.0);
        savingsAccount.deposit(2000.0);
        savingsAccount.displayBalance();
    }
}
