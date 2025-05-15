/*
    Description: QAP 1 - Problem 1 - TestAccount Class
    Author: Joseph Gallant
    Dates: May 15, 2025
 */

public class TestAccount {
    public static void main (String [] args) {
        // Create two accounts
        Account acc1 = new Account("11111", "Account 1", 5000);
        Account acc2 = new Account("22222", "Account 2", 4000);

        // Display the balance of both
        System.out.printf("Account 1 Balance: %d\n", acc1.getBalance());
        System.out.printf("Account 2 Balance: %d\n", acc2.getBalance());

        // Transfer 1000 from Account 1 to Account 2
        acc1.transferTo(acc2, 1000);

        // Display the balance of both after the transfer
        System.out.println("\nNew balances:");
        System.out.printf("Account 1 Balance: %d\n", acc1.getBalance());
        System.out.printf("Account 2 Balance: %d\n", acc2.getBalance());
    }
}
