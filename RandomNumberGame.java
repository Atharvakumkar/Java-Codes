import java.util.Scanner;
import java.util.Random;

public class RandomNumberGame {
    public static void main(String[] args){
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int number;
        int attempts = 0;
        int min = 1;
        int max = 50;
        int randomNumber = random.nextInt(min,max+1);

        System.out.println("Guess the random number between " + min + " " + max);

        do{
            System.out.print("Guess the number: ");
            number = input.nextInt();
            attempts++;

            if (number < randomNumber) {
                System.out.println("Too low");
            } else if(number > randomNumber) {
                System.out.println("Too high");
            } else {
                System.out.println("You guessed the correct number!");
                System.out.println("Number of attempts: " + attempts);
            }
        }while(number != randomNumber);

        input.close();
    }
}
