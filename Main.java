import java.util.*;
class InvalidATMPinException extends Exception {
    public InvalidATMPinException(String message) {
        super(message);
    }
}

class NoCashException extends Exception {
    public NoCashException(String message) {
        super(message);
    }
}

class Account {
    String name;
    double balance;
    int atmPin;

    public Account(String name, double balance, int atmPin) {
        this.name = name;
        this.balance = balance;
        this.atmPin = atmPin;
    }

    public void checkPin(int enteredPin) throws InvalidATMPinException {
        if (enteredPin != atmPin) {
            throw new InvalidATMPinException("Invalid ATM Pin! Please try again.");
        } else {
            System.out.println("Pin verified successfully!");
        }
    }

    public void withdraw(double amount) throws NoCashException {
        if (amount > balance) {
            throw new NoCashException("Insufficient balance in your account!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! Remaining Balance: ₹" + balance);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Account acc = new Account("Pranav", 2000.0, 1234);

        try {
            acc.checkPin(1234);
            acc.withdraw(1500);
            acc.withdraw(1000);
        } 
        catch (InvalidATMPinException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (NoCashException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
