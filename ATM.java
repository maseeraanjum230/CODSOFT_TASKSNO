

import java.util.Scanner;

public class ATM {

    private static class BankAccount {
        private double balance;

        public void deposit(double amount) {
            balance += amount;
        }

        public double checkBalance() {
            return balance;
        }

        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Insufficient balance.");
            }
        }
    }

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            BankAccount account = new BankAccount();
            account.deposit(5000);

            int choice;

            do {

                System.out.println("\n===== WELCOME TO ATM =====");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");

                System.out.print("Enter your choice: ");
                choice = input.nextInt();

                switch (choice) {
                    case 1 -> System.out.println("Your current balance is: Rs. "
                            + account.checkBalance());
                    case 2 -> {
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = input.nextDouble();
                        account.deposit(depositAmount);
                    }
                    case 3 -> {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = input.nextDouble();
                        account.withdraw(withdrawAmount);
                    }
                    case 4 -> System.out.println("Thank you for using our ATM!");
                    default -> System.out.println("Invalid choice! Please try again.");
                }

            } while (choice != 4);
        }
    }
}
