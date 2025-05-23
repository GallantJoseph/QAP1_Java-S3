/*
    Description: QAP 1 - Problem 1 - Account Class
    Author: Joseph Gallant
    Dates: May 15, 2025
 */

public class Account {
    // Private attributes declaration
    private String id;
    private String name;
    private int balance = 0;

    // Constructors
    // Parameterized
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getters
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // Methods
    // Credit an amount to the account and return the new balance
    public int credit (int amount) {
        this.balance += amount;
        return balance;
    }

    // Debit an amount from the account and return the new balance
    public int debit (int amount) {
        if (amount <= balance) {
            this.balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }

        return balance;
    }

    // Transfer an amount from the current account to another account and return the new balance
    public int transferTo(Account anotherAccount, int amount) {
        if (amount <= balance) {
            this.balance -= amount;
            anotherAccount.balance += amount;
        } else {
            System.out.println("Amount exceeded balance");
        }

        return balance;
    }

    // toString method overload. Returns the account information in a string format.
    public String toString() {
        return "Account[id=" + this.id + ",name=" + this.name + ",balance=" + this.balance + "]";
    }
}