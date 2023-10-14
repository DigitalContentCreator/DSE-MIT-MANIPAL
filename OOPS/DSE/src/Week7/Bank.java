package Week7;

class SavingsAccount {
    private double balance;
    public static double interestRate = 0;

    public SavingsAccount() {
        this.balance = 0;
    }

    static void setInterestRate(double newRate) {
        interestRate = newRate;
    }

    static double getInterestRate() {
        return interestRate;
    }

    double getBalance() {
        return this.balance;
    }

    void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    double withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance = this.balance - amount;
        } else {
            amount = 0;
        }
        return this.balance;
    }

    void addInterest() {
        double interest = this.balance * interestRate;
        this.balance = this.balance + interest;
    }

    static void showBalance(SavingsAccount account) {
        System.out.println("Your balance is " + account.getBalance());
    }
}
