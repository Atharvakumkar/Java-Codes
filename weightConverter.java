import java.sql.SQLOutput;
import java.util.Scanner;

public class weightConverter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program!");
        System.out.println("1. Convert kgs to lbs");
        System.out.println("2. Convert lbs to kgs");
        System.out.print("Enter your choice(1/2): ");
        choice = input.nextInt();

        if(choice == 1){
            System.out.print("Enter your weight in kgs: ");
            weight = input.nextDouble();

            newWeight = weight * 0.453592;

            System.out.printf("Your weight in lbs is %.2f lbs", newWeight);
        } else if (choice == 2) {
            System.out.print("Enter your weight in lbs: ");
            weight = input.nextDouble();

            newWeight = weight * 2.20462;

            System.out.printf("Your weight in kgs is %.2f kgs", newWeight);

        } else {
            System.out.println("Please enter valid choice!");
        }

        input.close();
    }
}
