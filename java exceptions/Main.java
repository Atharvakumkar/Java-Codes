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
        Account account = new Account(5000);

        try {
            account.withdraw(3000);
        } catch (balanceError e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
