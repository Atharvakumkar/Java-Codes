//Java code to find area
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double height = 0;
        double width = 0;
        double area = 0;

       Scanner input = new Scanner(System.in);

       System.out.print("Enter height: ");
       height = input.nextDouble();

       System.out.print("Enter width: ");
       width = input.nextDouble();

       area = height * width;

       System.out.println("The area is " + area + " sq/cm");

       input.close();

    }
}
