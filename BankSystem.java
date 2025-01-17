import java.util.Scanner;

class BankAccount {
    private String customer;
    private int accountNumber;
    private double balance;

    BankAccount(String x, int y, double z) {
        this.customer = x;
        this.accountNumber = y;
        this.balance = z;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount " + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount " + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);

        // Create a sample bank account (you can create more accounts as needed)
        BankAccount account = new BankAccount("John Doe", 12345, 1000.0);

        int choice;

        do {
            System.out.println("\nBanking System Menu:");
            System.out.println("1. Display Customer Information");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = x.nextInt();

            switch(choice) {
                case 1:
                    account.displayCustomerInfo();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = x.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = x.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        x.close();
    }
}