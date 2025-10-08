import java.util.Scanner;

interface Transactions {
    void deposit(double amount);
    void withdraw(double amount);
    void viewBalance();
    void viewAccountDetails();
}

abstract class Account {
    String acc_name;
    int acc_no;
    double balance;

    Account(String acc_name, int acc_no, double balance) {
        this.acc_name = acc_name;
        this.acc_no = acc_no;
        this.balance = balance;
    }

    abstract void displayDetails();
}

class Bank extends Account implements Transactions {

    Bank(String acc_name, int acc_no, double balance) {
        super(acc_name, acc_no, balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("AMOUNT DEPOSITED SUCCESSFULLY");
    }

    public void withdraw(double amount) {
        if (balance > amount) {
            balance = balance - amount;
            System.out.println(amount + " WITHDRAWN SUCCESSFULLY");
        } else {
            System.out.println("INSUFFICIENT BALANCE");
        }
    }

    public void viewBalance() {
        System.out.println("BALANCE: " + balance);
    }

    public void viewAccountDetails() {
        displayDetails();
    }

    void displayDetails() {
        System.out.println("\n---- BANK DETAILS ----\n");
        System.out.println("ACCOUNT NAME: " + acc_name);
        System.out.println("ACCOUNT NUMBER: " + acc_no);
        System.out.println("BALANCE: " + balance);
    }
}

public class sampleapplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER ACCOUNT NAME:");
        String name = sc.nextLine();

        System.out.println("ENTER ACCOUNT NUMBER:");
        int number = sc.nextInt();

        System.out.println("ENTER INITIAL BALANCE:");
        double balance = sc.nextDouble();

        Bank account = new Bank(name, number, balance);

        int choice;
        do {
            System.out.println("\n------ BANK MENU ------");
            System.out.println("1. DEPOSIT");
            System.out.println("2. WITHDRAW");
            System.out.println("3. VIEW BALANCE");
            System.out.println("4. ACCOUNT DETAILS");
            System.out.println("5. EXIT");
            System.out.print("ENTER YOUR CHOICE: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("ENTER DEPOSIT AMOUNT: ");
                    double amount = sc.nextDouble();
                    account.deposit(amount);
                    break;

                case 2:
                    System.out.print("ENTER WITHDRAW AMOUNT: ");
                    double amount1 = sc.nextDouble();
                    account.withdraw(amount1);
                    break;

                case 3:
                    System.out.println("VIEW BALANCE");
                    account.viewBalance();
                    break;

                case 4:
                    System.out.println("ACCOUNT DETAILS");
                    account.viewAccountDetails();
                    break;

                case 5:
                    System.out.println("EXITING... THANK YOU!");
                    break;

                default:
                    System.out.println("INVALID CHOICE! PLEASE TRY AGAIN.");
                    break;
            }
        } while (choice != 5);

        sc.close();
    }
}
