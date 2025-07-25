

import java.util.Scanner;

public class ATMInterface {
    static int balance = 10000;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int pin = 1234;

            System.out.println("Welcome to the ATM!");

            System.out.print("Enter your 4-digit PIN: ");
            int enteredPin = sc.nextInt();

            if (enteredPin != pin) {
                System.out.println("Invalid PIN. Exiting...");
                return;
            }

            while (true) {
                System.out.println("\nATM Menu:");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Your balance is: INR " + balance);
                        break;
                    case 2:
                        System.out.print("Enter deposit amount: INR ");
                        int deposit = sc.nextInt();
                        balance += deposit;
                        System.out.println("INR " + deposit + " deposited successfully.");
                        break;
                    case 3:
                        System.out.print("Enter withdrawal amount: INR ");
                        int withdraw = sc.nextInt();
                        if (withdraw <= balance) {
                            balance -= withdraw;
                            System.out.println("INR " + withdraw + " withdrawn successfully.");
                        } else {
                            System.out.println("Insufficient balance.");
                        }
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }
}
