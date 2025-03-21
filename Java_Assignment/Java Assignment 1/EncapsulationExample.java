class BankAccount {
    // Private variables (data hiding)
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter method to access private variable
    public double getBalance() {
        return balance;
    }

    // Setter method to modify private variable
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method with validation
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        // Creating an object of BankAccount
        BankAccount myAccount = new BankAccount("John Doe", 5000.00);

        // Accessing data using methods 
        System.out.println("Initial Balance: " + myAccount.getBalance());

        myAccount.deposit(1000); // Depositing money
        System.out.println("Updated Balance: " + myAccount.getBalance());

        myAccount.withdraw(2000); // Withdrawing money
        System.out.println("Final Balance: " + myAccount.getBalance());
    }
}
