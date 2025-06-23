import java.util.Scanner;

public class Main {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      double side1;
      double side2;
      double hyp;

        System.out.print("Enter side 1: ");
        side1 = input.nextDouble();

        System.out.print("Enter side 2: ");
        side2 = input.nextDouble();

        hyp = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

        System.out.println("The Hypotenuse of triangle is: " + hyp);

      input.close();
    }
}
