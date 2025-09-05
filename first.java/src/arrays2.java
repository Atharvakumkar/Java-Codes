import java.util.Scanner;

public class arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = 3;
        int[] arr = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            System.out.print("Enter number:");
            arr[i] = sc.nextInt();
        }

        int arrMax = arr[0];
        for (int j = 1; j < arrSize; j++){
            if(arrMax < arr[j]) {
                arrMax = arr[j];
            }
        }
        System.out.println(arrMax + " is the max number you've entered.");

        }
    }

