import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      double radius;
      double area;

        System.out.print("Enter radius of circle: ");
        radius = input.nextDouble();

        area = Math.PI * Math.pow(radius, 2);

        System.out.println("The area of circle is: " + area);

      input.close();
    }
}
