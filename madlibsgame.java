//Mad Libs game using Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String adj1;
        String adj2;
        String adj3;
        String verb;
        String noun;

        System.out.println("Enter an adjective (revealing): ");
        adj1 = input.nextLine();
        System.out.println("Enter an adjective (characteristic): ");
        adj2 = input.nextLine();
        System.out.println("Enter an adjective (state): ");
        adj3 = input.nextLine();
        System.out.println("Enter a verb: ");
        verb = input.nextLine();
        System.out.println("Enter a noun: ");
        noun = input.nextLine();

        System.out.println("Today, I went to " + adj1 + " palace.");
        System.out.println("In that palace, I saw " + noun);
        System.out.println(noun + " was " + adj2 + " and " + adj3);
        System.out.println("I became " + verb + " after seeing the " + noun);


        input.close();

    }
}
