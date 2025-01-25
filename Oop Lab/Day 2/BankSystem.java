import java.util.Scanner;

class BankAccount {
    private String customer;
    private int accountNo;
    private double balance;

    BankAccount(String x, int y, double z) {
        customer = x;
        accountNo = y;
        balance = z;
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

    public void display() {
        System.out.println("Customer Name: " + customer);
        System.out.println("Account Number: " + accountNo);
        System.out.println("Current Balance: " + balance);
    }
    public void create(){
        System.out.println("Enter the name of the customer:");
        Scanner x=new Scanner(System.in);
        String name=x.nextLine();
        System.out.println("Enter the account number:");
        int account=x.nextInt();
        System.out.println("Enter the balance:");
        double bal=x.nextDouble();
        BankAccount ac = new BankAccount(name, account, bal);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);

        // Create a sample bank account (you can create more accounts as needed)
        BankAccount ac = new BankAccount("Elon Musk", 9995082, 1000.0);
        

        int choice;

        do {
            System.out.println("\nBanking System Menu:");
            System.out.println("1. Display Customer Information");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.err.println("4. Create Account");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = x.nextInt();

            switch(choice) {
                case 1:
                    ac.display();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = x.nextDouble();
                    ac.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = x.nextDouble();
                    ac.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Welcome to the account creation portal.");
                    ac.create();
                    break;
                case 5:
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        x.close();
    }
}



