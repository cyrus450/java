package bankmanagement;

class BankAccount {
    private String accountHolder;
    private String accountType;
    private double balance;

    private static int totalAccounts = 0;

    // c1
    BankAccount(String name) {
        this(name, 0, "savings");
    }
    // c2
    BankAccount(String name, double deposit) {
        this(name, deposit, "savings");
    }
    // c3
    BankAccount(String name, double deposit, String type) {
        this.accountHolder = name;
        this.accountType = type;
        this.balance = deposit;
        totalAccounts++;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current balance: " + balance);
    }
    void withdraw(double amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current balance: " + balance);
        }

    void displayAccount() {
        System.out.println("Account details");
        System.out.println("Name: " + accountHolder);
        System.out.println("Type: " + accountType);
        System.out.println("Balance: " + balance);
    }

    static void showTotalAccounts() {
        System.out.println("Total accounts: " + totalAccounts);
    }
}	