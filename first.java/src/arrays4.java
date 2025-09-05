import java.util.Scanner;
public class arrays4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int userChoice;
        int[] bookID = {101, 102, 103, 104, 105};

        System.out.println("Enter book ID: ");
        userChoice = input.nextInt();

        for(int i = 0; i < bookID.length ; i++){
            if (userChoice == bookID[i]){
                System.out.println("Book is available");
            } else {
                System.out.println("Book is unavailable");
            }
        }
        input.close();

    }
}
