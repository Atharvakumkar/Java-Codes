import java.util.Scanner;

public class arrays {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int arrSize = 3;
        int arrSum = 0;
        int[] arr = new int[arrSize];

        for(int i = 0; i < arrSize; i++) {
            System.out.print("Enter value to insert in array: ");
            arr[i] = input.nextInt();
            arrSum += arr[i];
        }

        System.out.println(arrSum);

        input.close();
    }
}
