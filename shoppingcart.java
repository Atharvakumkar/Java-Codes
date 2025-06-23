import java.util.Scanner;

public class Main {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      String item;
      int quantity;
      double price;
      double bill;

      System.out.print("What would you like to buy? ");
      item = input.nextLine();

      System.out.print("What's the price? ");
      price = input.nextDouble();

      System.out.print("How much? ");
      quantity = input.nextInt();

      bill = price * quantity;

      System.out.println("Your bill -->");
      System.out.println("Item bought: " + item );
      System.out.println("Quantity: " + quantity);
      System.out.println("Price: " + price + "/-");
      System.out.println("Total amount: " + bill + "/-");


      input.close();
    }
}
