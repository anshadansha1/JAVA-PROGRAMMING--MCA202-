/*PROGRAM 10_5 : Write a java program showing a typical invocation of banking operations via multiple threads. 
Create three threads and 2 methods deposit and withdraw methods to add the amount to the account and withdraw an amount
 from the account respectively.
 As the threads concurrently run the method, avoid the unpredictable behavior. (Use synchronization). */

import java.util.Scanner;

class BankAccount {
    private int balance;
    public BankAccount(int initialBalance) {
        balance = initialBalance;
    }

    // Synchronized method to deposit amount into the account
    public synchronized void deposit(int amount) {
        System.out.println(Thread.currentThread().getName() + " is depositing $" + amount);
        balance += amount;
        System.out.println("New balance after deposit by " + Thread.currentThread().getName() + ": $" + balance);
    }

    // Synchronized method to withdraw amount from the account
    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " is withdrawing $" + amount);
        if (balance >= amount) {
            balance -= amount;
            System.out.println("New balance after withdrawal by " + Thread.currentThread().getName() + ": $" + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal by " + Thread.currentThread().getName());
        }
    }
}
public class P10_5_banking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter initial balance: ");
        int initialBalance = scanner.nextInt(); 

        // Creating a bank account with initial balance entered by the user
        BankAccount account = new BankAccount(initialBalance);

        System.out.print("Enter deposit amount: ");
        int depositAmount = scanner.nextInt();
        System.out.print("Enter withdrawal amount: ");
        int withdrawalAmount = scanner.nextInt();
        scanner.close();

        // Creating three threads performing deposit and withdrawal operations
        Thread thread1 = new Thread(() -> {
            account.deposit(depositAmount);
        }, "Thread-1");

        Thread thread2 = new Thread(() -> {
            account.withdraw(withdrawalAmount);
        }, "Thread-2");

        Thread thread3 = new Thread(() -> {
            account.deposit(depositAmount);
        }, "Thread-3");

        // Starting all threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}