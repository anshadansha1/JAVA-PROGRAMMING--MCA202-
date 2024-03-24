/*PROGRAM 8_6:Create a class ‘Account’ with two overloaded constructors.
 The first constructor is used for initializing the name of account holder, 
 the account number and the initial amount in the account. 
 The second constructor is used for initializing the name of the account holder,
  the account number, the addresses, the type of account and the current balance. 
  The Account class is having methods Deposit (), Withdraw (), and Get_Balance().
   Make the necessary assumption for data members and return types of the methods. Create objects of Account class and use them.  
*/
import java.util.Scanner;

class Account {
    private String accountHolderName;
    private int accountNumber;
    private String address;
    private String accountType;
    private double balance;

    // First constructor
    public Account(String accountHolderName, int accountNumber, double initialAmount) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialAmount;
    }

    // Second constructor
    public Account(String accountHolderName, int accountNumber, String address, String accountType, double currentBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.address = address;
        this.accountType = accountType;
        this.balance = currentBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    // Method to get current balance
    public double getBalance() {
        return balance;
    }
}

public class P8_6_account {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Account objects
        Account account1 = null;
        Account account2 = null;

        // Taking input for account 1
        System.out.println("Enter details for Account 1:");
        System.out.print("Account holder name: ");
        String name1 = scanner.nextLine();
        System.out.print("Account number: ");
        int number1 = scanner.nextInt();
        System.out.print("Initial balance: ");
        double initialBalance1 = scanner.nextDouble();
        account1 = new Account(name1, number1, initialBalance1);

        scanner.nextLine(); // Consume newline character

        // Taking input for account 2
        System.out.println("\nEnter details for Account 2:");
        System.out.print("Account holder name: ");
        String name2 = scanner.nextLine();
        System.out.print("Account number: ");
        int number2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Address: ");
        String address2 = scanner.nextLine();
        System.out.print("Account type: ");
        String type2 = scanner.nextLine();
        System.out.print("Current balance: ");
        double currentBalance2 = scanner.nextDouble();
        account2 = new Account(name2, number2, address2, type2, currentBalance2);

        // Menu-driven loop
        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit to Account 1");
            System.out.println("2. Deposit to Account 2");
            System.out.println("3. Withdraw from Account 1");
            System.out.println("4. Withdraw from Account 2");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (account1 != null) {
                        System.out.println("Enter deposit amount for account 1:");
                        double depositAmount1 = scanner.nextDouble();
                        account1.deposit(depositAmount1);
                    } else {
                        System.out.println("Account 1 not created yet.");
                    }
                    break;
                case 2:
                    if (account2 != null) {
                        System.out.println("Enter deposit amount for account 2:");
                        double depositAmount2 = scanner.nextDouble();
                        account2.deposit(depositAmount2);
                    } else {
                        System.out.println("Account 2 not created yet.");
                    }
                    break;
                case 3:
                    if (account1 != null) {
                        System.out.println("Enter withdrawal amount for account 1:");
                        double withdrawalAmount1 = scanner.nextDouble();
                        account1.withdraw(withdrawalAmount1);
                    } else {
                        System.out.println("Account 1 not created yet.");
                    }
                    break;
                case 4:
                    if (account2 != null) {
                        System.out.println("Enter withdrawal amount for account 2:");
                        double withdrawalAmount2 = scanner.nextDouble();
                        account2.withdraw(withdrawalAmount2);
                    } else {
                        System.out.println("Account 2 not created yet.");
                    }
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }

        scanner.close();
    }
}
