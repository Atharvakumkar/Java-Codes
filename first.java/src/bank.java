public class bank {
    String accountHolderName;
    Integer accountNumber;
    double balance;

    public bank(String name, Integer accountNum, double initialBal) {
        accountHolderName = name;
        accountNumber = accountNum;
        balance = initialBal;

    }

    public void deposit(double amount){
        if (amount > 0){
            balance = balance + amount;
            System.out.println(amount + " Deposited!");
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Invalid amount");
        }

    }

    public void withdraw(double amount){
        if (amount > 0) {
            if (amount <= balance) {
                balance = balance - amount;
                System.out.println(amount + " Withdrawed!");
                System.out.println("New balance: " + balance);
            } else {
                System.out.println("Insufficient balance!");
            }
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void details(){
        System.out.println("Account holder name: " + accountHolderName);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    }


