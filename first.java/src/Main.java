import java.util.Scanner;

class balanceError extends Exception {
    balanceError(String message) {
        super(message);
    }
}

class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws balanceError {
        if (amount > balance) {
            throw new balanceError("Insufficient amount");
        } else {
            balance -= amount;
            System.out.println("Withdraw successfully, balance: " + balance);
        }
    }
}

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double amount;
        System.out.print("Enter amount to withdraw: ");
        amount = input.nextDouble();
        Account account = new Account(5000);

        try {
            account.withdraw(amount);
        } catch (balanceError e) {
            System.out.println("Exception: " + e.getMessage());
        }
        input.close();
    }
}
