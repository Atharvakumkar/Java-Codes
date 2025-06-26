import java.util.Scanner;

public class tempConv {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double temp;
        double newTemp;
        char choice;

        System.out.println("Temperature conversion program!");
        System.out.println("Enter 'C' to convert Degree Fahrenheit to Degree Celsius");
        System.out.println("Enter 'F' to convert Degree Celsius to Degree Fahrenheit");
        System.out.print("Enter your choice: ");
        choice = input.next().charAt(0);

        if(choice == 'f' || choice == 'F'){
            System.out.print("Enter temperature in Degree Fahrenheit: ");
            temp = input.nextDouble();

            newTemp = (temp - 32)/1.8;
            System.out.printf("The temperature Degree %.2f Celsius in Degree Fahrenheit is %.2f", temp, newTemp);
        } else if(choice == 'c' || choice == 'C'){
            System.out.print("Enter temperature in Degree Celsius: ");
            temp = input.nextDouble();

            newTemp = (temp * 1.8) + 32.0;
            System.out.printf("The temperature Degree %.2f Fahrenheit in Degree Celsius is %.2f", temp, newTemp);
        } else {
            System.out.println("Please enter a valid choice!");
        }

        input.close();

    }
}
