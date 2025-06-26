import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int principal;
        int years;
        double interest;

        System.out.print("Enter the principal amount: ");
        principal = input.nextInt();

        System.out.print("Enter the number of years: ");
        years = input.nextInt();

        System.out.print("Enter the interest %: ");
        interest = input.nextDouble();

        double simple_interest = (principal * years * interest) / 100;
        double final_amt = principal + simple_interest;

        System.out.println("The simple interest is: " + simple_interest +"/-");
        System.out.println("The final amount to pay is: " + final_amt + "/-");

        input.close();
    }
}
