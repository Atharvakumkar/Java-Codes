import java.util.Scanner;

public class bankingProgram {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double balance = 1000;
        int choice;
        boolean isWorking = true;

        while (isWorking) {
            System.out.println("-----------------------------------");
            System.out.println("Hello, welcome to the bank!");
            System.out.println("Select your choice:");
            System.out.println("1) Show balance");
            System.out.println("2) Deposit amount");
            System.out.println("3) Withdraw amount");
            System.out.println("4) Exit");
            System.out.print("Enter your choice: ");
            choice = (int) input.nextDouble();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += depositMoney();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isWorking = false;
                default -> System.out.println("Invalid input");
            }
        }
        System.out.println("Thank you!");
    }

    static void showBalance(double balance) {
        System.out.println("Your balance: " + balance);
    }

    static double depositMoney() {
        double amount;
        System.out.print("Enter amount to be deposited: ");
        amount = input.nextDouble();

        if (amount < 0) {
            System.out.println("Amount cannot be negative!");
            return 0;
        } else {
            return amount;
        }
    }

    static double withdraw(double balance){
        double amount;
        System.out.print("Enter amount to be withdrawn: ");
        amount = input.nextDouble();

        if(amount > balance){
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
}
