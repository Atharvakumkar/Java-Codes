
import java.util.Scanner;

public class VolumeOfCircle {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);

     double radius;
     double volume;

     System.out.print("Enter the radius of circle: ");
     radius =  input.nextDouble();

     volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
     System.out.print("The volume of circle is: " + volume);


      input.close();
    }
}
